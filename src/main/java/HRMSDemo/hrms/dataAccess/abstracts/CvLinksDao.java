package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvLinks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvLinksDao extends JpaRepository<CvLinks,Integer> {
    CvLinks getByEmployee_Id(int employeeId);

}
