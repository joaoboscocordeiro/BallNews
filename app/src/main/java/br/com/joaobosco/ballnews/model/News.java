package br.com.joaobosco.ballnews.model;

/**
 * Created by João Bosco on 14/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
public class News {
    private String title;
    private String description;

    public News(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
