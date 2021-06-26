package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.CvSchoolsService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.CvSchoolsDao;
import HRMSDemo.hrms.entities.concretes.CvSchools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CvSchoolsManager implements CvSchoolsService {

    private CvSchoolsDao cvSchoolsDao;

    @Autowired
    public CvSchoolsManager(CvSchoolsDao cvSchoolsDao) {
        super();
        this.cvSchoolsDao=cvSchoolsDao;
    }

    @Override
    public DataResult<List<CvSchools>> getAll() {
        return new SuccessDataResult<List<CvSchools>>
                (this.cvSchoolsDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(CvSchools cvSchools) {
        this.cvSchoolsDao.save(cvSchools);
        return new SuccessResult("Mekteb Elave Olundu");
    }
}
