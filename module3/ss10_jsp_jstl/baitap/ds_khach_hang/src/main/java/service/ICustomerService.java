package service;


import model.DataCustomer;

import java.util.List;

public interface ICustomerService {
    List<DataCustomer> findAll();
}
