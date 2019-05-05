package com.bnb.binh.kimtinnsng.cactab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bnb.binh.kimtinnsng.R;
import com.bnb.binh.kimtinnsng.tuong.ViewAdapterTuong;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab_Five extends Fragment {
    
    private View mRootView;
    public Tab_Five() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_tab__five, container, false);

//        ecyclerView = (RecyclerView)mRootView.findViewById(R.id.recyclerView_Tab2);
//        ViewAdapterTuong viewAdapterTuong = new ViewAdapterTuong(getContext(),tuongAdapters);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),5));
//        recyclerView.setAdapter(viewAdapterTuong);

        return mRootView;
    }

}
