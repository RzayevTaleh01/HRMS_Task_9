package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.CvSchoolsService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvSchools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/CvSchools")
public class CvSchoolsController {
    private CvSchoolsService cvSchoolsService;

    @Autowired
    public CvSchoolsController(CvSchoolsService cvSchoolsService) {
        super();
        this.cvSchoolsService = cvSchoolsService;
    }

    @GetMapping("/getAll")
    public DataResult<List<CvSchools>> getAll(){
        return this.cvSchoolsService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody CvSchools cvSchools){
        return this.cvSchoolsService.add(cvSchools);
    }
}
