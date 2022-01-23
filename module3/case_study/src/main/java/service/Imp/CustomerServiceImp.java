package service.Imp;

import model.Customer;
import model.CustomerType;
import repository.ICustomerRepository;
import repository.Imp.CustomerRepositoryImp;
import service.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImp implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepositoryImp();
    @Override
    public ArrayList<Customer> display() {
        return iCustomerRepository.display();
    }

    @Override
    public void create(String id, String name, String dateOfBirth, String gender, String cmnd, String phone, String email, String address, String id_cusomerType) {
        iCustomerRepository.create(id, name, dateOfBirth, gender, cmnd, phone, email, address, id_cusomerType);
    }

    @Override
    public void delete(String id) {
        iCustomerRepository.delete(id);
    }

    @Override
    public void update(String id, String cmnd, String phone, String email, String address, String id_cusomerType) {
        iCustomerRepository.update(id, cmnd, phone, email, address, id_cusomerType);
    }

    @Override
    public List<Customer> search(String name) {
        return iCustomerRepository.search(name);
    }

    @Override
    public List<CustomerType> findCustomerType() {
        return iCustomerRepository.findCustomerType();
    }
}
