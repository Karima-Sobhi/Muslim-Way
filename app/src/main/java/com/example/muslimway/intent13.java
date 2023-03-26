package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent13);
        ImageView intent14_img=findViewById(R.id.intent_img13);
        intent14_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14_page14=new Intent(getApplicationContext(),intent14.class);
                startActivity(intent14_page14);
                finish();
            }
        });
    }
}