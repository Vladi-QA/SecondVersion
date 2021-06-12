package com.GOandDO.Version2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp3 extends AppCompatActivity {
    Button Submit;
    Button Previous;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up3);
        Submit = findViewById(R.id.Next4);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp3.this, SignUp4.class);
                startActivity(intent);
            }
        });

        Previous = findViewById(R.id.Previous);
        Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp3.this, SignUp2.class);
                startActivity(intent);
            }
        });

    }
}