package com.example.acomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivityFromA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_from);
    }
}
