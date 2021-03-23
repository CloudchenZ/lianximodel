package com.example.monthsix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e("22", "onCreate: " );
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e("22", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("22", "onStop: " );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("22", "onDestroy: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("22", "onResume: " );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("22", "onRestart: " );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("22", "onStart: " );
    }
}
