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
}
