package com.example.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    Button mButton1;
    TextView mtextview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button)findViewById(R.id.button);
        mtextview1 = (TextView)findViewById(R.id.textView2);

        mButton1.setOnClickListener(new MyOnClickListener(this));
    }
}