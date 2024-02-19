package com.example.campingintunisia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void previousScreen(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void close(View view){
        finish();
    }
}