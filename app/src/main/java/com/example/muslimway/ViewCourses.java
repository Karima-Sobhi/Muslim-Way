package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class ViewCourses extends AppCompatActivity {
    private ArrayList<CourseModal> ZekrModalArrayList;
    private DBHandler dbHandler;
    private CourseRVAdapter ZekrRVAdapter;
    private RecyclerView RVzeker;
    private Button BtnAddzekr1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_courses);
        BtnAddzekr1 = findViewById(R.id.BtnAddzekr1);

        ZekrModalArrayList = new ArrayList<>();
        dbHandler = new DBHandler(ViewCourses.this);

        ZekrModalArrayList = dbHandler.readZekr();

        ZekrRVAdapter = new CourseRVAdapter(ZekrModalArrayList, ViewCourses.this);
        RVzeker = findViewById(R.id.RVzeker);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ViewCourses.this, RecyclerView.VERTICAL, false);
        RVzeker.setLayoutManager(linearLayoutManager);

        RVzeker.setAdapter(ZekrRVAdapter);

        BtnAddzekr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ViewCourses.this, r1.class);
                startActivity(i);
            }
        });
    }
}