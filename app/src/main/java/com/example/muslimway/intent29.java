package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent29 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent29);
        ImageView intent30_img=findViewById(R.id.intent_img29);
        intent30_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent30_page30=new Intent(getApplicationContext(),intent30.class);
                startActivity(intent30_page30);
                finish();
            }
        });
    }
}