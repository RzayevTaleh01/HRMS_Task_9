package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.CvImgService;
import HRMSDemo.hrms.entities.concretes.CvImg;
import HRMSDemo.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/cvImg")
public class CvImgController {
    private CvImgService cvImgService;

    @Autowired
    public CvImgController(CvImgService cvImgService) {
        super();
        this.cvImgService=cvImgService;
    }

    @PostMapping(value="/upload")
    public ResponseEntity<?> add(@RequestBody MultipartFile file, @RequestParam int employeeId)
            throws IOException {
        CvImg image = new CvImg();
        Employee employee = new Employee();
        employee.setId(employeeId);
        image.setEmployee(employee);

        return ResponseEntity.ok(this.cvImgService.add(file, image));
    }

    @GetMapping("/getByCvImgId")
    public ResponseEntity<?> getByEmployee_Id(int employeeId){
        return ResponseEntity.ok(this.cvImgService.getByEmployee_Id(employeeId));
    }

}
