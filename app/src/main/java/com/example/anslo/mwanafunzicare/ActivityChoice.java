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

public class ActivityChoice extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        Button academicButton=(Button)findViewById(R.id.academic_button_id);
        academicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ActivityChoice.this,ActivityAcademic.class);
                startActivity(i);
            }
        });

        Button nonAcademicButton=(Button)findViewById(R.id.non_academic_button_id);
        nonAcademicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ActivityChoice.this,ActivityNonAcademic.class);
                startActivity(i);
            }
        });
    }
}
