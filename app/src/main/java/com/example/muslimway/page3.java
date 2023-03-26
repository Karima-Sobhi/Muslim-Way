package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }
    public void ReturntoPage2(View view) {
        Intent intent = new Intent(page3.this,page2.class);
        startActivity(intent);

    }

    public void GotoPage4(View view) {
        Intent intent = new Intent(page3.this,page4.class);
        startActivity(intent);

    }
}