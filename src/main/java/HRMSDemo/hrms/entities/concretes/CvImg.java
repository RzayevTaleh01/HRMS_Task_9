package HRMSDemo.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private LocalDate uploadedDate = LocalDate.now();

    @JsonIgnore
    @OneToOne()
    @JoinColumn(name="employee_id",referencedColumnName = "id")
    private Employee employee;
}
