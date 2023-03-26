package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class r1 extends AppCompatActivity {
    private EditText EdtZekrName;
    private Button BtnAddZekr;
    private DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r1);
        EdtZekrName = findViewById(R.id.EdtZekrName);
        BtnAddZekr = findViewById(R.id.BtnAddZekr);


        dbHandler = new DBHandler(r1.this);


        BtnAddZekr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ZekrName = EdtZekrName.getText().toString();



                if (ZekrName.isEmpty()) {
                    Toast.makeText(r1.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }


                dbHandler.addNewZekr(ZekrName);


                Toast.makeText(r1.this, "Zekr has been added.", Toast.LENGTH_SHORT).show();
                EdtZekrName.setText("");
                Intent i = new Intent(r1.this, ViewCourses.class);
                startActivity(i);

            }
        });


    }
}