package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent39);
        ImageView intent40_img=findViewById(R.id.intent_img39);
        intent40_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent40_page40=new Intent(getApplicationContext(),intent40.class);
                startActivity(intent40_page40);
                finish();
            }
        });
    }
}