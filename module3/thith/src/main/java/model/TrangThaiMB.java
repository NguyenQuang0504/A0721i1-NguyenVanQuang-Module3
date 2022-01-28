package model;

public class TrangThaiMB {
    private int ma_tt;
    private String name_tt;

    public TrangThaiMB(int ma_tt, String name_tt) {
        this.ma_tt = ma_tt;
        this.name_tt = name_tt;
    }

    public TrangThaiMB() {
    }

    public int getMa_tt() {
        return ma_tt;
    }

    public void setMa_tt(int ma_tt) {
        this.ma_tt = ma_tt;
    }

    public String getName_tt() {
        return name_tt;
    }

    public void setName_tt(String name_tt) {
        this.name_tt = name_tt;
    }
}
