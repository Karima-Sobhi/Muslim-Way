package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent18);
        ImageView intent19_img=findViewById(R.id.intent_img18);
        intent19_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent19_page19=new Intent(getApplicationContext(),intent19.class);
                startActivity(intent19_page19);
                finish();
            }
        });
    }
}