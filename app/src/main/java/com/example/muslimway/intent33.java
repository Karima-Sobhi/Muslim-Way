package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent33);
        ImageView intent34_img=findViewById(R.id.intent_img33);
        intent34_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent34_page34=new Intent(getApplicationContext(),intent34.class);
                startActivity(intent34_page34);
                finish();
            }
        });
    }
}