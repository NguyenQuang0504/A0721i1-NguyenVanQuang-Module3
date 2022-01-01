package resposive.Implement;

import model.Customer;
import resposive.ICustomerRespository;

import java.util.ArrayList;
import java.util.List;

public class CustomerRespository implements ICustomerRespository {
    private static List<Customer> list = new ArrayList<>();
    static {
        list.add(new Customer(1,"Quang1","05/04/2000"));
        list.add(new Customer(2,"Quang2","05/04/2000"));
        list.add(new Customer(3,"Quang3","05/04/2000"));
        list.add(new Customer(4,"Quang4","05/04/2000"));
        list.add(new Customer(5,"Quang5","05/04/2000"));
    }
    @Override
    public List<Customer> findAll() {
        return list;
    }

    @Override
    public Customer findById(String id) {
        Integer temp = Integer.parseInt(id);
        for (Customer listCustomer: list){
            if(listCustomer.getId().equals(temp)){
                return listCustomer;
            }
        }
        return null;
    }

    @Override
    public void save(String id, String name, String dateOfBirth) {
        Integer temp = Integer.parseInt(id);
        for (Customer list1: list){
            if (list1.getId().equals(temp)){
                list1.setDateOfBirth(dateOfBirth);
                list1.setName(name);
            }
        }
    }

    @Override
    public void delete(String id) {
        Integer temp = Integer.parseInt(id);
        for (int i = 0;i<list.size();i++){
            if (list.get(i).getId().equals(temp)){
                list.remove(i);
            }
        }
    }

    @Override
    public void create(String id, String name, String dateOfBirth) {
        Integer temp = Integer.parseInt(id);
        list.add(new Customer(temp, name, dateOfBirth));
    }
}
