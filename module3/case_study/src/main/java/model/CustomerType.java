package model;

public class CustomerType {
    private Integer id;
    private String nameCustomerType;

    public CustomerType(Integer id, String nameCustomerType) {
        this.id = id;
        this.nameCustomerType = nameCustomerType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCustomerType() {
        return nameCustomerType;
    }

    public void setNameCustomerType(String nameCustomerType) {
        this.nameCustomerType = nameCustomerType;
    }
}

