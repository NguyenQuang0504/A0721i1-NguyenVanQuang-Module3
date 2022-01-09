package repository.Impl;

import model.Customer;
import repository.ICustomer;

import java.util.ArrayList;

public class CustomerRepository implements ICustomer {
    public static ArrayList<Customer> list = new ArrayList<>();
    static{
        list.add(new Customer(1, "Quang", 1, "05/04/2000", "Hue"));
        list.add(new Customer(2, "Quang1", 1, "05/04/2000", "Hue"));
        list.add(new Customer(3, "Quang2", 0, "05/04/2000", "Hue"));
        list.add(new Customer(4, "Quang3", 0, "05/04/2000", "Hue"));
        list.add(new Customer(5, "Quang4", 1, "05/04/2000", "Hue"));
    }

    @Override
    public ArrayList<Customer> display() {
        return list;
    }

    @Override
    public Customer findById(String id) {
        Integer temp = Integer.parseInt(id);
        for (Customer list: list){
            if (list.getId().equals(temp)){
                return list;
            }
        }
        return null;
    }

    @Override
    public void update(String id, String name, String gender, String dateOfBirth, String address) {
        Integer temp = Integer.parseInt(id);
        Integer gender1 = Integer.parseInt(gender);
        for (int i=0;i<list.size();i++){
            if (list.get(i).getId().equals(temp)){
                list.get(i).setName(name);
                list.get(i).setDateOfBirth(dateOfBirth);
                list.get(i).setAddress(address);
                list.get(i).setGender(gender1);
            }
        }
    }

    @Override
    public void create(String id, String name, String gender, String dateOfBirth, String address) {
        Customer customer = new Customer(Integer.parseInt(id), name, Integer.parseInt(gender), dateOfBirth, address);
        list.add(customer);
    }
}
