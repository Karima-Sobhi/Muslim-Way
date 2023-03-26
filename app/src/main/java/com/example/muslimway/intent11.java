package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent11);
        ImageView intent12_img=findViewById(R.id.intent_img11);
        intent12_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12_page12=new Intent(getApplicationContext(),intent12.class);
                startActivity(intent12_page12);
                finish();
            }
        });
    }
}