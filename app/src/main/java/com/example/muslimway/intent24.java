package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent24);
        ImageView intent25_img=findViewById(R.id.intent_img24);
        intent25_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent25_page25=new Intent(getApplicationContext(),intent25.class);
                startActivity(intent25_page25);
                finish();
            }
        });
    }
}