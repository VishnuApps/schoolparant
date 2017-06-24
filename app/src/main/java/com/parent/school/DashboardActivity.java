package com.parent.school;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.parent.school.object.GridObj;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    private ImageView imgStd = null;
    private TextView tvStdName = null;
    private TextView tvStdRollNo = null;
    private TextView tvStdAge = null;
    private TextView tvStdClass = null;
    private TextView tvBloodGroup = null;
    private GridView gridView = null;
    private ArrayList<GridObj> alGridItems = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        alGridItems = new ArrayList<GridObj>();
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        gridView = (GridView)findViewById(R.id.grid);
        alGridItems.add(new GridObj(R.mipmap.student,"Task Board1"));
        alGridItems.add(new GridObj(R.mipmap.student,"Task Board2"));
        alGridItems.add(new GridObj(R.mipmap.student,"Task Board3"));
        alGridItems.add(new GridObj(R.mipmap.student,"Task Board4"));
        alGridItems.add(new GridObj(R.mipmap.student,"Task Board5"));
        alGridItems.add(new GridObj(R.mipmap.student,"Task Board6"));
        alGridItems.add(new GridObj(R.mipmap.student,"Task Board7"));
        alGridItems.add(new GridObj(R.mipmap.student,"Task Board8"));
        alGridItems.add(new GridObj(R.mipmap.student,"Task Board9"));
        gridView.setAdapter(new DashboardAdapter(getApplicationContext(),alGridItems));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,int position, long id) {
                Toast.makeText(DashboardActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DashboardActivity.this,MainFragmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
