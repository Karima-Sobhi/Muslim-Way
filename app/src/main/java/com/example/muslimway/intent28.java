package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent28);
        ImageView intent29_img=findViewById(R.id.intent_img28);
        intent29_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent29_page29=new Intent(getApplicationContext(),intent29.class);
                startActivity(intent29_page29);
                finish();
            }
        });
    }
}