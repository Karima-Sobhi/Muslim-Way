package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
    }
    public void Gotopage1(View view) {
        Intent intent =new Intent(MainActivity12.this,g2.class);
        startActivity(intent);

    }

    public void GotoBlanck1(View view) {
        Intent intent =new Intent(MainActivity12.this,design1.class);
        startActivity(intent);


    }
}