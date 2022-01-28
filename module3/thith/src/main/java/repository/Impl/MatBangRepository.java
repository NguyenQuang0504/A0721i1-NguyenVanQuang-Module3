package repository.Impl;

import model.LoaiMB;
import model.MatBang;
import model.TrangThaiMB;
import repository.IMatBangRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MatBangRepository implements IMatBangRepository {
    BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<LoaiMB> display_loaimb() {
        List<LoaiMB> loaiMBS = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from loai_mb;");
            ResultSet resultSet = preparedStatement.executeQuery();
            LoaiMB loaiMB = new LoaiMB();
            while (resultSet.next()){
                loaiMB = new LoaiMB();
                loaiMB.setMa_lmb(resultSet.getInt("ma_loai_mb"));
                loaiMB.setName_lmb(resultSet.getString("ten_loai_mb"));
                loaiMBS.add(loaiMB);
            }
            return loaiMBS;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<TrangThaiMB> display_trangthai() {
        List<TrangThaiMB> loaiMBS = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from trang_thai;");
            ResultSet resultSet = preparedStatement.executeQuery();
            TrangThaiMB loaiMB = new TrangThaiMB();
            while (resultSet.next()){
                loaiMB = new TrangThaiMB();
                loaiMB.setMa_tt(resultSet.getInt("ma_tt_mb"));
                loaiMB.setName_tt(resultSet.getString("tn_tt_mb"));
                loaiMBS.add(loaiMB);
            }
            return loaiMBS;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void create(String ma_mb, String dien_tich, String id_trangthai, String tang, String id_lmb,String gia, String ngay_bd, String ngay_kt) {
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("insert into mat_bang value(?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1,ma_mb);
            preparedStatement.setInt(2,Integer.parseInt(id_trangthai));
            preparedStatement.setDouble(3,Double.parseDouble(dien_tich));
            preparedStatement.setInt(4, Integer.parseInt(tang));
            preparedStatement.setInt(5,Integer.parseInt(id_lmb));
            preparedStatement.setDouble(6,Double.parseDouble(gia));
            preparedStatement.setString(7, ngay_bd);
            preparedStatement.setString(8, ngay_kt);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<MatBang> display() {
        List<MatBang> lsit = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.baseRepository.getConnection()
                    .prepareStatement("select * from mat_bang order by dien_tich_mb");
            ResultSet resultSet = preparedStatement.executeQuery();
            MatBang matBang = new MatBang();
            while (resultSet.next()){
                matBang = new MatBang();
                matBang.setId(resultSet.getString("ma_mb"));
                matBang.setDien_tich(resultSet.getDouble("dien_tich_mb"));
                matBang.setTang(resultSet.getInt("tang"));
                matBang.setGia(resultSet.getDouble("gia_tien"));
                matBang.setNgay_bd(resultSet.getString("ngay_bd"));
                matBang.setNgay_kt(resultSet.getString("ngay_kt"));
                lsit.add(matBang);
            }
            return lsit;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(String id) {
//        PreparedStatement preparedStatement = this.baseRepository.getConnection()
//                .prepareStatement("delete from ")
    }
}
