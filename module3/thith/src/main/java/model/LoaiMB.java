package model;

public class LoaiMB {
    private int ma_lmb;
    private String name_lmb;

    public LoaiMB(int ma_lmb, String name_lmb) {
        this.ma_lmb = ma_lmb;
        this.name_lmb = name_lmb;
    }

    public LoaiMB() {
    }

    public int getMa_lmb() {
        return ma_lmb;
    }

    public void setMa_lmb(int ma_lmb) {
        this.ma_lmb = ma_lmb;
    }

    public String getName_lmb() {
        return name_lmb;
    }

    public void setName_lmb(String name_lmb) {
        this.name_lmb = name_lmb;
    }
}
