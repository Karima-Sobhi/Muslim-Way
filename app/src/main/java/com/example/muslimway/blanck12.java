package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck12);
    }
    public void ReturntoBlanck11(View view) {
        Intent intent = new Intent(blanck12.this,blanck11.class);
        startActivity(intent);
    }

    public void ReturnToFirst(View view) {
        Intent intent = new Intent(blanck12.this,g1.class);
        startActivity(intent);
    }
}