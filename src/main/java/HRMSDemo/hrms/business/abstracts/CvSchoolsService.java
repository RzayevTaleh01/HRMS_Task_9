package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvSchools;

import java.util.List;

public interface CvSchoolsService {
    DataResult<List<CvSchools>> getAll();
    Result add(CvSchools cvSchools);
}
