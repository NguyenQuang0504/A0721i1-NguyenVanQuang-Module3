package service.Imp;

import model.Service;
import repository.IServiceRepository;
import repository.Imp.ServiceRepositoryImp;
import service.IServiceService;

import java.util.List;

public class ServiceServiceImp implements IServiceService {
    private IServiceRepository iServiceRepository = new ServiceRepositoryImp();
    @Override
    public List<Service> display() {
        return iServiceRepository.display();
    }

    @Override
    public void create(String id, String name, String area, String cost, String numPeople, String standard, String convinient, String idTypeRent, String areaPool,String numFloor, String idServiceType) {
        iServiceRepository.create(id, name, area, cost, numPeople, standard, convinient, idTypeRent, areaPool, numFloor, idServiceType);
    }
}
