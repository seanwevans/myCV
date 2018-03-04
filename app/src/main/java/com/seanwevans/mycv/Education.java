package com.seanwevans.mycv;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;

import static com.seanwevans.mycv.MainActivity.interleave;

public class Education extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        /* ListView listView = findViewById(R.id.listView);
        LinearLayout linearLayout = findViewById(R.id.linlay1);
        LinearLayout linearLayout2 = findViewById(R.id.linlay2);

        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);

        databaseAccess.open();
        List<String> classes = databaseAccess.getAll("SELECT class FROM Education");
        List<String> descrs = databaseAccess.getAll("SELECT description FROM Education");
        List<String> dates = databaseAccess.getAll("SELECT date FROM Education");
        List<String> grades = databaseAccess.getAll("SELECT grade FROM Education");
        databaseAccess.close();


        TextView tv = new TextView(this);
        tv.setText(classes.get(0));
        linearLayout.addView(tv);

        TextView tv2 = new TextView(this);
        tv2.setText(dates.get(0));
        linearLayout.addView(tv2);

         TextView tv3 = new TextView(this);
         tv3.setText(dates.get(0));
         linearLayout.addView(tv3);

         TextView tv4 = new TextView(this);
         tv4.setText(descrs.get(0));
         linearLayout2.addView(tv4);
*/







    }

    public void back(View view) {
        finish();
    }
}
