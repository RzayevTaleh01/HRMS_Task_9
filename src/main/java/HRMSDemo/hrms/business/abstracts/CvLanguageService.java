package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvLanguage;

import java.util.List;

public interface CvLanguageService {
    DataResult<List<CvLanguage>> getAll();
    Result add(CvLanguage cvLanguage);
}
