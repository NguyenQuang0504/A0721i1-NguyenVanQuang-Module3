package respository.Impl;

import model.Student;
import respository.IStudentRespository;

import java.util.ArrayList;
import java.util.List;

public class StudentRespository implements IStudentRespository {
   private static List<Student> studentList = new ArrayList<>();
   static {
       studentList.add(new Student(1,"Quang1",1,"05/04/2000",9));
       studentList.add(new Student(2,"Quang2",1,"05/04/2000",7));
       studentList.add(new Student(3,"Quang3",0,"05/04/2000",2));
       studentList.add(new Student(4,"Quang4",0,"05/04/2000",3));
       studentList.add(new Student(5,"Quang5",1,"05/04/2000",5));
   }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public Student findById(String id) {
       Integer temp = Integer.valueOf(id);
       for (Student student: studentList){
           if(student.getId().equals(temp)){
               return student;
           }
       }
        return null;
    }

    @Override
    public void save(String id, String name, String gender, String dateOdBirth, String grades) {
        Integer temp = Integer.valueOf(id);
        Integer gender1 = Integer.valueOf(gender);
        float grades1 = Float.valueOf(grades);
        for (Student student: studentList){
            if(student.getId().equals(temp)){
                student.setName(name);
                student.setGender(gender1);
                student.setDateOfBirth(dateOdBirth);
                student.setGrades(grades1);
            }
        }
    }

    @Override
    public void delete(String id) {
       Integer temp = Integer.parseInt(id);
        for (int i = 0;i<studentList.size();i++){
            if (studentList.get(i).getId().equals(temp)){
                studentList.remove(i);
                break;
            }
        }
    }

    @Override
    public void create(String id, String name, String gender, String dateOfBirth, String grades) {
        Integer id1 = Integer.parseInt(id);
        Integer genser1 = Integer.parseInt(gender);
        Float grades1 = Float.parseFloat(grades);
        studentList.add(new Student(id1, name, genser1, dateOfBirth, grades1));
    }
}
