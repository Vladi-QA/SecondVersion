package com.GOandDO.Version2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.github.drjacky.imagepicker.ImagePicker;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import de.hdodenhof.circleimageview.CircleImageView;

public class SignUp4 extends AppCompatActivity {
    Button Previous;

    ImageView cover;
    CircleImageView profile;
    FloatingActionButton fab;
    FloatingActionButton changeProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up4);
cover = findViewById(R.id.coverimage);
fab = findViewById(R.id.floatingActionButton2);
changeProfile=findViewById(R.id.changeProfile);
profile =findViewById(R.id.profile_image);


fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ImagePicker.Companion.with(SignUp4.this)

                         .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                .start(10);

    }
});
changeProfile.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ImagePicker.Companion.with(SignUp4.this)
                .galleryOnly()
                .crop()	    			//Crop image(Optional), Check Customization for more option
                .cropOval()	    		//Allow dimmed layer to have a circle inside
                .compress(1024)          //will be less than 1 MB
                .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                .start(20);
    }
});

        Previous = findViewById(R.id.Previous);
        Previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp4.this, SignUp3.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode==10){
            Uri uri=data.getData();
            cover.setImageURI(uri);

        }
 else {
            Uri uri=data.getData();
            profile.setImageURI(uri);
        }
    }


}