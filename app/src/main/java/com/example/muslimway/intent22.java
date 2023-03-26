package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent22);
        ImageView intent23_img=findViewById(R.id.intent_img22);
        intent23_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent23_page23=new Intent(getApplicationContext(),intent23.class);
                startActivity(intent23_page23);
                finish();
            }
        });
    }
}