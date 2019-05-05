package com.bnb.binh.kimtinnsng.quanlydatabase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class TrangBiConTroler {
    private DBHelper dbHelper;


    public TrangBiConTroler(Context context){ dbHelper = new DBHelper(context);}
    public ArrayList<TrangBiDB>getTrangBiDBS(int LoaiTB){
     ArrayList<TrangBiDB> lsData = new ArrayList<TrangBiDB>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM trangbi WHERE loaitb='1'",null);
        cursor.moveToFirst();
        do {
            TrangBiDB item;
            item = new TrangBiDB(cursor.getInt(0),cursor.getInt(1),cursor.getString(2)
                    ,cursor.getString(3),cursor.getString(4),cursor.getString(5)
                    ,cursor.getInt(6),cursor.getInt(7));

        lsData.add(item);
        } while (cursor.moveToNext());
        return lsData;

    }

}
