package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CvExperienceDao extends JpaRepository<CvExperience,Integer> {
    List<CvExperience> getByEmployee_id(int employeeId);
}
