package com.example.anslo.mwanafunzicare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Paul Mburu on 11/4/18.
 */

public class ActivityAcademic extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic);
        List<String> list=new ArrayList<>();
        list.add("School of Business and Economics");
        list.add("School of Mining Engineering");
        list.add("School of Sciences and Informatics");
        list.add("School of Agriculture and Environmental Science");
        ListView listView=(ListView)findViewById(R.id.academic_list_view);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
    }
}
