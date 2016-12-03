package com.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView itemTypesList;
    private RecyclerView itemsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView.LayoutManager mLayoutManager;
        itemTypesList = (RecyclerView) findViewById(R.id.itemTypeList);
        mLayoutManager = new LinearLayoutManager(this);
        itemTypesList.setLayoutManager(mLayoutManager);
        List<ItemType> itemTypes = Arrays.asList(new ItemType("banana"));
        itemTypesList.setAdapter(new ItemTypeAdapter(itemTypes));

        itemsList = (RecyclerView) findViewById(R.id.itemsList);
        mLayoutManager = new LinearLayoutManager(this);
        itemsList.setLayoutManager(mLayoutManager);
        itemTypesList.setAdapter(new ItemTypeAdapter(itemTypes));
    }
}
