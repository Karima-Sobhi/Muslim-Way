package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent17);
        ImageView intent18_img=findViewById(R.id.intent_img17);
        intent18_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent18_page18=new Intent(getApplicationContext(),intent18.class);
                startActivity(intent18_page18);
                finish();
            }
        });
    }
}