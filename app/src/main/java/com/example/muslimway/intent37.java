package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent37 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent37);
        ImageView intent38_img=findViewById(R.id.intent_img37);
        intent38_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent38_page38=new Intent(getApplicationContext(),intent38.class);
                startActivity(intent38_page38);
                finish();
            }
        });
    }
}