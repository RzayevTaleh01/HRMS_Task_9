package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.core.adapters.Cloudinary.CloudService;
import HRMSDemo.hrms.business.abstracts.CvImgService;
import HRMSDemo.hrms.business.abstracts.EmployeeService;
import HRMSDemo.hrms.core.utilities.results.*;
import HRMSDemo.hrms.dataAccess.abstracts.CvImgDao;
import HRMSDemo.hrms.entities.concretes.CvImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
    public class CvImgManager implements CvImgService {
        private CvImgDao cvImgDao;
        private CloudService cloudService;
        private EmployeeService employeeService;

    @Autowired
    public CvImgManager(CvImgDao cvImgDao, CloudService cloudService, EmployeeService employeeService) {
        this.cvImgDao = cvImgDao;
        this.cloudService = cloudService;
        this.employeeService = employeeService;
    }



        @Override
        public Result add(MultipartFile photoFile, int employeeId) {
            var cvImgByEmployeeId = cvImgDao.getByEmployee_Id(employeeId);
            if (cvImgByEmployeeId == null) return new ErrorResult("Employee Is Null");
            var result = this.cloudService.upload(photoFile);
            if(!result.isSuccess()) {
                return new ErrorResult();
            }
            CvImg photo = new CvImg();
            photo.setEmployee(employeeService.getById(employeeId).getData());
            photo.setImgLink(result.getData().get("url"));
            photo.setUploadedDate(result.getData().get("created_at"));
            this.cvImgDao.save(photo);
            return new SuccessResult("Photo added");

        }

        @Override
        public Result delete(int id) {
            var image = cvImgDao.getByCvImgId(id);
            this.cvImgDao.delete(image);
            return new SuccessResult("Photo deleted");

        }

        @Override
        public DataResult<CvImg> getByEmployee_Id(int id) {
            return new SuccessDataResult<>(cvImgDao.getByEmployee_Id(id));
        }

        @Override
        public DataResult<CvImg> getByCvImgId(int id) {
            return new SuccessDataResult<>(cvImgDao.getByCvImgId(id));
        }
    }
