package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class y1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y1);
        Button Btn_ll=findViewById(R.id.abluationbyimages);

        Button Btn_ww1=findViewById(R.id.howtoabluation);

        Button Btn_ww3=findViewById(R.id.prayafter);

        Btn_ww1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent ww =new Intent(getBaseContext(),howtoablution.class);
                startActivity(ww);
            }
        });
        Btn_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ww1=new Intent(getBaseContext(),abluationbyimages.class);
                startActivity(ww1);
            }
        });

        Btn_ww3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ww3=new Intent(getBaseContext(),after.class);
                startActivity(ww3);
            }
        });
    }
}