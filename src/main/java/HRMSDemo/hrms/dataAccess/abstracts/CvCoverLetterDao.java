package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvCoverLetter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvCoverLetterDao extends JpaRepository<CvCoverLetter,Integer> {
    CvCoverLetter getByEmployee_id(int employeeId);
}
