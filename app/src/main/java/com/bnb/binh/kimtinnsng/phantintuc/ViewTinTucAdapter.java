package com.bnb.binh.kimtinnsng.phantintuc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bnb.binh.kimtinnsng.R;
import com.bnb.binh.kimtinnsng.tuong.TuongAdapter;
import com.bnb.binh.kimtinnsng.tuong.ViewAdapterTuong;

import org.w3c.dom.Text;

import java.util.List;

public class ViewTinTucAdapter extends RecyclerView.Adapter<ViewTinTucAdapter.MeHolder> {
    Context context;
    List<TinTucAdapter> mData;

    public ViewTinTucAdapter(Context context, List<TinTucAdapter> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewTinTucAdapter.MeHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_tin_tuc,viewGroup,false);
        MeHolder meHolder = new MeHolder(v);
        return meHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewTinTucAdapter.MeHolder meHolder, int i) {
        meHolder.tentintuc.setText(mData.get(i).getTen_tin_tuc());
        meHolder.icontintuc.setImageResource(mData.get(i).getIcon_tin_tuc());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MeHolder extends RecyclerView.ViewHolder {
        private TextView tentintuc;
        private ImageView icontintuc;

        public MeHolder(@NonNull View itemView) {
            super(itemView);
            tentintuc = (TextView)itemView.findViewById(R.id.ten_su_kien);
            icontintuc = (ImageView)itemView.findViewById(R.id.icon_tin_tuc);


        }
    }
}
