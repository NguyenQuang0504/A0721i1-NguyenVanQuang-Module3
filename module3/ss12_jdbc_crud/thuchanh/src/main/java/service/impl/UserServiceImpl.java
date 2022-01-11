package service.impl;

import model.User;
import repository.IUserRepository;
import repository.impl.UserRepositoryImpl;
import service.IUserService;

import java.util.ArrayList;
import java.util.List;

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
}
