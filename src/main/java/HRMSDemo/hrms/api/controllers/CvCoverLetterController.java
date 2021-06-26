package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.CvCoverLetterService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvCoverLetter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv_cover_letter")
public class CvCoverLetterController {
    private CvCoverLetterService cvCoverLetterService;

    @Autowired
    public CvCoverLetterController(CvCoverLetterService cvCoverLetterService) {
        super();
        this.cvCoverLetterService = cvCoverLetterService;
    }

    @GetMapping("/getAll")
    public DataResult<List<CvCoverLetter>> getAll(){
        return this.cvCoverLetterService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody CvCoverLetter cvCoverLetter){
        return this.cvCoverLetterService.add(cvCoverLetter);
    }



}
