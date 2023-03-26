package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck7);
    }
    public void ReturntoBlanck6(View view) {
        Intent intent = new Intent(blanck7.this,blanck6.class);
        startActivity(intent);
    }

    public void GotoBlanck8(View view) {
        Intent intent = new Intent(blanck7.this,blanck8.class);
        startActivity(intent);
    }
}