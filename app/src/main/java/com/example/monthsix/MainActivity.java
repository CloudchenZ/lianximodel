package com.example.monthsix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("11", "onCreate: " );
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("11", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("11", "onStop: " );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("11", "onDestroy: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("11", "onResume: " );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("11", "onRestart: " );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("11", "onStart: " );
    }
}
