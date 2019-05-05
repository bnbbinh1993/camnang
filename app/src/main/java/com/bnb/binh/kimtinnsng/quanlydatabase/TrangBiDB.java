package com.bnb.binh.kimtinnsng.quanlydatabase;

import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;

public class TrangBiDB implements Serializable {
    private int id;
    private int iconTB;
    private String TenTrangBi;
    private String ThuocTinhTB;
    private String ChiTietTrangBi;
    private String NoiTaiTB;
    private int matb;
    private int LoaiTB;

    public TrangBiDB() {
    }

    public TrangBiDB(int id,int iconTB, String tenTrangBi, String thuocTinhTB, String chiTietTrangBi, String noiTaiTB, int matb, int loaiTB) {
        this.id = id;
        this.iconTB = iconTB;
        TenTrangBi = tenTrangBi;
        ThuocTinhTB = thuocTinhTB;
        ChiTietTrangBi = chiTietTrangBi;
        NoiTaiTB = noiTaiTB;
        this.matb = matb;
        LoaiTB = loaiTB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTrangBi() {
        return TenTrangBi;
    }

    public void setTenTrangBi(String tenTrangBi) {
        TenTrangBi = tenTrangBi;
    }

    public String getThuocTinhTB() {
        return ThuocTinhTB;
    }

    public void setThuocTinhTB(String thuocTinhTB) {
        ThuocTinhTB = thuocTinhTB;
    }

    public String getChiTietTrangBi() {
        return ChiTietTrangBi;
    }

    public void setChiTietTrangBi(String chiTietTrangBi) {
        ChiTietTrangBi = chiTietTrangBi;
    }

    public String getNoiTaiTB() {
        return NoiTaiTB;
    }

    public void setNoiTaiTB(String noiTaiTB) {
        NoiTaiTB = noiTaiTB;
    }

    public int getMatb() {
        return matb;
    }

    public void setMatb(int matb) {
        this.matb = matb;
    }

    public int getLoaiTB() {
        return LoaiTB;
    }

    public void setLoaiTB(int loaiTB) {
        LoaiTB = loaiTB;
    }

    public int getIconTB() {
        return iconTB;
    }

    public void setIconTB(int iconTB) {
        this.iconTB = iconTB;
    }



}
