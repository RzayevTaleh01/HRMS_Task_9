package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.CvPrgSkillsService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.CvPrgSkillsDao;
import HRMSDemo.hrms.entities.concretes.CvPrgSkills;
import HRMSDemo.hrms.entities.concretes.CvSchools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CvPrgSkillsManager implements CvPrgSkillsService {

   private CvPrgSkillsDao cvPrgSkillsDao;

   @Autowired
    public CvPrgSkillsManager(CvPrgSkillsDao cvPrgSkillsDao) {
        super();
        this.cvPrgSkillsDao = cvPrgSkillsDao;
    }

    @Override
    public DataResult<List<CvPrgSkills>> getAll() {
        return new SuccessDataResult<List<CvPrgSkills>>
                (this.cvPrgSkillsDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(CvPrgSkills cvPrgSkills) {
       this.cvPrgSkillsDao.save(cvPrgSkills);
        return new SuccessResult("Data Elave Olundu");
    }
}
