package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;

public interface IUserRepository {
    ArrayList<User> display();

    void create(String id, String name, String email, String country);
}
