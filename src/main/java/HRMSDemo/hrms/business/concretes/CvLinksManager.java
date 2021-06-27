package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.CvLinksService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.CvLinksDao;
import HRMSDemo.hrms.entities.concretes.CvLinks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CvLinksManager implements CvLinksService {
    private CvLinksDao cvLinksDao;

    @Autowired
    public CvLinksManager(CvLinksDao cvLinksDao) {
        super();
        this.cvLinksDao = cvLinksDao;
    }

    @Override
    public DataResult<List<CvLinks>> getAll() {
        return new SuccessDataResult<List<CvLinks>>
                (this.cvLinksDao.findAll(),"Data Listelendi");
    }

    @Override
    public DataResult<CvLinks> getByEmployee_Id(int employeeId) {
        return new SuccessDataResult<>(cvLinksDao.getByEmployee_Id(employeeId));
    }

    @Override
    public Result add(CvLinks cvLinks) {
        this.cvLinksDao.save(cvLinks);
        return new SuccessResult("Data Elave Olundu");
    }
}
