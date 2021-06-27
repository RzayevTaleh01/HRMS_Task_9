package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.CvExperienceService;
import HRMSDemo.hrms.business.abstracts.CvSchoolsService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.CvExperienceDao;
import HRMSDemo.hrms.entities.concretes.CvExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CvExperienceManager implements CvExperienceService {

    private CvExperienceDao cvExperienceDao;

    @Autowired
    public CvExperienceManager(CvExperienceDao cvExperienceDao) {
        super();
        this.cvExperienceDao=cvExperienceDao;
    }

    @Override
    public DataResult<List<CvExperience>> getByEmployee_id(int employeeId) {
        return new SuccessDataResult<List<CvExperience>>
                (this.cvExperienceDao.getByEmployee_id(employeeId));
    }

    @Override
    public DataResult<List<CvExperience>> getAll() {
        return new SuccessDataResult<List<CvExperience>>
                (this.cvExperienceDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(CvExperience cvExperience) {
        this.cvExperienceDao.save(cvExperience);
        return new SuccessResult("Mekteb Elave Olundu");
    }
}
