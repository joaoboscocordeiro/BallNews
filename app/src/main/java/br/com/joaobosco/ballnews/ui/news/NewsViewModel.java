package br.com.joaobosco.ballnews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import br.com.joaobosco.ballnews.model.News;

public class NewsViewModel extends ViewModel {

    private MutableLiveData<List<News>> news;

    public NewsViewModel() {
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}