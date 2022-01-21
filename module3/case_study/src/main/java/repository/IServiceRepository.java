package repository;

import model.Service;

import java.util.List;

public interface IServiceRepository {
    List<Service> display();

    void create(String id, String name, String area, String cost, String numPeople, String standard, String convinient, String idTypeRent, String areaPool,String numFloor, String idServiceType);
}
