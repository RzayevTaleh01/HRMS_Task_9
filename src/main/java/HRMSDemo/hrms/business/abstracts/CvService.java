package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.entities.dtos.CvDto;

public interface CvService {
    DataResult<CvDto> getByEmployee_Id(int employeeId) ;

}
