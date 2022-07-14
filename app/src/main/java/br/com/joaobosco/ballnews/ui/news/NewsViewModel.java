package br.com.joaobosco.ballnews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import br.com.joaobosco.ballnews.model.News;

public class NewsViewModel extends ViewModel {

    private MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        // TODO: Remover este mock de notícias futuramente.
        List<News> news = new ArrayList<>();
        news.add(new News("Corinthians Campeão Mundial", "Nos minutos finais o timão marca 2 golaços..."));
        news.add(new News("Palmeiras Perde!", "Palmeiras continua sem mundial..."));
        news.add(new News("Flamengo é Vice na Libertadores!", "Flamengo perde na final da libertadores para o campeão Corinthians... "));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}