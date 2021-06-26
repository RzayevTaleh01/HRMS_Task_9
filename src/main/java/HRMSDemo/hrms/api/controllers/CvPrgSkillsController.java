package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.CvPrgSkillsService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.entities.concretes.CvPrgSkills;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv_prg_skills")
public class CvPrgSkillsController {
    private CvPrgSkillsService cvPrgSkillsService;

    @Autowired
    public CvPrgSkillsController(CvPrgSkillsService cvPrgSkillsService) {
        super();
        this.cvPrgSkillsService = cvPrgSkillsService;
    }

    @GetMapping("/getAll")
    public DataResult<List<CvPrgSkills>> getAll(){
        return this.cvPrgSkillsService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody CvPrgSkills cvPrgSkills){
        return this.cvPrgSkillsService.add(cvPrgSkills);
    }
}
