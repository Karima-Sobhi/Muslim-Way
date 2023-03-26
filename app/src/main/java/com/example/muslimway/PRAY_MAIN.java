package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PRAY_MAIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pray_main);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn1_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn2_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn3_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn4_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn5_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn6_Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn7_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn8_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn9_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn10_Activity.class);

                startActivity(intent);
            }
        });
        findViewById(R.id.btn11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn11_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn12_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn13_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn14_Activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btn15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(PRAY_MAIN.this,btn15_Activity.class);
                startActivity(intent);
            }
        });
    }
}