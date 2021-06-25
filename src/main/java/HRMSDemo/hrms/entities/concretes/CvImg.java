package HRMSDemo.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_img")
public class CvImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int cvImgId;

    @Column(name = "img_link")
    private String imgUrl;

    @Column(name = "uploaded_date")
    private LocalDate uploadedDate;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
