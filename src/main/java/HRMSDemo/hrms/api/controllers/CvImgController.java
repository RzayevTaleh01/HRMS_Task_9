package HRMSDemo.hrms.api.controllers;

        import HRMSDemo.hrms.business.abstracts.CvImgService;
        import HRMSDemo.hrms.core.utilities.results.DataResult;
        import HRMSDemo.hrms.core.utilities.results.Result;
        import HRMSDemo.hrms.entities.concretes.CvImg;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/CvImg")
@CrossOrigin
public class CvImgController {
    private CvImgService cvImgService;
    @Autowired
    public CvImgController(CvImgService cvImgService) {
        this.cvImgService = cvImgService;
    }

    @GetMapping("getByEmployee_Id")
    public DataResult<CvImg> getByEmployee_Id(@RequestParam int employeeId){
        return cvImgService.getByEmployee_Id(employeeId);
    }
    @PostMapping("photoUpload")
    public Result photoUpload(@RequestParam("photo") MultipartFile photo, @RequestParam("id") int id) {
        return  this.cvImgService.add(photo,id);
    }
    @PostMapping("photoDelete")
    public Result photoDelete(@RequestParam("id") int id){
        return this.cvImgService.delete(id);
    }
}