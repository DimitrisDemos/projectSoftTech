package com.example.parkradar02.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.parkradar02.Activity.LogInActivity;
import com.example.parkradar02.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.maps.model.Unit;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        firebaseAuth = FirebaseAuth.getInstance();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (firebaseAuth.getCurrentUser() != null) {
                    startActivity(new Intent(SplashActivity.this, com.example.parkradar02.MainActivity.class));
                    finish();
                } else {
                    startActivity(new Intent(SplashActivity.this, LogInActivity.class));
                    finish();
                }


            }
        }, 3000);


    }




}