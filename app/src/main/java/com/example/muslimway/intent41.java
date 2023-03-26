package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent41);
        ImageView intent42_img=findViewById(R.id.intent_img41);
        intent42_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent42_page42=new Intent(getApplicationContext(),intent42.class);
                startActivity(intent42_page42);
                finish();
            }
        });
    }
}