package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

    Student findById(String id);

    void save(String id, String name, String gender, String dateOdBirth, String grades);

    void delete(String id);


    boolean create(String id, String name, String gender, String dateOfBirth, String grades);
}
