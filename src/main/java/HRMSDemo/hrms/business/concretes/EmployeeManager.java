package HRMSDemo.hrms.business.concretes;

import HRMSDemo.hrms.business.abstracts.EmployeeService;
import HRMSDemo.hrms.core.utilities.results.DataResult;
import HRMSDemo.hrms.core.utilities.results.Result;
import HRMSDemo.hrms.core.utilities.results.SuccessDataResult;
import HRMSDemo.hrms.core.utilities.results.SuccessResult;
import HRMSDemo.hrms.dataAccess.abstracts.EmployeeDao;
import HRMSDemo.hrms.entities.concretes.Employee;

import java.util.List;

public class EmployeeManager implements EmployeeService {
    private EmployeeDao employeeDao;
    public EmployeeManager(EmployeeDao employeeDao){
        super();
        this.employeeDao= employeeDao;
    }
    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<List<Employee>>(
                this.employeeDao.findAll(),"Data Listelendi");
    }

    @Override
    public Result add(Employee employee) {
        return new SuccessResult("Urun Eklendi");
    }
}
