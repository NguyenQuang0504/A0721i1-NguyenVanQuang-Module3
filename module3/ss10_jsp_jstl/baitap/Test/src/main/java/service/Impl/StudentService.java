package service.Impl;

import model.Student;
import respository.IStudentRespository;
import respository.Impl.StudentRespository;
import service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRespository iStudentRespository = new StudentRespository();
    @Override
    public List<Student> findAll() {
        return iStudentRespository.findAll();
    }

    @Override
    public Student findById(String id) {
        return iStudentRespository.findById(id);
    }

    @Override
    public void save(String id, String name, String gender, String dateOdBirth, String grades) {
        iStudentRespository.save(id, name, gender, dateOdBirth, grades);
    }

    @Override
    public void delete(String id) {
        iStudentRespository.delete(id);
    }

    @Override
    public boolean create(String id, String name, String gender, String dateOfBirth, String grades) {
        Student student = findById(id);
        if(student==null){
            iStudentRespository.create(id, name, gender, dateOfBirth, grades);
            return true;
        }
        else {
            return false;
        }
    }

}
