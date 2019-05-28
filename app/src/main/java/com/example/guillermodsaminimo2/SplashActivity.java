package com.example.guillermodsaminimo2;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {


    private final int DURACION_SPLASH = 10000; // 3 segundos
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent = new Intent(SplashActivity.this, ListActivity.class);
               startActivity(intent);
               finish();

           }
       },4000);

    }
}