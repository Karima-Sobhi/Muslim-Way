package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class blanck11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanck11);
    }
    public void ReturbtoBlanck10(View view) {
        Intent intent = new Intent(blanck11.this,blanck10.class);
        startActivity(intent);
    }

    public void GotoBlanck12(View view) {
        Intent intent = new Intent(blanck11.this,blanck12.class);
        startActivity(intent);
    }
}