package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvImg;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CvImgService {
    Result add(MultipartFile file, CvImg image);
    DataResult<List<CvImg>> getByEmployee_Id(int employeeId);
}
