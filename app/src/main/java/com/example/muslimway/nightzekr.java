package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nightzekr extends AppCompatActivity {
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15;
    private Button b16;
    private Button b17;
    private Button b18;
    private Button b19;
    private Button b20;
    private Button b21;
    private Button b22;
    private Button b25;
    private Button b26;
    private Button b30;

    private static int  i=3;
    String p="";
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nightzekr);
        b3=(Button)findViewById(R.id.b3) ;
        b5=(Button) findViewById(R.id.b5);
        b4=(Button) findViewById(R.id.b4);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        b10=(Button) findViewById(R.id.b10);
        b11=(Button) findViewById(R.id.b11);
        b12=(Button) findViewById(R.id.b12);
        b13=(Button) findViewById(R.id.b13);
        b14=(Button) findViewById(R.id.b14);
        b15=(Button) findViewById(R.id.b15);
        b16=(Button) findViewById(R.id.b16);
        b17=(Button) findViewById(R.id.b17);
        b18=(Button) findViewById(R.id.b18);
        b19=(Button) findViewById(R.id.b19);
        b20=(Button) findViewById(R.id.b20);
        b21=(Button) findViewById(R.id.b21);
        b22=(Button) findViewById(R.id.b22);

        b25=(Button) findViewById(R.id.b25);
        b26=(Button) findViewById(R.id.b26);
        b30=(Button) findViewById(R.id.b30);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setText("تم");
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b4.getText().toString();
                b4.setText(press(p));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b5.getText().toString();
                b5.setText(press(p));

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b6.getText().toString();
                b6.setText(press(p));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b7.setText("تم");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b8.setText("تم");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b9.setText("تم");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b10.getText().toString();
                b10.setText(press(p));
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b11.setText("تم");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b12.getText().toString();
                b12.setText(press(p));
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b13.getText().toString();
                b13.setText(press(p));
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b14.setText("تم");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b15.setText("تم");
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b16.getText().toString();
                b16.setText(press(p));
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b17.getText().toString();
                b17.setText(press(p));
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b18.setText("تم");
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b19.setText("تم");
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b20.setText("تم");
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b21.getText().toString();
                b21.setText(press(p));
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b22.getText().toString();
                b22.setText(press(p));
            }
        });

        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b25.getText().toString();
                b25.setText(press(p));
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b26.getText().toString();
                b26.setText(press(p));
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p=b30.getText().toString();
                b30.setText(press(p));
            }
        });
    }

    public String press(String s){
        if(s=="تم")
            return "تم";
        else if(Integer.parseInt(s)==1)
            return "تم";
        else {
            int g= (Integer.parseInt(s))-1;
            return Integer.toString(g);
        }


    }
}