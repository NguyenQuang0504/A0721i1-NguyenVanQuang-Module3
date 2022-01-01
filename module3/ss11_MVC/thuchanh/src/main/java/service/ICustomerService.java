package service;

import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(String id);

    void save(String id, String name, String dateOfBirth);

    void delete(String id);

    boolean create(String id, String name, String dateOfBirth);
}
