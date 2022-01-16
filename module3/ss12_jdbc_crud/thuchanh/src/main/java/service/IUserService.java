package service;

import model.User;

import java.util.ArrayList;

public interface IUserService {
    ArrayList<User> display();

    void create(String id, String name, String email, String country);

    User findById(String id);

    void update(String id, String name, String email, String country);

    void delete(String id);

    ArrayList<User> findByCountry(String country);

    ArrayList<User> sort();
    boolean check(String element);
}
