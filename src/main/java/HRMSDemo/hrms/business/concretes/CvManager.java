package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.CvImgService;
import HRMSDemo.hrms.business.abstracts.*;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.entities.dtos.CvDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CvManager implements CvService {
    private EmployeeService employeeService;
    private CvLinksService cvLinksService;
    private CvImgService cvImgService;
    private CvSchoolsService cvSchoolsService;
    private CvExperienceService cvExperienceService;
    private CvPrgSkillsService cvPrgSkillsService;
    private CvLanguageService cvLanguageService;
    private CvCoverLetterService cvCoverLetterService;

    @Autowired
    public CvManager(EmployeeService employeeService,
                     CvLinksService cvLinksService,
                     CvImgService cvImgService,
                     CvSchoolsService cvSchoolsService,
                     CvExperienceService cvExperienceService,
                     CvPrgSkillsService cvPrgSkillsService,
                     CvLanguageService cvLanguageService,
                     CvCoverLetterService cvCoverLetterService)
    {

        this.employeeService = employeeService;
        this.cvLinksService = cvLinksService;
        this.cvImgService = cvImgService;
        this.cvSchoolsService = cvSchoolsService;
        this.cvExperienceService = cvExperienceService;
        this.cvPrgSkillsService = cvPrgSkillsService;
        this.cvLanguageService = cvLanguageService;
        this.cvCoverLetterService = cvCoverLetterService;
    }

    @Override
    public DataResult<CvDto> getByEmployee_Id(int employeeId) {
        var cv=new CvDto();
        cv.setEmployee(employeeService.getById(employeeId).getData());
        cv.setLinkName(cvLinksService.getByEmployee_Id(employeeId).getData().getLinkName());
        cv.setLinkUrl(cvLinksService.getByEmployee_Id(employeeId).getData().getLinkUrl());
        cv.setCvLanguages(cvLanguageService.getByEmployee_Id(employeeId).getData());
        cv.setImageUrl(cvImgService.getByEmployee_Id(employeeId).getData().getImgLink());
        cv.setCreationDate(LocalDate.now());
        cv.setCvSchools(cvSchoolsService.getByEmployee_Id(employeeId).getData());
        cv.setCvPrgSkills(cvPrgSkillsService.getByEmployee_Id(employeeId).getData());
        cv.setCvExperiences(cvExperienceService.getByEmployee_id(employeeId).getData());
        cv.setCoverLetter(cvCoverLetterService.getByEmployee_id(employeeId).getData().getContent());
        return new SuccessDataResult<>(cv);    }
}
