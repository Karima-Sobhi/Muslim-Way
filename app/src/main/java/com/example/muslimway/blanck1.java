package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck1);
    }
    public void ReturntoActivty(View view) {
        Intent intent = new Intent(blanck1.this,g1.class);
        startActivity(intent);
    }

    public void GotoBlanck2(View view) {
        Intent intent = new Intent(blanck1.this,blanck2.class);
        startActivity(intent);

    }

}