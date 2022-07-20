package br.com.joaobosco.ballnews.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by João Bosco on 14/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
@Entity
public class News {
    @PrimaryKey
    public int id;
    public String title;
    public String description;
    public String image;
    public String link;
    public boolean favorite;
}
