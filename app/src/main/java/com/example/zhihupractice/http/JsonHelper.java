package com.example.zhihupractice.http;

/**
 * Created by DADOU on 2016/10/21.
 */
import com.example.zhihupractice.entity.News;
import com.example.zhihupractice.entity.NewsDetail;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 15-2-3.
 */
public class JsonHelper {
    public static List<News> parseJsonToList(String json) throws JSONException {
        JSONObject jsonContent = new JSONObject(json);
        JSONArray jsonArray = jsonContent.getJSONArray("stories");
        List<News> newsList = new ArrayList<News>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject newsInJson = jsonArray.getJSONObject(i);
            int id = newsInJson.optInt("id");
            String title = newsInJson.optString("title");
            String image = "";
            if (newsInJson.has("images")) {
                image = (String) newsInJson.getJSONArray("images").get(0);

            }
            News news = new News(id, title, image);
            newsList.add(news);
        }
        return newsList;
    }

    public static NewsDetail parseJsonToDetail(String json) throws JSONException {
        Gson gson = new Gson();
        return gson.fromJson(json, NewsDetail.class);
    }
}
