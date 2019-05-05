package com.bnb.binh.kimtinnsng.cactab;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.bnb.binh.kimtinnsng.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Tab_One extends Fragment {
    private View mRootView;
    private RecyclerView recyclerView;
    private ArrayAdapter<String> arrayAdapter;
    private ArrayList<String> list_tin_tuc = new ArrayList<>();

    private DatabaseReference TinTucF;


    public Tab_One() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView =  inflater.inflate(R.layout.fragment_tab_one, container, false);
//        TinTucF = FirebaseDatabase.getInstance().getReference().child("TinTuc");
        begin();

        return mRootView;
    }

    private void begin()
    {
        recyclerView = (RecyclerView)mRootView.findViewById(R.id.recyclerView_tab1);


    }



    private void RetrieveAndDisplayGruops()
    {
        TinTucF.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {

                Set<String> set = new HashSet<>();
                Iterator iterator = dataSnapshot.getChildren().iterator();
                while (iterator.hasNext())
                {
                    set.add(((DataSnapshot)iterator.next()).getKey());
                }

                list_tin_tuc.clear();
                list_tin_tuc.addAll(set);
                arrayAdapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

}
