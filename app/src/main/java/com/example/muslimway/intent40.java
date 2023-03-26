package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent40);
        ImageView intent41_img=findViewById(R.id.intent_img40);
        intent41_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent41_page41=new Intent(getApplicationContext(),intent41.class);
                startActivity(intent41_page41);
                finish();
            }
        });
    }
}