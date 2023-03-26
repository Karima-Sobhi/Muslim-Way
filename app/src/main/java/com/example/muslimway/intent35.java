package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent35);
        ImageView intent36_img=findViewById(R.id.intent_img35);
        intent36_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent36_page36=new Intent(getApplicationContext(),intent36.class);
                startActivity(intent36_page36);
                finish();
            }
        });
    }
}