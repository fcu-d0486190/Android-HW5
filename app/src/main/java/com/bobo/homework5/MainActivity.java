package com.bobo.homework5;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(android.R.id.list);
        ArrayList<AlbumItem> albumlist = new ArrayList<AlbumItem>();
        albumlist.add(new AlbumItem("金州 勇士",R.drawable.icon1));
        albumlist.add(new AlbumItem("聖安東尼奧 馬刺",R.drawable.icons2));
        AlbumArrayAdapter adapter = new AlbumArrayAdapter(this, albumlist);
        listView.setAdapter(adapter);
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, albumlist);
        //listView.setAdapter(adapter);
    }
}
