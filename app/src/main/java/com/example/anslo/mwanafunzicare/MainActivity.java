package com.example.anslo.mwanafunzicare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                Intent i=new Intent(getApplicationContext(),ActivityStudentLogin.class);
                startActivity(i);
            }

        };
        new Timer().schedule(task,2000);
    }
}
