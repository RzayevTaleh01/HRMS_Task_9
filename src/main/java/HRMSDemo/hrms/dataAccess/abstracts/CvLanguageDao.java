package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvLanguageDao extends JpaRepository<CvLanguage,Integer> {

}
