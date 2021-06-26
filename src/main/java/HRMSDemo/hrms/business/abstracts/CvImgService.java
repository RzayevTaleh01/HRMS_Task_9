package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvImg;
import HRMSDemo.hrms.entities.concretes.Employee;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CvImgService {
    DataResult<CvImg> getByEmployee_Id(int employeeId);
    Result addPhoto(MultipartFile file, int employeeId);
    Result deletePhoto(MultipartFile file, int employeeId);
    public void photoTableSetter(Employee employee);
}
