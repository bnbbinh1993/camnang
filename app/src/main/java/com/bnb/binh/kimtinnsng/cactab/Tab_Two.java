package com.bnb.binh.kimtinnsng.cactab;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnb.binh.kimtinnsng.R;
import com.bnb.binh.kimtinnsng.tuong.TuongAdapter;
import com.bnb.binh.kimtinnsng.tuong.ViewAdapterTuong;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab_Two extends Fragment {

    private View mRootView;

    private RecyclerView recyclerView;
    private List<TuongAdapter> tuongAdapters;

    public Tab_Two() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mRootView = inflater.inflate(R.layout.fragment_tab__two, container, false);

        recyclerView = (RecyclerView)mRootView.findViewById(R.id.recyclerView_Tab2);
        ViewAdapterTuong viewAdapterTuong = new ViewAdapterTuong(getContext(),tuongAdapters);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),5));
        recyclerView.setAdapter(viewAdapterTuong);

        return mRootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tuongAdapters = new ArrayList<>();
        tuongAdapters.add(new TuongAdapter("Areus","Xạ Thủ",R.mipmap.areus));
        tuongAdapters.add(new TuongAdapter("Chronos","Xạ Thủ",R.mipmap.chronos));
        tuongAdapters.add(new TuongAdapter("Clara","Xạ Thủ",R.mipmap.clara));
        tuongAdapters.add(new TuongAdapter("Dasua","Xạ Thủ",R.mipmap.dasua));
        tuongAdapters.add(new TuongAdapter("Grimz","Xạ Thủ",R.mipmap.grimz));
        tuongAdapters.add(new TuongAdapter("Hit","Xạ Thủ",R.mipmap.hit));
        tuongAdapters.add(new TuongAdapter("Irene","Xạ Thủ",R.mipmap.irene));
        tuongAdapters.add(new TuongAdapter("Jiden","Xạ Thủ",R.mipmap.jiden));
        tuongAdapters.add(new TuongAdapter("Jin","Xạ Thủ",R.mipmap.jin));
        tuongAdapters.add(new TuongAdapter("Judoken","Xạ Thủ",R.mipmap.judoken));
        tuongAdapters.add(new TuongAdapter("Judy","Xạ Thủ",R.mipmap.judy));
        tuongAdapters.add(new TuongAdapter("Kajin","Xạ Thủ",R.mipmap.kajin));
        tuongAdapters.add(new TuongAdapter("Katos","Xạ Thủ",R.mipmap.katos));
        tuongAdapters.add(new TuongAdapter("Konnos","Xạ Thủ",R.mipmap.konnor));
        tuongAdapters.add(new TuongAdapter("Kuma","Xạ Thủ",R.mipmap.kuma));
        tuongAdapters.add(new TuongAdapter("Leolas","Xạ Thủ",R.mipmap.leolas));
        tuongAdapters.add(new TuongAdapter("Lily","Xạ Thủ",R.mipmap.lily));
        tuongAdapters.add(new TuongAdapter("Marko","Xạ Thủ",R.mipmap.marko));
        tuongAdapters.add(new TuongAdapter("Moses","Xạ Thủ",R.mipmap.moses));
        tuongAdapters.add(new TuongAdapter("Quan Vu","Xạ Thủ",R.mipmap.quanvu));
        tuongAdapters.add(new TuongAdapter("Rhino","Xạ Thủ",R.mipmap.rhino));
        tuongAdapters.add(new TuongAdapter("Rion","Xạ Thủ",R.mipmap.rion));
        tuongAdapters.add(new TuongAdapter("Ryu","Xạ Thủ",R.mipmap.ryu));
        tuongAdapters.add(new TuongAdapter("Scarlet","Xạ Thủ",R.mipmap.scarlet));
        tuongAdapters.add(new TuongAdapter("Sherlyn","Xạ Thủ",R.mipmap.sherlyn));
        tuongAdapters.add(new TuongAdapter("Tadin","Xạ Thủ",R.mipmap.tadin));
        tuongAdapters.add(new TuongAdapter("Teresa","Xạ Thủ",R.mipmap.teresa));
        tuongAdapters.add(new TuongAdapter("Thalas","Xạ Thủ",R.mipmap.thalas));
        tuongAdapters.add(new TuongAdapter("Triệu Vân","Xạ Thủ",R.mipmap.trieuvan));
        tuongAdapters.add(new TuongAdapter("Tripu","Xạ Thủ",R.mipmap.tripu));
        tuongAdapters.add(new TuongAdapter("Valdaken","Xạ Thủ",R.mipmap.valdaken));
        tuongAdapters.add(new TuongAdapter("Xena","Xạ Thủ",R.mipmap.xena));
        tuongAdapters.add(new TuongAdapter("Zeist","Xạ Thủ",R.mipmap.zeist));

    }
}
