package br.com.joaobosco.ballnews.ui.favorite;

import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import br.com.joaobosco.ballnews.data.BallNewsRepository;
import br.com.joaobosco.ballnews.model.News;

public class FavoriteViewModel extends ViewModel {

    public FavoriteViewModel() {

    }

    public LiveData<List<News>> loadFavoriteNews() {
        return BallNewsRepository.getInstance().getLocalDB().newsDao().loadFavoriteNews();
    }

    public void saveNews(News news) {
        AsyncTask.execute(() -> BallNewsRepository.getInstance().getLocalDB().newsDao().save(news));
    }

}