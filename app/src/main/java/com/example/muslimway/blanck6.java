package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck6);
    }
    public void ReturntoBlanck5(View view) {
        Intent intent = new Intent(blanck6.this,blanck5.class);
        startActivity(intent);
    }

    public void GotoBlanck7(View view) {
        Intent intent = new Intent(blanck6.this,blanck7.class);
        startActivity(intent);
    }
}