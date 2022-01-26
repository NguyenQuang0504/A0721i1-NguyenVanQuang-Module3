package repository.Imp;

import model.Employee;
import repository.IEmployeeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImp implements IEmployeeRepository {
    BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Employee> display() {
        List<Employee> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from nhan_vien;");
            Employee employee = new Employee();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                employee = new Employee();
                employee.setId(resultSet.getInt("ma_nv"));
                employee.setName(resultSet.getString("ho_ten_nv"));
                employee.setDateOfBirth(resultSet.getString("ngay_sinh"));
                employee.setCmnd(resultSet.getString("so_cmnd"));
                employee.setSalary(resultSet.getDouble("luong"));
                employee.setPhoneNum(resultSet.getString("so_dt"));
                employee.setEmail(resultSet.getString("email"));
                employee.setAddress(resultSet.getString("dia_chi"));
                list.add(employee);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
