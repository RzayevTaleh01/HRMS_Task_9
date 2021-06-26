package HRMSDemo.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_cover_letter")
public class CvCoverLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int cvCoverLetterId;

    @Column(name = "content")
    private String content;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
