package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.CvImgService;
import HRMSDemo.hrms.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/CvImgController")
public class CvImgController {

    private CvImgService cvImgService;

    @Autowired
    public CvImgController(CvImgService cvImgService) {
        super();
        this.cvImgService = cvImgService;
    }

    @PostMapping("/addPhoto")
    public Result addPhoto(MultipartFile file, int employeeId) {

        return cvImgService.addPhoto(file, employeeId);
    }

}
