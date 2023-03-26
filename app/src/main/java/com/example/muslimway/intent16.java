package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent16);
        ImageView intent17_img=findViewById(R.id.intent_img16);
        intent17_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent17_page17=new Intent(getApplicationContext(),intent17.class);
                startActivity(intent17_page17);
                finish();
            }
        });
    }
}