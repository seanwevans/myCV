package com.seanwevans.mycv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import static com.seanwevans.mycv.MainActivity.interleave;
import static com.seanwevans.mycv.R.layout.activity_skills;

public class Skills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_skills);

        ListView listView = findViewById(R.id.listView);
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);

        databaseAccess.open();
        List<String> skills = databaseAccess.getAll("SELECT skill FROM Skills");
        List<String> levels = databaseAccess.getAll("SELECT level FROM Skills");
        databaseAccess.close();

        List<String> inter = interleave(skills,levels);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, inter);
        listView.setAdapter(adapter);


    }

    public void back(View view) {
        startActivity(new Intent("com.seanwevans.mycv.MainActivity"));
    }
}
