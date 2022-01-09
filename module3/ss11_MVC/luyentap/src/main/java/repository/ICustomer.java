package repository;

import model.Customer;

import java.util.ArrayList;

public interface ICustomer {
    ArrayList<Customer> display();

    Customer findById(String id);

    void update(String id, String name, String gender, String dateOfBirth, String address);

    void create(String id, String name, String gender, String dateOfBirth, String address);

    void deleteById(String id);
}
