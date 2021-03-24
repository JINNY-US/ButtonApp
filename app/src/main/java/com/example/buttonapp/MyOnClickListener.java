package com.example.buttonapp;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        mainActivity.mtextview1.setText("You clicked 김경진의 button");
    }
}
