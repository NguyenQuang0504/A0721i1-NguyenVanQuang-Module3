package repository;

import model.LoaiMB;
import model.MatBang;
import model.TrangThaiMB;

import java.util.List;

public interface IMatBangRepository {
    List<LoaiMB> display_loaimb();

    List<TrangThaiMB> display_trangthai();

    void create(String ma_mb, String dien_tich, String id_trangthai, String tang, String id_lmb,String gia, String ngay_bd, String ngay_kt);

    List<MatBang> display();

    void delete(String id);
}
