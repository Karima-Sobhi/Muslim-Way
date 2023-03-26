package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck2);
    }
    public void ReturntoBlanck1(View view) {
        Intent intent = new Intent(blanck2.this,blanck1.class);
        startActivity(intent);
    }

    public void Goto1blanck3(View view) {
        Intent intent = new Intent(blanck2.this,blanck3.class);
        startActivity(intent);

    }
}