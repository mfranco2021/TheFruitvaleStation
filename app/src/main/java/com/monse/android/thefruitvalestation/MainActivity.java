package com.monse.android.thefruitvalestation;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDalyCity(View view) {
        Intent i = new Intent(this, DalyCityActivity.class);
        startActivity(i);
    }

    public void openDublinPleasanton(View view) {
        Intent i = new Intent(this, DublinPleasantonActivity.class);
        startActivity(i);
    }

    public void openRichmond(View view) {
        Intent i = new Intent(this, RichmondActivity.class);
        startActivity(i);
    }

    public void openWarmSprings(View view) {
        Intent i = new Intent(this, WarmSpringsActivity.class);
        startActivity(i);
    }
}