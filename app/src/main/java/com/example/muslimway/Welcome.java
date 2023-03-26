package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ImageView welcome=(ImageView)findViewById(R.id.welcomimage);
        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(2000);
                    Intent main=new Intent(Welcome.this,MainActivity.class);
                    startActivity(main);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

    }
}