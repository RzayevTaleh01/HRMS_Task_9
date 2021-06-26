package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvSchools;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvSchoolsDao extends JpaRepository<CvSchools,Integer> {

}
