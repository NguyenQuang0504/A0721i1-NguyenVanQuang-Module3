package service.Imp;

import model.Customer;
import model.CustomerType;
import repository.ICustomerRepository;
import repository.Imp.CustomerRepositoryImp;
import service.ICustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImp implements ICustomerService {
    private String REGEX_SDT = "^090+[0-9]{7}|091[0-9]{7}|(84)90[0-9]{7}|(84)91[0-9]{7}$";
    private String REGEX_EMAIL = "^[a-zA-Z]+[0-9]+@gmail.com$";
    private ICustomerRepository iCustomerRepository = new CustomerRepositoryImp();
    @Override
    public ArrayList<Customer> display() {
        return iCustomerRepository.display();
    }

    @Override
    public Map<String, String> create(String id, String name, String dateOfBirth, String gender, String cmnd, String phone, String email, String address, String id_cusomerType) {
        Map<String, String> mess = new HashMap<>();
        if (phone.matches(REGEX_SDT)&&email.matches(REGEX_EMAIL)) {
            iCustomerRepository.create(id, name, dateOfBirth, gender, cmnd, phone, email, address, id_cusomerType);
        }
        else if(phone.matches(REGEX_SDT)) {
            mess.put("mess","So dien thoai khong chinh xac");
        }
        else if(email.matches(REGEX_EMAIL)){
            mess.put("mess1", "Email khong dung dinh dang");
        }
        return mess;
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
