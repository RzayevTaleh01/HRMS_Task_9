package HRMSDemo.hrms.entities.concretes;

import HRMSDemo.hrms.entities.concretes.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_img")
public class CvImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int cvImgId;

    @Column(name = "img_link")
    private String imgLink;

    @Column(name = "uploaded_date")
    private String uploadedDate;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
