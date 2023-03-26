package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck9);
    }
    public void ReturntoBlanck8(View view) {
        Intent intent = new Intent(blanck9.this,blanck8.class);
        startActivity(intent);
    }

    public void GotoBlanck10(View view) {
        Intent intent = new Intent(blanck9.this,blanck10.class);
        startActivity(intent);

    }}