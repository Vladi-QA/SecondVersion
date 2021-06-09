package com.GOandDO.Version2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp2 extends AppCompatActivity {
Button Next2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);

        Next2 = findViewById(R.id.Next2);
        Next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp2.this, SignUp3.class);
                startActivity(intent);
            }
        });
    }
}