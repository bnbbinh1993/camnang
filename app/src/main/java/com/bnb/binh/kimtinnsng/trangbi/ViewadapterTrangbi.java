package com.bnb.binh.kimtinnsng.trangbi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bnb.binh.kimtinnsng.R;

import java.util.List;

public class ViewadapterTrangbi extends RecyclerView.Adapter<ViewadapterTrangbi.MyHolder> {

    Context context;
    List<TrangbiAdapter> mData;

    public ViewadapterTrangbi(Context context, List<TrangbiAdapter> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewadapterTrangbi.MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_trangbi,viewGroup,false);
        MyHolder myHolder= new MyHolder(v);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewadapterTrangbi.MyHolder myHolder, int i) {
            myHolder.TenTrangBiVatLy.setText(mData.get(i).getTentrangbivatly());
            myHolder.ThuocTinhTrangBiVatLy.setText(mData.get(i).getThuoctinhtrangbivatly());
            myHolder.IconTrangBiVatLy.setImageResource(mData.get(i).getIcontrangbivatly());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        private TextView TenTrangBiVatLy;
        private TextView ThuocTinhTrangBiVatLy;
        private ImageView IconTrangBiVatLy;


        public MyHolder(@NonNull View itemView) {
            super(itemView);
            TenTrangBiVatLy = (TextView) itemView.findViewById(R.id.tentrangbi);
            ThuocTinhTrangBiVatLy = (TextView)itemView.findViewById(R.id.thuoctinhtrangbi);
            IconTrangBiVatLy = (ImageView)itemView.findViewById(R.id.icon_trangbi);

        }
    }
}
