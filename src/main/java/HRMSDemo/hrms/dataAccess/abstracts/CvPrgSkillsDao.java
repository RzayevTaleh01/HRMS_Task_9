package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvPrgSkills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvPrgSkillsDao extends JpaRepository<CvPrgSkills,Integer> {
}
