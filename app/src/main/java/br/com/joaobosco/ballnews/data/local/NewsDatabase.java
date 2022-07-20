package br.com.joaobosco.ballnews.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import br.com.joaobosco.ballnews.model.News;

/**
 * Created by João Bosco on 18/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
@Database(entities = {News.class}, version = 1)
public abstract class NewsDatabase extends RoomDatabase {
    public abstract NewsDao newsDao();
}
