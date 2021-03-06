package com.bobo.homework5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 2017/4/28.
 */

public class AlbumArrayAdapter extends ArrayAdapter<AlbumItem> {
    Context context;
    public AlbumArrayAdapter(Context context, ArrayList<AlbumItem> items) {
        super(context, 0, items);
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if(convertView == null) {
            itemlayout = (LinearLayout)inflater.inflate(R.layout.listitem, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }

        AlbumItem item = (AlbumItem)getItem(position);
        TextView tv_name = (TextView)itemlayout.findViewById(R.id.itemtv);
        tv_name.setText(item.name);
        ImageView iv = (ImageView)itemlayout.findViewById(R.id.itemiv);
        iv.setImageResource(item.imgid);
        TextView tv_name2 = (TextView)itemlayout.findViewById(R.id.itemtv2);
        tv_name2.setText(item.name2);
        ImageView iv2 = (ImageView)itemlayout.findViewById(R.id.itemiv2);
        iv2.setImageResource(item.imgid2);
        return itemlayout;
    }
}
