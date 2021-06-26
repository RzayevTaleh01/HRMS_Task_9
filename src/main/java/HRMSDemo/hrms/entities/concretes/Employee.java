package HRMSDemo.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({
        "hibernateLazyInitializer","handler","cvSchools",
        "hibernateLazyInitializer","handler","cvPrgSkills",
        "hibernateLazyInitializer","handler","cvLinks",
        "hibernateLazyInitializer","handler","cvLanguages",
        "hibernateLazyInitializer","handler","cvCoverLetters",
        "hibernateLazyInitializer","handler","cvExperiences"
})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "birth_date")
    private String birthDate;
    @Column(name = "nationalty_id")
    private String nationaltyId;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "employee")
    private List<CvSchools> cvSchools;

    @OneToMany(mappedBy = "employee")
    private List<CvPrgSkills> cvPrgSkills;

    @OneToMany(mappedBy = "employee")
    private List<CvLinks> cvLinks;

    @OneToMany(mappedBy = "employee")
    private List<CvLanguage> cvLanguages;

    @OneToMany(mappedBy = "employee")
    private List<CvCoverLetter> cvCoverLetters;

    @OneToMany(mappedBy = "employee")
    private List<CvExperience> cvExperiences;

}
