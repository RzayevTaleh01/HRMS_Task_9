package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvImg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CvImgDao extends JpaRepository<CvImg,Integer> {
 List<CvImg> getByEmployee_Id(int employeeId);
}
