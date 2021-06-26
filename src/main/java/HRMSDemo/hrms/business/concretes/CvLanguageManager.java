package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.CvLanguageService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.CvLanguageDao;
import HRMSDemo.hrms.entities.concretes.CvLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CvLanguageManager implements CvLanguageService {
    private CvLanguageDao cvLanguageDao;

    @Autowired
    public CvLanguageManager(CvLanguageDao cvLanguageDao) {
        super();
        this.cvLanguageDao = cvLanguageDao;
    }

    @Override
    public DataResult<List<CvLanguage>> getAll() {
        return new SuccessDataResult<List<CvLanguage>>
                (this.cvLanguageDao.findAll(),"Data listelendi");
    }

    @Override
    public Result add(CvLanguage cvLanguage) {
        this.cvLanguageDao.save(cvLanguage);
        return new SuccessResult("Data Elave Olundu");
    }
}
