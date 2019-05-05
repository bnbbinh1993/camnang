package com.bnb.binh.kimtinnsng.cactab;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bnb.binh.kimtinnsng.R;
import com.bnb.binh.kimtinnsng.admin.AdminB;
import com.bnb.binh.kimtinnsng.admin.LoginActivity;
import com.bnb.binh.kimtinnsng.admin.RegisterActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab_Six extends Fragment {
    private View mRootView;
    private Button Fanpage,Gruop,Youtuber,TaiTroVaQuangCao,QTVAdmin;

    public Tab_Six() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_tab__six, container, false);

        begin();
        event();

        return mRootView;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void begin()
    {
       Fanpage = (Button)mRootView.findViewById(R.id.fanpage);
       Gruop = (Button)mRootView.findViewById(R.id.gruop);
       Youtuber = (Button)mRootView.findViewById(R.id.youtuber);
        TaiTroVaQuangCao = (Button)mRootView.findViewById(R.id.taitrovaquangcao);
        QTVAdmin = (Button)mRootView.findViewById(R.id.adminqtv);
    }

    private void event()
    {
        QTVAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });


    }

}
