package com.bnb.binh.kimtinnsng.cactab;


import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnb.binh.kimtinnsng.R;
import com.bnb.binh.kimtinnsng.quanlydatabase.DBHelper;
import com.bnb.binh.kimtinnsng.quanlydatabase.TrangBiConTroler;
import com.bnb.binh.kimtinnsng.quanlydatabase.TrangBiDB;
import com.bnb.binh.kimtinnsng.trangbi.TrangbiAdapter;
import com.bnb.binh.kimtinnsng.trangbi.ViewadapterTrangbi;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tap_Three extends Fragment {
    private View mRootView;
    private TrangBiConTroler trangBiConTroler;
    private ArrayList<TrangBiDB> trangBiDBS;


    private RecyclerView recyclerViewRung;





  //
    private RecyclerView recyclerViewCongVatLy;



    private List<TrangbiAdapter> trangbiCongVatLyAdapters;



    public Tap_Three() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_tap__three, container, false);




        abctam();
        return mRootView;
    }




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     addTrangBiVatLy();



    }



    private void addTrangBiVatLy() {
        trangbiCongVatLyAdapters = new ArrayList<>();
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Bán Nguyệt Kịch","Công Vật Lý",R.drawable.bannguyetkich));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Cung Ánh Sáng","Công Vật Lý",R.drawable.cunganhsang));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Chùy Bạc","Công Vật Lý",R.drawable.chuybac));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Chùy Băng","Công Vật Lý",R.drawable.chuybang));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Đao Hung Tàn","Công Vật Lý",R.drawable.daohungtan));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Gai Xuyên Thấu","Công Vật Lý",R.drawable.gaixuyenthau));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Găng Bộc Phá","Công Vật Lý",R.drawable.gangbocpha));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Gậy Hung Tàn","Công Vật Lý",R.drawable.gayhungtan));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Liềm Đoạn Mệnh","Công Vật Lý",R.drawable.liemdoatmenh));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Liệt Giáp Phụ","Công Vật Lý",R.drawable.lietgiapphu));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Nỏ Sấm Sét","Công Vật Lý",R.drawable.nosamset));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Rìu Hoang Dã","Công Vật Lý",R.drawable.riuhoangda));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Song Kiếm Hắc Ám","Công Vật Lý",R.drawable.songkiemhacam));
        // cong ap
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Băng Cầu","Công Phép",R.drawable.bangcau));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Gậy Đầu Lâu","Công Phép",R.drawable.gaydaulau));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Giáp Ngọc","Công Phép",R.drawable.giapngoc));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("La Bàn Cổ","Công Phép",R.drawable.labanco));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Mũ Pháp Sư","Công Phép",R.drawable.muphapsu));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Mũ Tử Thần","Công Phép",R.drawable.mututhan));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Nhẫn Vô Cực","Công Phép",R.drawable.nhanvocuc));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Phong Linh","Công Phép",R.drawable.phonglinh));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Sách Quỷ","Công Phép",R.drawable.sachquy));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Tro Tàn","Công Phép",R.drawable.trotan));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Trượng Phòng Hộ","Công Phép",R.drawable.truongphongho));
        // thu
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Áo Choàng Băng Giá","Thủ",R.drawable.aochoangbanggia));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Bùa Hộ Mênh","Thủ",R.drawable.buahomenh));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Đai Khổng Lồ","Thủ",R.drawable.daikhonglo));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Giáp Băng","Thủ",R.drawable.giapbang));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Giáp Lửa","Thủ",R.drawable.giaplua));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Khiên Thiên Sứ","Thủ",R.drawable.khienthiensu));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Khiên Gai","Thủ",R.drawable.khiengai));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Mũ Sắt","Thủ",R.drawable.musat));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Ngọc Bích","Thủ",R.drawable.ngocbich));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Nguyệt Nhẫn","Thủ",R.drawable.nguyetnhan));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Trống Cổ","Thủ",R.drawable.trongco));

        // rung

        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Đao Đoạt Mênh","Rừng",R.drawable.daodoatmenh));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Đao Truy Hồn","Rừng",R.drawable.daotruyhon));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Đao Truy Kích","Rừng",R.drawable.daotruykich));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Khiên Quân Đoàn","Rừng",R.drawable.khienquandoan));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Ngọc Cẩm Thạch","Rừng",R.drawable.ngoccamthach));

        // toc do

        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Giày Khai Sáng","Tốc Chạy",R.drawable.giaykhaisang));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Giày Cuồng Nộ","Tốc Chạy",R.drawable.giaycuongno));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Giày Hộ Vệ","Tốc Chạy",R.drawable.giayhove));
        trangbiCongVatLyAdapters.add(new TrangbiAdapter("Giày Sinh Mệnh","Tốc Chạy",R.drawable.giaysinhmenh));

    }
    private void abctam(){


        recyclerViewCongVatLy = (RecyclerView)mRootView.findViewById(R.id.cong_vat_ly);
        ViewadapterTrangbi viewadapterTrangbi = new ViewadapterTrangbi(getContext(),trangbiCongVatLyAdapters);
        recyclerViewCongVatLy.setHasFixedSize(true);
        recyclerViewCongVatLy.setLayoutManager(new GridLayoutManager(getActivity(),5));
        recyclerViewCongVatLy.setAdapter(viewadapterTrangbi);


    }
}
