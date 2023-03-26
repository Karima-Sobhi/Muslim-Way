package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent25);
        ImageView intent26_img=findViewById(R.id.intent_img25);
        intent26_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent26_page26=new Intent(getApplicationContext(),intent26.class);
                startActivity(intent26_page26);
                finish();
            }
        });
    }
}