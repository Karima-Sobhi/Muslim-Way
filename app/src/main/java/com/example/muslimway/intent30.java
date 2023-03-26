package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent30);
        ImageView intent31_img=findViewById(R.id.intent_img30);
        intent31_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent31_page31=new Intent(getApplicationContext(),intent31.class);
                startActivity(intent31_page31);
                finish();
            }
        });
    }
}