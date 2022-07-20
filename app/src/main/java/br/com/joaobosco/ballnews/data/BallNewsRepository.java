package br.com.joaobosco.ballnews.data;

import static br.com.joaobosco.ballnews.util.Constants.BASE_URL;
import static br.com.joaobosco.ballnews.util.Constants.LOCAL_DB_NAME;

import androidx.room.Room;

import br.com.joaobosco.ballnews.App;
import br.com.joaobosco.ballnews.data.local.NewsDatabase;
import br.com.joaobosco.ballnews.data.remote.BallNewsAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by João Bosco on 18/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
public class BallNewsRepository {

    private final BallNewsAPI remoreApi;
    private final NewsDatabase localDB;

    public BallNewsAPI getNewsApi() {
        return remoreApi;
    }

    public NewsDatabase getLocalDB() {
        return localDB;
    }

    private BallNewsRepository() {
        remoreApi = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(BallNewsAPI.class);

        localDB = Room.databaseBuilder(App.getInstance(), NewsDatabase.class, LOCAL_DB_NAME).build();
    }

    public static BallNewsRepository getInstance() { return LazyHolder.INSTANCE; }

    private static class LazyHolder {
        private static final BallNewsRepository INSTANCE = new BallNewsRepository();
    }

}
