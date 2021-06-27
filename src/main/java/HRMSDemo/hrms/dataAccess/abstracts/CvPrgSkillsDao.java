package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvPrgSkills;
import HRMSDemo.hrms.entities.concretes.CvSchools;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CvPrgSkillsDao extends JpaRepository<CvPrgSkills,Integer> {
    List<CvPrgSkills> getByEmployee_Id(int employeeId);
}
