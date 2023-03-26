package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class g3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g3);
        Button btn=(Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num1=new Intent(getApplicationContext(),MainActivity1.class);
                startActivity(num1);

            }
        });

        Button bt=(Button) findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num1=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(num1);

            }
        });
        Button btn1=(Button) findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num1=new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(num1);

            }
        });
        Button btn2=(Button) findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num1=new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(num1);

            }
        });
        Button btn3=(Button) findViewById(R.id.button6);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num1=new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(num1);

            }
        });

        Button btn4=(Button) findViewById(R.id.button7);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num1=new Intent(getApplicationContext(),MainActivity6.class);
                startActivity(num1);

            }
        });

        Button btn5=(Button) findViewById(R.id.button8);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num1=new Intent(getApplicationContext(),MainActivity7.class);
                startActivity(num1);

            }
        });
        Button btn6=(Button) findViewById(R.id.button9);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num1=new Intent(getApplicationContext(),MainActivity8.class);
                startActivity(num1);

            }
        });

        Button btn7=(Button) findViewById(R.id.button10);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num1=new Intent(getApplicationContext(),MainActivity9.class);
                startActivity(num1);

            }
        });


        Button btn9=(Button) findViewById(R.id.button12);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent num1=new Intent(getApplicationContext(),MainActivity11.class);
                startActivity(num1);

            }
        });
    }
}