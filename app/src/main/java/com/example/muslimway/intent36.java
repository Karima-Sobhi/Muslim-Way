package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent36);
        ImageView intent37_img=findViewById(R.id.intent_img36);
        intent37_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent37_page37=new Intent(getApplicationContext(),intent37.class);
                startActivity(intent37_page37);
                finish();
            }
        });
    }
}