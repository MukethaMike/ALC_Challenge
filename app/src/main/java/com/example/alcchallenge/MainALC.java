package com.example.alcchallenge;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainALC extends AppCompatActivity {
    private Button button_about;
    private Button button_profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button_profile = (Button) findViewById(R.id.button_profile);
        button_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myProfile();
            }
        });
        button_about = (Button) findViewById(R.id.button_about);
        button_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aboutALC();

            }
        });
    }

        public void aboutALC(){
            Intent intent = new Intent(this, AboutALC.class );
            startActivity(intent);
    }

     public void myProfile(){
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);

     }

}
