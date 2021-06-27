package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvLanguage;
import HRMSDemo.hrms.entities.concretes.CvSchools;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CvSchoolsDao extends JpaRepository<CvSchools,Integer> {
    List<CvSchools> getByEmployee_Id(int employeeId);

}
