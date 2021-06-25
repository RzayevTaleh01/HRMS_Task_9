package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.CvImgService;
import HRMSDemo.hrms.core.adapters.CloudinaryService.CloudinaryService;
import HRMSDemo.hrms.core.utilities.results.*;
import HRMSDemo.hrms.dataAccess.abstracts.CvImgDao;
import HRMSDemo.hrms.entities.concretes.CvImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class CvImgManager implements CvImgService {
    private CvImgDao cvImgDao;
    private CloudinaryService cloudinaryService;

    @Autowired
    public CvImgManager(CvImgDao cvImgDao) {
        super();
        this.cvImgDao=cvImgDao;
        this.cloudinaryService = cloudinaryService;
    }



    @Override
    public Result add(MultipartFile file, CvImg image) {
        
        Map<String,String> getImage = (Map<String,String>)cloudinaryService.upload(file).getData();
        image.setImgUrl(getImage.get("url"));
        image.setUploadedDate(LocalDate.now());
        var result = this.cvImgDao.save(image);
        if(result != null) {
            return new SuccessResult("Başarılı");
        }
        return new ErrorResult("İşlem yapılamıyor");    }




   @Override
   public DataResult<List<CvImg>> getByEmployee_Id(int employeeId) {
        var result = this.cvImgDao.getByEmployee_Id(employeeId);
        if (result != null) {
            return new SuccessDataResult<List<CvImg>>(this.cvImgDao.getByEmployee_Id(employeeId),"Başarılı");
        }
       return new ErrorDataResult<List<CvImg>>("İşlem yapılamıyor");
   }

}