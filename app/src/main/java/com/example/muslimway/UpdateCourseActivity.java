package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class UpdateCourseActivity extends AppCompatActivity {
    private EditText EdtZekrName2;
    private Button BtnUpdateZekr, BtnDelete;
    private DBHandler dbHandler;
    String ZekrName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_course);
        EdtZekrName2 = findViewById(R.id.EdtZekrName2);

        BtnUpdateZekr = findViewById(R.id.BtnUpdateZekr);
        BtnDelete = findViewById(R.id.BtnDelete);


        dbHandler = new DBHandler(UpdateCourseActivity.this);

        ZekrName = getIntent().getStringExtra("name");


        EdtZekrName2.setText(ZekrName);



        BtnUpdateZekr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                dbHandler.updateCourse(ZekrName, EdtZekrName2.getText().toString());


                Toast.makeText(UpdateCourseActivity.this, "Zekr Updated..", Toast.LENGTH_SHORT).show();

                // launching our main activity.
                Intent i = new Intent(UpdateCourseActivity.this, ViewCourses.class);
                startActivity(i);
            }
        });

        BtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbHandler.deleteZekr(ZekrName);
                Toast.makeText(UpdateCourseActivity.this, "Deleted Zekr", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(UpdateCourseActivity.this, ViewCourses.class);
                startActivity(i);
            }
        });
    }
}