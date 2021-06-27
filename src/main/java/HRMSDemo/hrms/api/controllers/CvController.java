package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.CvService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.entities.dtos.CvDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Cv")
public class CvController {
    private CvService cvService;

    @Autowired
    public CvController(CvService cvService) {
        this.cvService = cvService;
    }

    @GetMapping("/getByEmployee_Id")
    public DataResult<CvDto> getByEmployee_Id(@RequestParam int employeeId) {
        return this.cvService.getByEmployee_Id(employeeId);
    }
}
