package com.bnb.binh.kimtinnsng;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.bnb.binh.kimtinnsng.cactab.Tab_Five;
import com.bnb.binh.kimtinnsng.cactab.Tab_Four;
import com.bnb.binh.kimtinnsng.cactab.Tab_One;
import com.bnb.binh.kimtinnsng.cactab.Tab_Six;
import com.bnb.binh.kimtinnsng.cactab.Tab_Two;
import com.bnb.binh.kimtinnsng.cactab.Tap_Three;
/*
 code by BNB
 */

public class MyAdapter extends FragmentStatePagerAdapter {
    private String ListTab [] = {"Tin Tức","Tướng","Trang Bị","Phép Bổ Trợ", "Khắc Chế Tướng", "Giải Trí & Thư Giãn"};
    private Tab_One tab_one;
    private Tab_Two tab_two;
    private Tap_Three tab_three;
    private Tab_Four tab_four;
    private Tab_Five tab_five;
    private Tab_Six tab_six;

    public MyAdapter(FragmentManager fm)
    {
        super(fm);

        tab_one = new Tab_One();
        tab_two = new Tab_Two();
        tab_three = new Tap_Three();
        tab_four = new Tab_Four();
        tab_five = new Tab_Five();
        tab_six = new Tab_Six();
    }



    @Override
    public Fragment getItem(int i)
    {
        if (i == 0)
        {
            return tab_one;
        }
        else if (i == 1)
        {
            return tab_two;
        }
        else if (i == 2)
        {
            return tab_three;
        }
        else if (i == 3)
        {
            return tab_four;
        }
        else if (i == 4)
        {
            return tab_five;
        }
        else if (i== 5 )
        {
            return tab_six;
        }
        else {
            // thêm tab ở đây
        }
            return null;

    }



    @Override
    public int getCount() {
        return ListTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return ListTab[position];
    }
}
