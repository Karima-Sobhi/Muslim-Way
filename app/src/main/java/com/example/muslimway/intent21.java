package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class intent21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent21);
        ImageView intent22_img=findViewById(R.id.intent_img21);
        intent22_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22_page22=new Intent(getApplicationContext(),intent22.class);
                startActivity(intent22_page22);
                finish();
            }
        });
    }

}