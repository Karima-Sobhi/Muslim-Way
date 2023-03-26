package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent14);
        ImageView intent15_img=findViewById(R.id.intent_img14);
        intent15_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent15_page15=new Intent(getApplicationContext(),intent15.class);
                startActivity(intent15_page15);
                finish();
            }
        });
    }
}