package repository.Imp;

import model.Service;
import repository.IServiceRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImp implements IServiceRepository {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Service> display() {
        List<Service> serviceList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from dich_vu");
            ResultSet resultSet = preparedStatement.executeQuery();
            Service service = new Service();
            while (resultSet.next()){
                service = new Service();
                service.setId(resultSet.getInt("ma_dv"));
                service.setName(resultSet.getString("ten_dv"));
                service.setArea(resultSet.getInt("dien_tich"));
                service.setCost(resultSet.getDouble("chi_phi"));
                service.setStandard(resultSet.getString("tieu_chuan_phong"));
                service.setConvinient(resultSet.getString("tien_nghi"));
                serviceList.add(service);
            }
            return serviceList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void create(String id, String name, String area, String cost, String numPeople, String standard, String convinient, String idTypeRent, String areaPool, String numFloor, String idServiceType) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into dich_vu values (?,?,?,?,?,?,?,?,?,?,?);");
            preparedStatement.setInt(1, Integer.parseInt(id));
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3,Integer.parseInt(area));
            preparedStatement.setDouble(4, Double.parseDouble(cost));
            preparedStatement.setInt(5,Integer.parseInt(numPeople));
            preparedStatement.setString(6, standard);
            preparedStatement.setString(7,convinient);
            preparedStatement.setDouble(8,Double.parseDouble(areaPool));
            preparedStatement.setInt(9, Integer.parseInt(numFloor));
            preparedStatement.setInt(10,Integer.parseInt(idServiceType));
            preparedStatement.setInt(11, Integer.parseInt(idTypeRent));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
