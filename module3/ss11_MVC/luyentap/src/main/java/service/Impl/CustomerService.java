package service.Impl;

import model.Customer;
import repository.ICustomer;
import repository.Impl.CustomerRepository;
import service.ICustomerService;

import java.util.ArrayList;

public class CustomerService implements ICustomerService {
    public ICustomer iCustomer = new  CustomerRepository();
    @Override
    public ArrayList<Customer> display() {
        return iCustomer.display();
    }

    @Override
    public Customer findById(String id) {
        return iCustomer.findById(id);
    }
}
