package com.example.anslo.mwanafunzicare;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Paul Mburu on 11/4/18.
 */

public class ActivityStaffLogin extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_login);
        Button button=(Button)findViewById(R.id.button_staff_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ActivityStaffLogin.this,ActivityChoice.class);
                startActivity(i);
            }
        });
    }
}
