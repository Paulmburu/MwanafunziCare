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

public class ActivityNonAcademic extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_academic);

        List<String> list=new ArrayList<>();
        list.add("ICT");
        list.add("HEALTH");
        list.add("PROCUREMENT");
        list.add("CATERING");
        list.add("HALLS OF RESIDENCE");
        list.add("SECURITY");
        list.add("HUMAN RESOURCE");
        list.add("FINANCE");
        list.add("ESTATES");
        list.add("TRANSPORT");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);

        ListView listView=(ListView)findViewById(R.id.non_academic_list_view);
        listView.setAdapter(adapter);

    }
}
