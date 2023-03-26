package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent12);
        ImageView intent13_img=findViewById(R.id.intent_img12);
        intent13_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13_page13=new Intent(getApplicationContext(),intent13.class);
                startActivity(intent13_page13);
                finish();
            }
        });
    }
}