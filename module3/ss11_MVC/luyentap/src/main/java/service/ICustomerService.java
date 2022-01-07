package service;

import model.Customer;

import java.util.ArrayList;

public interface ICustomerService {
    ArrayList<Customer> display();

    Customer findById(String id);
}
