package com.parent.school;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.parent.school.object.GridObj;

import java.util.ArrayList;

/**
 * Created by Aarohi on 6/17/2017.
 */

public class DashboardAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<GridObj> alGrid = null;
    public DashboardAdapter(Context c, ArrayList<GridObj> _al) {
        mContext = c;
        alGrid = _al;
    }
    public int getCount() {
        return alGrid.size();
    }

    public Object getItem(int position) {
        return alGrid.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
            GridObj obj = alGrid.get(position);
            LayoutInflater inflater = LayoutInflater.from(mContext);
            View v = inflater.inflate(R.layout.grid_item,null);
            ImageView dbImg = (ImageView)v.findViewById(R.id.imgTask);
            TextView tvTask = (TextView)v.findViewById(R.id.tvTaskName);
            dbImg.setImageResource(obj.drawable);
            tvTask.setText(obj.itemName);
            return v;
    }
}
