package service.Implement;

import model.Customer;
import resposive.ICustomerRespository;
import resposive.Implement.CustomerRespository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRespository iCustomerRespository = new CustomerRespository();
    @Override
    public List<Customer> findAll() {
        return iCustomerRespository.findAll();
    }

    @Override
    public Customer findById(String id) {
        return iCustomerRespository.findById(id);
    }

    @Override
    public void save(String id, String name, String dateOfBirth) {
         iCustomerRespository.save(id, name, dateOfBirth);
    }

    @Override
    public void delete(String id) {
        iCustomerRespository.delete(id);
    }

    @Override
    public boolean create(String id, String name, String dateOfBirth) {
        Customer customer = findById(id);
        if(customer==null) {
            iCustomerRespository.create(id, name, dateOfBirth);
            return true;
        }
        else {
            return false;
        }
    }
}
