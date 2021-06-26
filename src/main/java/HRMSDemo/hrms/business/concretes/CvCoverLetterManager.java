package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.CvCoverLetterService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.CvCoverLetterDao;
import HRMSDemo.hrms.entities.concretes.CvCoverLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CvCoverLetterManager implements CvCoverLetterService {

    private CvCoverLetterDao cvCoverLetterDao;

    @Autowired
    public CvCoverLetterManager(CvCoverLetterDao cvCoverLetterDao) {
        super();
        this.cvCoverLetterDao = cvCoverLetterDao;
    }

    @Override
    public DataResult<List<CvCoverLetter>> getAll() {
        return new SuccessDataResult<List<CvCoverLetter>>
                (this.cvCoverLetterDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(CvCoverLetter cvCoverLetter) {
        this.cvCoverLetterDao.save(cvCoverLetter);
        return new SuccessResult("Data elave olundu");
    }
}
