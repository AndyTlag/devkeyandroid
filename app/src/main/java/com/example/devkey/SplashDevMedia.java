package com.example.devkey;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.devkey.ui.login.LoginActivity;

public class SplashDevMedia extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarLoginActivity();
            }
        }, 2000);
    }

    private void mostrarLoginActivity() {
        Intent intent = new Intent(
                SplashDevMedia.this, LoginActivity.class
        );
        startActivity(intent);
        finish();
    }
}