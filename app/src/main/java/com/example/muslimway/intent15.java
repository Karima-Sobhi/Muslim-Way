package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent15);
        ImageView intent16_img=findViewById(R.id.intent_img15);
        intent16_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16_page16=new Intent(getApplicationContext(),intent16.class);
                startActivity(intent16_page16);
                finish();
            }
        });
    }
}