package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvLanguage;
import HRMSDemo.hrms.entities.concretes.CvLinks;
import HRMSDemo.hrms.entities.concretes.Languages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguagesDao extends JpaRepository<Languages,Integer> {

}
