package br.com.joaobosco.ballnews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import br.com.joaobosco.ballnews.data.remote.BallNewsAPI;
import br.com.joaobosco.ballnews.model.News;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static br.com.joaobosco.ballnews.util.Constants.BASE_URL;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news = new MutableLiveData<>();
    private final BallNewsAPI api;

    public NewsViewModel() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(BallNewsAPI.class);
        this.findNews();
    }

    private void findNews() {
        api.getNews().enqueue(new Callback<List<News>>() {
            @Override
            public void onResponse(@NotNull Call<List<News>> call, @NotNull Response<List<News>> response) {
                if (response.isSuccessful()) {
                    news.setValue(response.body());
                } else {
                    // TODO: Implantar tratamento de erro.
                }
            }

            @Override
            public void onFailure(@NotNull Call<List<News>> call, @NotNull Throwable throwable) {
                // TODO: Implantar tratamento de erro.
            }
        });
    }

    public LiveData<List<News>> getNews() { return this.news; }

}