package com.example.avdey.italianrestaraun;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PastaList extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ListView pastaList = getListView();
        ArrayAdapter<Pasta> list = new ArrayAdapter<Pasta>(this,
                android.R.layout.simple_list_item_1, Pasta.pastaList);

        pastaList.setAdapter(list);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(PastaList.this, Description.class);
        intent.putExtra(Description.DESCRIPTION, (int) id);
        startActivity(intent);
    }
}
