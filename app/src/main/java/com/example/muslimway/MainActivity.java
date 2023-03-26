package com.example.muslimway;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView morning=(ImageView)findViewById(R.id.Morninhandnight);
        ImageView prayy=(ImageView)findViewById(R.id.imageView5);
        ImageView w=(ImageView)findViewById(R.id.imageView7);
        ImageView salah=(ImageView)findViewById(R.id.imageView6);
        ImageView stories=(ImageView)findViewById(R.id.imageView25);
        ImageView az=(ImageView)findViewById(R.id.imageView24);
        ImageView arbien=(ImageView)findViewById(R.id.imageView44);
        Button b1=(Button) findViewById(R.id.b1);
        Button button7=(Button) findViewById(R.id.button7);
        Button button35=(Button) findViewById(R.id.button35);
        Button button4=(Button)findViewById(R.id.button4) ;
        Button button36=(Button)findViewById(R.id.button36) ;
        Button button43=(Button)findViewById(R.id.button43) ;
        Button b100=(Button)findViewById(R.id.b100) ;
        morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent night=new Intent(MainActivity.this,Azkar.class);
                startActivity(night);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent night=new Intent(MainActivity.this,Azkar.class);
                startActivity(night);
            }
        });
        b100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,test.class);
                startActivity(i);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pray=new Intent(MainActivity.this,PRAY_MAIN.class);
                startActivity(Pray);
            }
        });
        prayy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pray=new Intent(MainActivity.this,PRAY_MAIN.class);
                startActivity(Pray);
            }
        });
        arbien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pray=new Intent(MainActivity.this,intent_h1.class);
                startActivity(Pray);
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pray=new Intent(MainActivity.this,test.class);
                startActivity(Pray);
            }
        });
        az.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pray=new Intent(MainActivity.this,ViewCourses.class);
                startActivity(Pray);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(MainActivity.this,g1.class);
                startActivity(g);
            }
        });
        salah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(MainActivity.this,g1.class);
                startActivity(g);
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(MainActivity.this,g3.class);
                startActivity(g);
            }
        });
        stories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(MainActivity.this,g3.class);
                startActivity(g);
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent night=new Intent(MainActivity.this,intent_h1.class);
                startActivity(night);
            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent night=new Intent(MainActivity.this,ViewCourses.class);
                startActivity(night);
            }
        });
    }
public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
}
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.menu_h){
            Intent Pray=new Intent(MainActivity.this,fadlelzekr.class);
            startActivity(Pray);
        }
        if (id==R.id.contact_us){
            Intent Pray=new Intent(MainActivity.this,contactus.class);
            startActivity(Pray);
        }
        if (id==R.id.about_us){}
        return super.onOptionsItemSelected(item);
    }
}