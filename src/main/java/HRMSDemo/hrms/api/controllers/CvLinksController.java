package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.CvLinksService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.CvLinks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/add/cv_links")
public class CvLinksController {
    private CvLinksService cvLinksService;

    @Autowired
    public CvLinksController(CvLinksService cvLinksService) {
        super();
        this.cvLinksService = cvLinksService;
    }

    @GetMapping("/getAll")
    public DataResult<List<CvLinks>> getAll(){
        return this.cvLinksService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody CvLinks cvLinks){
        return this.cvLinksService.add(cvLinks);
    }
}
