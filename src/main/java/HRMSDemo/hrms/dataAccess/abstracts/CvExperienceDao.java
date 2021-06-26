package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvExperienceDao extends JpaRepository<CvExperience,Integer> {

}
