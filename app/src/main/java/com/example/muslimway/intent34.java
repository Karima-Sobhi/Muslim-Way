package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent34);
        ImageView intent35_img=findViewById(R.id.intent_img34);
        intent35_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent35_page35=new Intent(getApplicationContext(),intent35.class);
                startActivity(intent35_page35);
                finish();
            }
        });
    }
}