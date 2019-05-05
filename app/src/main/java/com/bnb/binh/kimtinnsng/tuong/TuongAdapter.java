package com.bnb.binh.kimtinnsng.tuong;

public class TuongAdapter {

    private String tentuong;
    private String thuoctinhtuong;
    private int icontuong;

    public TuongAdapter() {
    }

    public TuongAdapter(String tentuong, String thuoctinhtuong, int icontuong) {
        this.tentuong = tentuong;
        this.thuoctinhtuong = thuoctinhtuong;
        this.icontuong = icontuong;
    }

    public String getTentuong() {
        return tentuong;
    }

    public void setTentuong(String tentuong) {
        this.tentuong = tentuong;
    }

    public String getThuoctinhtuong() {
        return thuoctinhtuong;
    }

    public void setThuoctinhtuong(String thuoctinhtuong) {
        this.thuoctinhtuong = thuoctinhtuong;
    }

    public int getIcontuong() {
        return icontuong;
    }

    public void setIcontuong(int icontuong) {
        this.icontuong = icontuong;
    }
}
