package responsitory;

import model.DataCustomer;
import responsitory.implement.Customer;

import java.util.List;

public interface ICustomer {
    List<DataCustomer> findAll();
}
