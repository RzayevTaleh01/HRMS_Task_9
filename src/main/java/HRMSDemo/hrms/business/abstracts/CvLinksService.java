package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvLinks;

import java.util.List;

public interface CvLinksService {
    DataResult<List<CvLinks>> getAll();
    Result add(CvLinks cvLinks);
}
