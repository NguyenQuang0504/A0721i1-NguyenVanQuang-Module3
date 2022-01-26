package service.Imp;

import model.Employee;
import repository.IEmployeeRepository;
import repository.Imp.EmployeeRepositoryImp;
import service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImp implements IEmployeeService {
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepositoryImp();
    @Override
    public List<Employee> display() {
        return iEmployeeRepository.display();
    }
}
