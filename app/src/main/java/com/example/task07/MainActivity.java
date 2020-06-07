package com.example.task07;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    RadioButton rB1,rB2,rB3,rB4;
    LinearLayout lL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw=(Switch)findViewById(R.id.sw);
        rB1=(RadioButton)findViewById(R.id.rB1);
        rB2=(RadioButton)findViewById(R.id.rB2);
        rB3=(RadioButton)findViewById(R.id.rB3);
        rB4=(RadioButton)findViewById(R.id.rB4);
        lL=(LinearLayout)findViewById(R.id.lL);
    }

    public void colorChanger(View view) {
        if (sw.isChecked()){
            if(rB1.isChecked())lL.setBackgroundColor(Color.GREEN);
            else if(rB2.isChecked())lL.setBackgroundColor(Color.RED);
            else if(rB3.isChecked())lL.setBackgroundColor(Color.BLUE);
            else if(rB4.isChecked())lL.setBackgroundColor(Color.LTGRAY);
        }
    }
    public void intColor1(View view) {
        if (! sw.isChecked()){
            lL.setBackgroundColor(Color.GRAY);
        }
    }

    public void intColor2(View view) {
        if (! sw.isChecked()){
            lL.setBackgroundColor(Color.CYAN);
        }
    }

    public void instColor3(View view) {
        if (! sw.isChecked()){
            lL.setBackgroundColor(Color.YELLOW);
        }
    }

    public void instColor4(View view) {
        if (! sw.isChecked()){
            lL.setBackgroundColor(Color.DKGRAY);
        }
    }
}
