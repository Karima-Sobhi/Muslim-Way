package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck5);
    }
    public void ReturntoBlanck4(View view) {
        Intent intent = new Intent(blanck5.this,blanck4.class);
        startActivity(intent);
    }

    public void Gotoblanck6(View view) {
        Intent intent = new Intent(blanck5.this,blanck6.class);
        startActivity(intent);

    }}