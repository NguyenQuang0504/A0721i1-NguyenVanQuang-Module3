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
}
