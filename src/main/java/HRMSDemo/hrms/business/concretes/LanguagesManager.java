package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.LanguagesService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.LanguagesDao;
import HRMSDemo.hrms.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguagesManager implements LanguagesService {
    private LanguagesDao languagesDao;

    @Autowired
    public LanguagesManager(LanguagesDao languagesDao){
        super();
        this.languagesDao=languagesDao;
    }

    @Override
    public DataResult<List<Languages>> getAll() {
        return new SuccessDataResult<List<Languages>>
                (this.languagesDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(Languages languages) {
        this.languagesDao.save(languages);
        return new SuccessResult("Urun Eklendi");
    }

    @Override
    public Result update(Languages languages) {
        this.languagesDao.save(languages);
        return new SuccessResult("Dil Güncellendi");
    }

    @Override
    public Result delete(int id) {
        this.languagesDao.deleteById(id);
        return new SuccessResult("Silindi");
    }
}
