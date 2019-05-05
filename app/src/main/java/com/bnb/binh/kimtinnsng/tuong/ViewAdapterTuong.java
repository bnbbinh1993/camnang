package com.bnb.binh.kimtinnsng.tuong;

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

    public class ViewAdapterTuong extends RecyclerView.Adapter<ViewAdapterTuong.MyViewHolder> {

    Context context;
    List<TuongAdapter> mData;

    public ViewAdapterTuong(Context context, List<TuongAdapter> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_tuong,viewGroup,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);


        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.TenTuong.setText(mData.get(i).getTentuong());
        myViewHolder.ThuocTinhTuong.setText(mData.get(i).getThuoctinhtuong());
        myViewHolder.IconTuong.setImageResource(mData.get(i).getIcontuong());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder  extends RecyclerView.ViewHolder{
        private TextView TenTuong;
        private TextView ThuocTinhTuong;
        private ImageView IconTuong;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            TenTuong = (TextView ) itemView.findViewById(R.id.tentuong);
            ThuocTinhTuong = (TextView) itemView.findViewById(R.id.thuoctinhtuong);
            IconTuong = (ImageView) itemView.findViewById(R.id.icon_tuong);


        }
    }
}
