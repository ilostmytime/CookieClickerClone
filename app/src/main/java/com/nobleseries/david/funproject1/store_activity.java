package com.nobleseries.david.funproject1;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class store_activity extends Activity {

    private int[] itemValues ={100,150};
    private String[] items = {"Auto click: " + itemValues[0],"Increase click: "+ itemValues[1]};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_store_activity);
        populateStore();
    }

    private void populateStore() {

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.store_list,items);
        ListView list = (ListView)findViewById(R.id.store_items);
        list.setAdapter(adapter);

    }

}
