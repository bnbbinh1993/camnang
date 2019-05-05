package com.bnb.binh.kimtinnsng.phantintuc;

public class TinTucAdapter {
    private int icon_tin_tuc;
    private String ten_tin_tuc;

    public TinTucAdapter() {
    }

    public TinTucAdapter(int icon_tin_tuc, String ten_tin_tuc) {
        this.icon_tin_tuc = icon_tin_tuc;
        this.ten_tin_tuc = ten_tin_tuc;
    }

    public int getIcon_tin_tuc() {
        return icon_tin_tuc;
    }

    public void setIcon_tin_tuc(int icon_tin_tuc) {
        this.icon_tin_tuc = icon_tin_tuc;
    }

    public String getTen_tin_tuc() {
        return ten_tin_tuc;
    }

    public void setTen_tin_tuc(String ten_tin_tuc) {
        this.ten_tin_tuc = ten_tin_tuc;
    }
}
