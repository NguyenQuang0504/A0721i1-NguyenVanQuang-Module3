package repository;

import model.Customer;

import java.util.ArrayList;

public interface ICustomer {
    ArrayList<Customer> display();

    Customer findById(String id);
}
