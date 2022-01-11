package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;

public interface IUserRepository {
    ArrayList<User> display();

    void create(String id, String name, String email, String country);

    User findById(String id);

    void update(String id, String name, String email, String country);

    void delete(String id);

    ArrayList<User> findByCountry(String country);
}
