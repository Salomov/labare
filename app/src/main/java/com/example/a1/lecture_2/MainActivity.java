package com.example.a1.lecture_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button Log;
private EditText name;
    private EditText surname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log = (Button) findViewById(R.id.Log);
        name=(EditText) findViewById(R.id.name);
        surname=(EditText) findViewById(R.id.surname);
        Log.setOnClickListener(this);
        Intent intent =getIntent();
        String k=name.getText().toString();
        String k1=surname.getText().toString();
        k=intent.getStringExtra("name");
        k1=intent.getStringExtra("surname");
        name.setText(k);
        surname.setText(k1);






    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(this,Registration.class);

        startActivity(intent);


    }
}
