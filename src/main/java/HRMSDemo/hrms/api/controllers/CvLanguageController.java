package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.CvLanguageService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv_language")
public class CvLanguageController {
    private CvLanguageService cvLanguageService;

    @Autowired
    public CvLanguageController(CvLanguageService cvLanguageService) {
        super();
        this.cvLanguageService = cvLanguageService;
    }
    @GetMapping("/getAll")
    public DataResult<List<CvLanguage>> getAll(){
        return this.cvLanguageService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody CvLanguage cvLanguage){
        return this.cvLanguageService.add(cvLanguage);
    }
}