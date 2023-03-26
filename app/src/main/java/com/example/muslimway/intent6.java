package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent6);
        ImageView intent7_img=findViewById(R.id.intent_img6);
        intent7_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7_page7=new Intent(getApplicationContext(),intent7.class);
                startActivity(intent7_page7);

            }
        });
    }
    }
