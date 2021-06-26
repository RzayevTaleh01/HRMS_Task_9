package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvExperience;

import java.util.List;

public interface CvExperienceService {
    DataResult<List<CvExperience>> getAll();
    Result add(CvExperience cvExperience);
}
