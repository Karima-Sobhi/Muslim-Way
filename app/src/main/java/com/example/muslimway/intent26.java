package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent26);
        ImageView intent27_img=findViewById(R.id.intent_img26);
        intent27_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent27_page27=new Intent(getApplicationContext(),intent27.class);
                startActivity(intent27_page27);
                finish();
            }
        });
    }
}