package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent38);
        ImageView intent39_img=findViewById(R.id.intent_img38);
        intent39_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent39_page39=new Intent(getApplicationContext(),intent39.class);
                startActivity(intent39_page39);
                finish();
            }
        });
    }
}