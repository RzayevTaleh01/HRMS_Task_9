package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvPrgSkills;
import HRMSDemo.hrms.entities.concretes.CvSchools;

import java.util.List;

public interface CvPrgSkillsService {
    DataResult<List<CvPrgSkills>> getAll();
    Result add(CvPrgSkills cvPrgSkills);
    DataResult<List<CvPrgSkills>> getByEmployee_Id(int employeeId);
}
