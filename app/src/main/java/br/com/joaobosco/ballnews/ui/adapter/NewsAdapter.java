package br.com.joaobosco.ballnews.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import br.com.joaobosco.ballnews.databinding.ItemNewsBinding;
import br.com.joaobosco.ballnews.model.News;

/**
 * Created by João Bosco on 14/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    private List<News> news;

    public NewsAdapter(List<News> news) { this.news = news; }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemNewsBinding binding = ItemNewsBinding.inflate(layoutInflater, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        News news = this.news.get(position);
        holder.binding.txtTitle.setText(news.getTitle());
        holder.binding.txtDescription.setText(news.getDescription());
    }

    @Override
    public int getItemCount() {
        return this.news.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ItemNewsBinding binding;

        public MyViewHolder(ItemNewsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
