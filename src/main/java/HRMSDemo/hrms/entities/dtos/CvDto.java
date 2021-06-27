package HRMSDemo.hrms.entities.dtos;

import HRMSDemo.hrms.entities.concretes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {
    private Employee employee;

    private LocalDate creationDate;

    private String coverLetter;

    private String linkName;

    private String linkUrl;

    private String imageUrl;

    private List<CvSchools> cvSchools;

    private List<CvExperience> cvExperiences;

    private List<CvPrgSkills> cvPrgSkills;

    private List<CvLanguage> cvLanguages;
}
