package com.example.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.SimpleCursorTreeAdapter;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private  ImageButton ib;
    private  ImageView iv;
    private  Switch sw;
    private  RadioButton rb;
    private CheckBox ch;
    private RadioButton rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib=findViewById(R.id.imageView2);
        iv=findViewById(R.id.iv1);
        sw=findViewById(R.id.sw_ma);
        rb=findViewById(R.id.enabled);
        rb2=findViewById(R.id.disabled);
        ch=findViewById(R.id.cb1);
        iv.setVisibility(View.INVISIBLE);
        ib.setEnabled(false);
        ib.setVisibility(View.INVISIBLE);
        ch.setChecked(false);
        rb2.setChecked(true);
    }

    public void onRefresh(View view) {

        if(rb.isChecked())
            ib.setEnabled(true);
        else
            ib.setEnabled(false);
        boolean check=ch.isChecked();
        if(check)
            ib.setVisibility(View.VISIBLE);
        else
            ib.setVisibility(View.INVISIBLE);

        boolean checkswitch=sw.isChecked();
        if(checkswitch)
            iv.setVisibility(View.VISIBLE);
        else
            iv.setVisibility(View.INVISIBLE);
    }



}
