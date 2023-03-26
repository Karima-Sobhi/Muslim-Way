package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent23);
        ImageView intent24_img=findViewById(R.id.intent_img23);
        intent24_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24_page24=new Intent(getApplicationContext(),intent24.class);
                startActivity(intent24_page24);
                finish();
            }
        });
    }
}