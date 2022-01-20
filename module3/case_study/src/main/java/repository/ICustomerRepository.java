package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public interface ICustomerRepository {
    ArrayList<Customer> display();

    void create(String id, String name, String dateOfBirth, String gender, String cmnd, String phone, String email, String address, String id_cusomerType);

    void delete(String id);

    void update(String id, String cmnd, String phone, String email, String address, String id_cusomerType);

    List<Customer> search(String name);
}
