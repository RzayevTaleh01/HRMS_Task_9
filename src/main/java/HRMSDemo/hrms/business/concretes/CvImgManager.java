package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.CvImgService;
import HRMSDemo.hrms.core.adapters.Cloudinary.CloudinaryService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.CvImgDao;
import HRMSDemo.hrms.entities.concretes.CvImg;
import HRMSDemo.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class CvImgManager implements CvImgService {

    private CvImgDao cvImgDao;
    private CloudinaryService cloudinaryService;

    @Autowired
    public CvImgManager(CvImgDao cvImgDao, CloudinaryService cloudinaryService) {
        super();
        this.cvImgDao = cvImgDao;
        this.cloudinaryService = cloudinaryService;
    }

    @Override
    public DataResult<CvImg> getByEmployee_Id(int employeeId) {
        return new SuccessDataResult<CvImg>
                (this.cvImgDao.getByEmployee_Id(employeeId),"Data geldi");
    }

    @Override
    public Result addPhoto(MultipartFile file, int employeeId) {

        @SuppressWarnings("unchecked")
        Map<String, String> uploader = (Map<String, String>)cloudinaryService.save(file).getData();
        String imageUrl= uploader.get("url");
        CvImg cvImg = cvImgDao.getByEmployee_Id(employeeId);
        cvImg.setImgUrl(imageUrl);
        cvImgDao.save(cvImg);
        return new SuccessResult("Photo added");

    }

    @Override
    public Result deletePhoto(MultipartFile file, int userId) {
        return null;
    }

    @Override
    public void photoTableSetter(Employee employee) {
        CvImg cvImg = new CvImg();
        cvImg.setEmployee(employee);
        cvImgDao.save(cvImg);
    }

}
