package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
    }
    public void ReturntoPage3(View view) {
        Intent intent = new Intent(page4.this,page3.class);
        startActivity(intent);

    }

    public void ReturntoHome(View view) {
        Intent intent = new Intent(page4.this,g1.class);
        startActivity(intent);

    }
}