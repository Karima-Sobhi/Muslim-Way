package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent32);
        ImageView intent33_img=findViewById(R.id.intent_img32);
        intent33_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent33_page33=new Intent(getApplicationContext(),intent33.class);
                startActivity(intent33_page33);
                finish();
            }
        });
    }
}