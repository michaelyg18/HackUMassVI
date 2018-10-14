package com.example.micha.petter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){
        EditText username = findViewById(R.id.editText2);
        EditText password = findViewById(R.id.editText);
        //if(username.getText().toString().equals("admin") && password.getText().toString().equals("1234")){
            Intent intent = new Intent(this, HomeScreen.class);
            startActivity(intent);
        //}

    }
}