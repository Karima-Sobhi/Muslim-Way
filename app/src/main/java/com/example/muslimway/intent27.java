package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent27);
        ImageView intent28_img=findViewById(R.id.intent_img27);
        intent28_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent28_page28=new Intent(getApplicationContext(),intent28.class);
                startActivity(intent28_page28);
                finish();
            }
        });
    }
}