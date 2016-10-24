package com.example.zhihupractice.activity;

/**
 * Created by DADOU on 2016/10/21.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.zhihupractice.R;
import com.example.zhihupractice.adaper.NewsAdapter;
import com.example.zhihupractice.db.DailyNewsDB;
import com.example.zhihupractice.entity.News;

import java.util.List;

/**
 * Created by mac on 15-2-23.
 */
public class FavouriteActivity extends Activity implements AdapterView.OnItemClickListener {
    private NewsAdapter adapter;
    private List<News> favouriteList;
    private ListView lvFavourite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favourite);
        lvFavourite = (ListView) findViewById(R.id.lv_fav);
        favouriteList = DailyNewsDB.getInstance(this).loadFavourite();
        adapter = new NewsAdapter(this, R.layout.listview_item, favouriteList);
        lvFavourite.setAdapter(adapter);
        lvFavourite.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        NewsDetailActivity.startActivity(this, adapter.getItem(position));
    }
}