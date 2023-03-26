package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent42 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent42);
        ImageView intent_h1_img=findViewById(R.id.intent_img42);
        intent_h1_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finishing=new Intent(getApplicationContext(),intent_h1.class);
                startActivity(finishing);
                finish();
            }
        });
    }
}