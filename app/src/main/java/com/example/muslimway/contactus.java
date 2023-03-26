package com.example.muslimway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class contactus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
    }
    public void facebook_Url(View view){
        Intent facebook=new Intent(Intent.ACTION_VIEW);
        facebook.setData(Uri.parse("https://www.facebook.com/profile.php?id=100009513763893"));
        if(facebook.resolveActivity(getPackageManager())!=null){
            startActivity(facebook);
        }
    }

    public void whatsapp_Url(View view) {
        Intent whatsapp=new Intent(Intent.ACTION_VIEW);
        whatsapp.setData(Uri.parse("https://wa.me/01147013586"));
        if(whatsapp.resolveActivity(getPackageManager())!=null){
            startActivity(whatsapp);
        }
    }
}