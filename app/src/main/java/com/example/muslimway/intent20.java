package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent20);
        ImageView intent21_img=findViewById(R.id.intent_img20);
        intent21_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent21_page21=new Intent(getApplicationContext(),intent21.class);
                startActivity(intent21_page21);
                finish();
            }
        });
    }
}