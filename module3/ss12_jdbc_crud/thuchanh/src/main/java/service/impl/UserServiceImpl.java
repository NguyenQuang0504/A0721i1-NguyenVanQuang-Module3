package service.impl;

import model.User;
import repository.IUserRepository;
import repository.impl.UserRepositoryImpl;
import service.IUserService;

import java.util.ArrayList;

public class UserServiceImpl implements IUserService {
    public IUserRepository iUserRepository = new UserRepositoryImpl();
    @Override
    public ArrayList<User> display() {

        return iUserRepository.display();
    }

    @Override
    public void create(String id, String name, String email, String country) {
        iUserRepository.create(id, name, email, country);
    }

    @Override
    public User findById(String id) {
        return iUserRepository.findById(id);
    }

    @Override
    public void update(String id, String name, String email, String country) {
        iUserRepository.update(id,name, email, country);
    }

    @Override
    public void delete(String id) {
        iUserRepository.delete(id);
    }

    @Override
    public ArrayList<User> findByCountry(String country) {
        return iUserRepository.findByCountry(country);
    }

    @Override
    public ArrayList<User> sort() {
       return iUserRepository.sort();
    }

    @Override
    public boolean check(String element) {
        ArrayList<User> list = new ArrayList<>();
        list = display();
        for (int i = 0; i<list.size();i++){
            if (list.get(i).getCountry().equals(element)||list.get(i).getName().equals(element)||list.get(i).getEmail().equals(element)){
                return true;
            }
        }
        return false;
    }
}
