package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class g2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g2);
    }
    public void GotoPage2(View view) {
        Intent intent = new Intent(g2.this,page2.class);
        startActivity(intent);

    }

    public void ReturntoBack(View view) {
        Intent intent = new Intent(g2.this,g1.class);
        startActivity(intent);
    }
}