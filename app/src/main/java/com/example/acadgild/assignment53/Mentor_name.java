package com.example.acadgild.assignment53;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Vijailakshmi on 25-04-2016.
 */
public class Mentor_name extends AppCompatActivity {
    TextView mentorname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mentor_name);

        mentorname=(TextView)findViewById(R.id.mentorname);

        Intent intent = getIntent();

        String name=intent.getStringExtra("Name");

        mentorname.setText(name);
    }
}
