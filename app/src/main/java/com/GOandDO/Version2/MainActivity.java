package com.GOandDO.Version2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView Facebook;
    ImageView Instagram;
    ImageView Tweeter;
    ImageView YouTube;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Facebook = findViewById(R.id.facebook);
        Instagram = findViewById(R.id.instagram);
        Tweeter = findViewById(R.id.tweeter);
        YouTube=findViewById(R.id.YouTube);

        Button SignIn = findViewById(R.id.SignIn);
        Button SignUp = findViewById(R.id.SignUp);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });


        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/profile.php?id=100002122488302");

            }

        });
        Instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/v.d.one/");

            }

        });
        Tweeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://twitter.com/DziubaVolodymyr");

            }

        });
        YouTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/channel/UC5RKGjcA9oyh9HdqwQiWs9A");

            }

        });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
