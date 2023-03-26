package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck10);
    }
    public void ReturntoBlanck9(View view) {
        Intent intent = new Intent(blanck10.this,blanck9.class);
        startActivity(intent);
    }

    public void GotoBlanck11(View view) {
        Intent intent = new Intent(blanck10.this,blanck11.class);
        startActivity(intent);
    }
}