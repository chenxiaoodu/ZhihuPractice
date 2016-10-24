package com.example.zhihupractice.entity;

import java.util.ArrayList;

/**
 * Created by DADOU on 2016/10/21.
 */
public class NewsDetail {
    private long id;
    private int type;
    private String body;
    private String image;
    private String title;
    private String share_url;
    private String ga_prefix;
    private String image_source;
    private ArrayList<String> js;
    private ArrayList<String> css;

    public void setId(long id){
        this.id = id;
    }

    public void setType(int type){
        this.type = type;
    }

    public void setBody(String body){
        this.body = body;
    }

    public void setImage(String image){
        this.image = image;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setShare_url(String share_url){
        this.share_url = share_url;
    }

    public void setGa_prefix(String ga_prefix){
        this.ga_prefix = ga_prefix;
    }
    public void setImage_source(String image_source){
        this.image_source = image_source;
    }

    public void setJs (ArrayList<String> js){
        this.js = js;
    }

    public void setCss(ArrayList<String> css){
        this.css = css;
    }





    public long getId(){
        return id;
    }

    public int getType(){
        return type;
    }

    public String getBody(){
        return body;
    }

    public String getImage(){
        return image;
    }

    public String getTitle(){
        return title;
    }

    public String getShare_url(){
        return share_url;
    }

    public String getGa_prefix(){
        return ga_prefix;
    }

    public String getImage_source(){
        return image_source;
    }

    public ArrayList<String> getJs(){
        return js;
    }

    public ArrayList<String> getCss(){
        return css;
    }


}
