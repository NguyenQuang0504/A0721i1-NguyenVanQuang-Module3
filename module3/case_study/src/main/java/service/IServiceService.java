package service;

import model.RentalType;
import model.Service;
import model.TypeService;

import java.util.List;

public interface IServiceService {
    List<Service> display();

    void create(String id, String name, String area, String cost, String numPeople, String standard, String convinient, String idTypeRent, String areaPool,String numFloor, String idServiceType);

    void delete(String id);

    List<Service> search(String name);

    List<RentalType> listRentalType();

    List<TypeService> listTypeService();
}
