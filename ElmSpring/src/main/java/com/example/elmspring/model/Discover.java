package com.example.elmspring.model;

/**
 * @projectName: ElmSpring
 * @package: com.example.elmspring.model
 * @className: Discover
 * @author: coderJ
 * @description: TODO
 * @date: 2022/8/18 12:30
 * @version: 1.0
 */
public class Discover {
    private int id;
    private String img;
    private String title;
    private String content;
    private String url;

    public Discover(int id, String img, String title, String content, String url) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.content = content;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
