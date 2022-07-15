package br.com.joaobosco.ballnews.data.remote;

import java.util.List;

import br.com.joaobosco.ballnews.model.News;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by João Bosco on 14/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
public interface BallNewsAPI {

    @GET("news.json")
    Call<List<News>> getNews();

}
