package HRMSDemo.hrms.api.controllers;

import HRMSDemo.hrms.business.abstracts.LanguagesService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.entities.concretes.Jobs;
import HRMSDemo.hrms.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languagesController")
public class LanguagesController {
    private LanguagesService languagesService;

    @Autowired
    public LanguagesController(LanguagesService languagesService){
        super();
        this.languagesService=languagesService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Languages>> getAll(){
        return this.languagesService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Languages languages){
        return this.languagesService.add(languages);
    }
    @PutMapping("/update")
    public Result update(@RequestBody Languages languages) {
        return this.languagesService.update(languages);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody int id) {
        return this.languagesService.delete(id);
    }
}
