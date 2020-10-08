package com.example.bcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivityFromB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_from);
    }
}
