package com.seanwevans.mycv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static com.seanwevans.mycv.R.layout.activity_interests;

public class Interests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_interests);
    }

    public void back(View view) {
        startActivity(new Intent("com.seanwevans.mycv.MainActivity"));
    }
}
