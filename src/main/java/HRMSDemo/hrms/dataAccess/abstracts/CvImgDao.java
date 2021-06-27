package HRMSDemo.hrms.dataAccess.abstracts;

import HRMSDemo.hrms.entities.concretes.CvImg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvImgDao extends JpaRepository<CvImg,Integer> {
    CvImg getByEmployee_Id(int employeeId);
    CvImg getByCvImgId(int id);

}
