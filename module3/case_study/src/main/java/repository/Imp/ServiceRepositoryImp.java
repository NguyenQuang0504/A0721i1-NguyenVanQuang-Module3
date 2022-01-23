package repository.Imp;

import model.RentalType;
import model.Service;
import model.TypeService;
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

    @Override
    public void delete(String id) {
        try {
            Integer ma_ldv = null;
            Integer ma_kt = null;
            PreparedStatement preparedStatement1 = this.baseRepository.getConnection()
                    .prepareStatement("select * from dich_vu where ma_dv = ?");
            preparedStatement1.setInt(1, Integer.parseInt(id));
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()){
                ma_ldv = resultSet.getInt("ma_ldv");
                ma_kt = resultSet.getInt("ma_kt");
            }
            PreparedStatement preparedStatement2 = this.baseRepository.getConnection()
                    .prepareStatement("delete from loai_dich_vu where ma_ldv = ?;");
            preparedStatement2.setInt(1, ma_ldv);
            PreparedStatement preparedStatement3 = this.baseRepository.getConnection()
                    .prepareStatement("delete from kieu_thue where ma_kt = ?;");
            preparedStatement2.setInt(1, ma_kt);
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("delete from dich_vu where ma_dv = ?;");
            preparedStatement.setInt(1, Integer.parseInt(id));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Service> search(String name) {
        ArrayList<Service> list = new ArrayList<>();
        Service service = new Service();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from dich_vu where ten_dv like ?;");
            preparedStatement.setString(1, "%" +name +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                service = new Service();
                service.setId(resultSet.getInt("ma_dv"));
                service.setName(resultSet.getString("ten_dv"));
                service.setArea(resultSet.getInt("dien_tich"));
                service.setCost(resultSet.getDouble("chi_phi"));
                service.setStandard(resultSet.getString("tieu_chuan_phong"));
                service.setConvinient(resultSet.getString("tien_nghi"));
                list.add(service);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<RentalType> listRentalType() {
        List<RentalType> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from kieu_thue");
            RentalType rentalType = new RentalType();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                rentalType = new RentalType();
                rentalType.setIdRentalType(resultSet.getInt("ma_kt"));
                rentalType.setNameRentalType(resultSet.getString("ten_kt"));
                list.add(rentalType);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<TypeService> listTypeService() {
        List<TypeService> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from loai_dich_vu");
            TypeService typeService = new TypeService();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                typeService = new TypeService();
                typeService.setIdTypeService(resultSet.getInt("ma_ldv"));
                typeService.setTypeService(resultSet.getString("ten_ldv"));
                list.add(typeService);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
