package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
    }
    public void back(View  view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void show_toast(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Чтобы вернуться, нажмите другую кнопку",Toast.LENGTH_SHORT);
        toast.show();
    }
}