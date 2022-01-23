package repository.Imp;

import model.Customer;
import model.CustomerType;
import repository.ICustomerRepository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImp implements ICustomerRepository {
 private BaseRepository baseRepository = new BaseRepository();

 @Override
 public ArrayList<Customer> display() {
  ArrayList<Customer> customers = new ArrayList<>();
  try {
   PreparedStatement preparedStatement = this.baseRepository.getConnection()
           .prepareStatement("select*from khach_hang inner join loai_khach on khach_hang.ma_lk = loai_khach.ma_lk;");
   ResultSet resultSet = preparedStatement.executeQuery();
      Customer customer = new Customer();
   while (resultSet.next()){
     customer = new Customer();
     customer.setId(resultSet.getInt("ma_kh"));
     customer.setName(resultSet.getString("ten_kh"));
     customer.setDateOfBirth(resultSet.getString("ngay_sinh_kh"));
     customer.setGender(resultSet.getInt("gioi_tinh"));
     customer.setCmnd(resultSet.getString("so_cmnd_kh"));
     customer.setPhoneNumber(resultSet.getString("so_dien_thoai_kh"));
     customer.setEmail(resultSet.getString("email_kh"));
     customer.setAddress(resultSet.getString("dia_chi_kh"));
     int id = resultSet.getInt("ma_lk");
     String name = resultSet.getString("ten_lk");
     customer.setCustomerType(new CustomerType(id, name));
     customers.add(customer);
   }
  } catch (SQLException e) {
   e.printStackTrace();
  }
     return customers;
 }

    @Override
    public void create(String id, String name, String dateOfBirth, String gender, String cmnd, String phone, String email, String address, String id_cusomerType) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into khach_hang values (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,Integer.parseInt(id));
            preparedStatement.setString(2,name);
            preparedStatement.setString(3, dateOfBirth);
            preparedStatement.setInt(4, Integer.parseInt(gender));
            preparedStatement.setString(5,cmnd);
            preparedStatement.setString(6,phone);
            preparedStatement.setString(7,email);
            preparedStatement.setString(8,address);
            preparedStatement.setInt(9,Integer.parseInt(id_cusomerType));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        Integer temp = Integer.parseInt(id);
        try {
            PreparedStatement preparedStatement1 = this.baseRepository.getConnection()
                    .prepareStatement("delete from hop_dong where ma_kh = ?;");
            preparedStatement1.setInt(1, temp);
            preparedStatement1.executeUpdate();
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from khach_hang where ma_kh = ?;");
            preparedStatement.setInt(1,temp);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(String id, String cmnd, String phone, String email, String address, String id_cusomerType) {
     Integer temp = Integer.parseInt(id);
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("update khach_hang set so_cmnd_kh = ?, so_dien_thoai_kh = ?, email_kh = ?, dia_chi_kh = ?, ma_lk = ? where ma_kh = ?");
            preparedStatement.setString(1,cmnd);
            preparedStatement.setString(2,phone);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4,address);
            preparedStatement.setInt(5,Integer.parseInt(id_cusomerType));
            preparedStatement.setInt(6,temp);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> search(String name) {
        try {
            List<Customer> list = new ArrayList<>();
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from khach_hang inner join loai_khach on khach_hang.ma_lk = loai_khach.ma_lk where ten_kh like ?;");
            preparedStatement.setString(1,"%" +name +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer = new Customer();
            while (resultSet.next()){
                customer = new Customer();
                customer.setId(resultSet.getInt("ma_kh"));
                customer.setName(resultSet.getString("ten_kh"));
                customer.setDateOfBirth(resultSet.getString("ngay_sinh_kh"));
                customer.setGender(resultSet.getInt("gioi_tinh"));
                customer.setCmnd(resultSet.getString("so_cmnd_kh"));
                customer.setPhoneNumber(resultSet.getString("so_dien_thoai_kh"));
                customer.setEmail(resultSet.getString("email_kh"));
                customer.setAddress(resultSet.getString("dia_chi_kh"));
                int id = resultSet.getInt("ma_lk");
                String name1 = resultSet.getString("ten_lk");
                customer.setCustomerType(new CustomerType(id, name1));
                list.add(customer);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<CustomerType> findCustomerType() {
     List<CustomerType> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from loai_khach;");
            ResultSet resultSet = preparedStatement.executeQuery();
            CustomerType customerType = new CustomerType();
            while (resultSet.next()){
                customerType = new CustomerType();
                customerType.setId(resultSet.getInt("ma_lk"));
                customerType.setNameCustomerType(resultSet.getString("ten_lk"));
                list.add(customerType);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
