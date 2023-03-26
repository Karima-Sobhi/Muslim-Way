package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent19);
        ImageView intent20_img=findViewById(R.id.intent_img19);
        intent20_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent20_page20=new Intent(getApplicationContext(),intent20.class);
                startActivity(intent20_page20);
                finish();
            }
        });
    }
}