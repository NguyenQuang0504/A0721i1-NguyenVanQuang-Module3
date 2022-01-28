package model;

public class MatBang {
    private String id;
    private TrangThaiMB trangThaiMB;
    private double dien_tich;
    private int tang;
    private LoaiMB loaiMB;
    private double gia;
    private String ngay_bd;
    private String ngay_kt;

    public MatBang(String id, TrangThaiMB trangThaiMB, double dien_tich, int tang, LoaiMB loaiMB, double gia, String ngay_bd, String ngay_kt) {
        this.id = id;
        this.trangThaiMB = trangThaiMB;
        this.dien_tich = dien_tich;
        this.tang = tang;
        this.loaiMB = loaiMB;
        this.gia = gia;
        this.ngay_bd = ngay_bd;
        this.ngay_kt = ngay_kt;
    }

    public MatBang(String id, double dien_tich, int tang, double gia, String ngay_bd, String ngay_kt) {
        this.id = id;
        this.dien_tich = dien_tich;
        this.tang = tang;
        this.gia = gia;
        this.ngay_bd = ngay_bd;
        this.ngay_kt = ngay_kt;
    }

    public MatBang() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TrangThaiMB getTrangThaiMB() {
        return trangThaiMB;
    }

    public void setTrangThaiMB(TrangThaiMB trangThaiMB) {
        this.trangThaiMB = trangThaiMB;
    }

    public double getDien_tich() {
        return dien_tich;
    }

    public void setDien_tich(double dien_tich) {
        this.dien_tich = dien_tich;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public LoaiMB getLoaiMB() {
        return loaiMB;
    }

    public void setLoaiMB(LoaiMB loaiMB) {
        this.loaiMB = loaiMB;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNgay_bd() {
        return ngay_bd;
    }

    public void setNgay_bd(String ngay_bd) {
        this.ngay_bd = ngay_bd;
    }

    public String getNgay_kt() {
        return ngay_kt;
    }

    public void setNgay_kt(String ngay_kt) {
        this.ngay_kt = ngay_kt;
    }
}
