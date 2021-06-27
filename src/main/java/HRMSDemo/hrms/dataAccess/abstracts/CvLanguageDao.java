package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CvLanguageDao extends JpaRepository<CvLanguage,Integer> {
    List<CvLanguage> getByEmployee_Id(int employeeId);
}
