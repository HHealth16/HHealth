package com.bignerdranch.android.hackhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Mental_Emotional extends AppCompatActivity {
    String[] mental_emotional_hobbies = {"Reading", "Writing", "Watching TV", "Watching Movies", "Drawing", "Painting", "Crafts", "DIY", "Cooking", "Baking", "Journaling", "Meditation", "Prayer", "Spa/Hygiene", "Custom"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental__emotional);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_mental__emotional, mental_emotional_hobbies);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}
