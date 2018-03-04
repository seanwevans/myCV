package com.seanwevans.mycv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.seanwevans.mycv.MainActivity.interleave;
import static com.seanwevans.mycv.R.layout.activity_affiliations;

public class Affiliations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_affiliations);

        ListView listView = findViewById(R.id.listView);
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);

        databaseAccess.open();
        List<String> socs = databaseAccess.getAll("SELECT society FROM Affiliations");
        List<String> descrs = databaseAccess.getAll("SELECT description FROM Affiliations");
        databaseAccess.close();

        List<String> inter = interleave(socs,descrs);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, inter);
        listView.setAdapter(adapter);


    }


    public void back(View view) {
        finish();
    }
}
