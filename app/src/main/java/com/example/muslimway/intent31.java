package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent31);
        ImageView intent32_img=findViewById(R.id.intent_img31);
        intent32_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent32_page32=new Intent(getApplicationContext(),intent32.class);
                startActivity(intent32_page32);
                finish();
            }
        });
    }
}