package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck4);
    }
    public void ReturntoBlanck3(View view) {
        Intent intent = new Intent(blanck4.this,blanck3.class);
        startActivity(intent);
    }

    public void GotoBlanck5(View view) {
        Intent intent = new Intent(blanck4.this,blanck5.class);
        startActivity(intent);
    }
}