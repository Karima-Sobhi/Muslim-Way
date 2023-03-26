package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class g1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g1);
    }
    public void Gotopage1(View view) {
        Intent intent =new Intent(g1.this,g2.class);
        startActivity(intent);

    }

    public void GotoBlanck1(View view) {
        Intent intent =new Intent(g1.this,design1.class);
        startActivity(intent);


    }

//    public void home(View view) {
//        Intent intent =new Intent(g1.this,MainActivity.class);
//        startActivity(intent);
//        finish();
//    }
}