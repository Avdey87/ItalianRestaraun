package com.example.avdey.italianrestaraun;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Description extends Activity {

    public static final String DESCRIPTION = "desID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        int id = (Integer) getIntent().getExtras().get(DESCRIPTION);
        Pasta pasta = Pasta.pastaList[id];


        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(pasta.getId());
        photo.setContentDescription(pasta.getName());

        TextView name = findViewById(R.id.name);
        name.setText(pasta.getName());

        TextView description = findViewById(R.id.description);
        description.setText(pasta.getDescription());

    }
}
