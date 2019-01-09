package com.example.deer.exrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.deer.exrecyclerview.adapter.MainAdapter;
import com.example.deer.exrecyclerview.adapter.model.BaseItem;
import com.example.deer.exrecyclerview.utility.Converter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        setupView();
        setData();
    }

    private void bindView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    private void setupView() {
        recyclerView.setLayoutManager
                (new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void setData() {
        List<BaseItem> itemList = new ArrayList<>();
        itemList.add
                (Converter.createCardViewItem(R.mipmap.ic_launcher_round, "Hello World"));
        itemList.add
                (Converter.createCardViewSmallItem(R.mipmap.ic_launcher_round, "Android"));
        itemList.add
                (Converter.createCardViewSmallItem(R.mipmap.ic_launcher_round, "Java"));
        itemList.add
                (Converter.createCardViewSmallItem(R.mipmap.ic_launcher_round, "Mobile"));
        itemList.add
                (Converter.createCardViewSmallItem(R.mipmap.ic_launcher_round, "Car"));
        itemList.add
                (Converter.createCardViewItem(R.mipmap.ic_launcher_round, "Test"));

        adapter.setItemList(itemList);
        adapter.notifyDataSetChanged();
    }
}
