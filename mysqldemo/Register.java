package com.example.mysqldemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText name,surname,age,username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (EditText)findViewById(R.id.etName);
        surname = (EditText)findViewById(R.id.etSurname);
        age = (EditText)findViewById(R.id.etAge);
        username = (EditText)findViewById(R.id.etPassword);
        password = (EditText)findViewById(R.id.etPassword);

    }

    public void OnRegister(View view) {

        String strName = name.getText().toString();
        String strSurname = surname.getText().toString();
        String strAge = age.getText().toString();
        String strUsername = username.getText().toString();
        String strPassword = password.getText().toString();

        String type = "register";
        BackgroudWorker backgroudWorker = new BackgroudWorker(this);
        backgroudWorker.execute(type,strName,strSurname,strAge,strUsername,strPassword);
    }
}