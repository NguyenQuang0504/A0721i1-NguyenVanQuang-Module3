package resposive;

import model.Customer;

import java.util.List;

public interface ICustomerRespository {
    List<Customer> findAll();

    Customer findById(String id);

    void save(String id, String name, String dateOfBirth);

    void delete(String id);

    void create(String id, String name, String dateOfBirth);
}
