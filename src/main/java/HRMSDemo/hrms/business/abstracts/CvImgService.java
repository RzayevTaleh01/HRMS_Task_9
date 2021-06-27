package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvImg;
import org.springframework.web.multipart.MultipartFile;

public interface CvImgService {
    Result add(MultipartFile photoFile, int employeeId);
    Result delete(int id);
    DataResult<CvImg> getByEmployee_Id(int employeeId);
    DataResult<CvImg> getByCvImgId(int id);
}
