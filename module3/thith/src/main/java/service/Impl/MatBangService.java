package service.Impl;

import model.LoaiMB;
import model.MatBang;
import model.TrangThaiMB;
import repository.IMatBangRepository;
import repository.Impl.MatBangRepository;
import service.IMatBangService;

import java.util.List;

public class MatBangService implements IMatBangService {
    private IMatBangRepository iMatBangRepository = new MatBangRepository();
    @Override
    public List<LoaiMB> display_loaimb() {
        return iMatBangRepository.display_loaimb();
    }

    @Override
    public List<TrangThaiMB> display_trangthai() {
        return iMatBangRepository.display_trangthai();
    }

    @Override
    public void create(String ma_mb, String dien_tich, String id_trangthai, String tang, String id_lmb,String gia, String ngay_bd, String ngay_kt) {
        iMatBangRepository.create(ma_mb, dien_tich, id_trangthai, tang, id_lmb, gia, ngay_bd, ngay_kt);
    }

    @Override
    public List<MatBang> display() {
        return iMatBangRepository.display();
    }

    @Override
    public void delete(String id) {
        iMatBangRepository.delete(id);
    }
}
