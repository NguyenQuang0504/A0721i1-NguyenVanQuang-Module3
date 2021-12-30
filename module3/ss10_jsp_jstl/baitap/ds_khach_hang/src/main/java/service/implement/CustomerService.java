package service.implement;

import model.DataCustomer;
import responsitory.ICustomer;
import responsitory.implement.Customer;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService
{
    private ICustomer iCustomer = new Customer();
    @Override
    public List<DataCustomer> findAll() {
        return iCustomer.findAll();
    }
}
