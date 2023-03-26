package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck8);
    }
    public void ReturntoBlanck7(View view) {
        Intent intent = new Intent(blanck8.this,blanck7.class);
        startActivity(intent);
    }

    public void GotoBlanc9(View view) {
        Intent intent = new Intent(blanck8.this,blanck9.class);
        startActivity(intent);
    }
}