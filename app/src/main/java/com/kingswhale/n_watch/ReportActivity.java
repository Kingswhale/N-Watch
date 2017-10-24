package com.kingswhale.n_watch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        // Create an ArrayList of ReportList objects
        ArrayList<ReportList> reportLists = new ArrayList<ReportList>();
        reportLists.add(new ReportList("N-watch", "The nigeria watch", R.drawable.icon));
        reportLists.add(new ReportList("N-watch", "we watch", R.drawable.icon));
        reportLists.add(new ReportList("N-watch", "they watch", R.drawable.ic_fb));
        reportLists.add(new ReportList("N-watch", "jos Watch", R.drawable.icon));
        reportLists.add(new ReportList("N-watch", "for peace on plateau", R.drawable.logo));
        reportLists.add(new ReportList("Infinity Systems", "Bring back peace", R.drawable.icon));
        reportLists.add(new ReportList("Public Private Reporting", "We want peace", R.drawable.ic_fb));
        reportLists.add(new ReportList("Reporting Systems", "Only for plateau", R.drawable.icon));
        reportLists.add(new ReportList("n-Hub Nigeria", "community innovation startup", R.drawable.logo));
        reportLists.add(new ReportList("Kingswhale Tech", "Providing tech beyond barrier", R.drawable.icon));

        // Create an {@link ReportListAdapter}, whose data source is a list of
        // {@link ReportList}s. The adapter knows how to create list item views for each item
        // in the list.
        ReportListAdapter flavorAdapter = new ReportListAdapter(this, reportLists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(flavorAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent report = new Intent(ReportActivity.this, CrimeReportActivity.class);
                startActivity(report);
            }
        });
    }

}
