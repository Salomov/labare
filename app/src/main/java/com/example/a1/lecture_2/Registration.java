package com.example.a1.lecture_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity implements View.OnClickListener {
private Button Login;
private EditText name,surname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Login=(Button) findViewById(R.id.Login);
        name=(EditText) findViewById(R.id.name) ;
        surname=(EditText) findViewById(R.id.surname) ;
        Login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(name.getText().length()==0 || surname.getText().length()==0)
        {
            Toast.makeText(this, "Invalid Name or Surname", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("name", name.getText().toString());
            intent.putExtra("surname", surname.getText().toString());
            startActivity(intent);
        }

    }
}
