package HRMSDemo.hrms.business.abstracts;

import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Languages;

import java.util.List;

public interface LanguagesService {
    DataResult<List<Languages>> getAll();
    Result add(Languages languages);
    Result update(Languages languages);
    Result delete(int id);
}
