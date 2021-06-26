package HRMSDemo.hrms.api.controllers;

        import HRMSDemo.hrms.business.abstracts.CvExperienceService;
        import HRMSDemo.hrms.business.abstracts.CvSchoolsService;
        import HRMSDemo.hrms.core.utilities.results.DataResult;
        import HRMSDemo.hrms.core.utilities.results.Result;
        import HRMSDemo.hrms.entities.concretes.CvExperience;
        import HRMSDemo.hrms.entities.concretes.CvSchools;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/CvExperienceController")
public class CvExperienceController {
    private CvExperienceService cvExperienceService;

    @Autowired
    public CvExperienceController(CvExperienceService cvExperienceService) {
        super();
        this.cvExperienceService = cvExperienceService;
    }

    @GetMapping("/getAll")
    public DataResult<List<CvExperience>> getAll(){
        return this.cvExperienceService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody CvExperience cvExperience){
        return this.cvExperienceService.add(cvExperience);
    }
}