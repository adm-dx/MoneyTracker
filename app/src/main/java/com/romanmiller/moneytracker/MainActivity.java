package com.romanmiller.moneytracker;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Main Activity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Main Activity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Main Activity", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Main Activity", "onDestroy");
    }
}
