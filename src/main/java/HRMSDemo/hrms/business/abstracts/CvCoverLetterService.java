package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvCoverLetter;

import java.util.List;

public interface CvCoverLetterService {
    DataResult<List<CvCoverLetter>> getAll();
    DataResult<CvCoverLetter> getByEmployee_id(int employeeId);
    Result add(CvCoverLetter cvCoverLetter);
}
