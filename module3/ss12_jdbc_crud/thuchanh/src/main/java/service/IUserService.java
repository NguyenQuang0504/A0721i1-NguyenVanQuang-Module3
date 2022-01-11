package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public interface IUserService {
    ArrayList<User> display();

    void create(String id, String name, String email, String country);
}
