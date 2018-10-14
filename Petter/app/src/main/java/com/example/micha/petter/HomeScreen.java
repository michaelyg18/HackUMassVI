package com.example.micha.petter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Intent intent = getIntent();
    }

    public void create(View view){
        Intent intent = new Intent(this, HumanProfile.class);
        startActivity(intent);
    }

    public void swipe(View view){
        Intent intent = new Intent(this, Swipe.class);
        startActivity(intent);
    }
}
