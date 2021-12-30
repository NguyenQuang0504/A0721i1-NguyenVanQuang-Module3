package responsitory.implement;

import model.DataCustomer;
import responsitory.ICustomer;

import java.util.ArrayList;
import java.util.List;

public class Customer implements ICustomer {
    private static List<DataCustomer> customerList = new ArrayList<>();
    static {
        customerList.add(new DataCustomer(1, "Quang",0));
        customerList.add(new DataCustomer(2, "Quang2",1));
        customerList.add(new DataCustomer(3, "Quang3",0));
        customerList.add(new DataCustomer(4, "Quang4",1));

    }

    @Override
    public List<DataCustomer> findAll() {
        return customerList;
    }
}
