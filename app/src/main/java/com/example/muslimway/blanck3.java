package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck3);
    }
    public void ReturntoBlanck2(View view) {
        Intent intent = new Intent(blanck3.this,blanck2.class);
        startActivity(intent);
    }

    public void GotoBlanck4(View view) {
        Intent intent = new Intent(blanck3.this,blanck4.class);
        startActivity(intent);
    }
}