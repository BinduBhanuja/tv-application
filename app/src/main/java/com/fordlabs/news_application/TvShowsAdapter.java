package com.fordlabs.news_application;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.fordlabs.news_application.databinding.ItemTvShowBinding;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class TvShowsAdapter extends RecyclerView.Adapter<TvShowsAdapter.ViewHolder> {

    private List<TvShowsItemViewModel> tvShowsItemViewModelList = new ArrayList<>();

    @Inject
    public TvShowListViewModel viewModel;

    public TvShowsAdapter(TvShowListViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        ItemTvShowBinding itemTvShowBinding = ItemTvShowBinding.inflate(layoutInflater, viewGroup, false);
        return new ViewHolder(itemTvShowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        TvShowsItemViewModel tvShowsItemViewModel = tvShowsItemViewModelList.get(position);
        viewHolder.bind(tvShowsItemViewModel);
    }

    @Override
    public int getItemCount() {
        return tvShowsItemViewModelList.size();
    }

    public void setAdapterData(List<TvShowsItemViewModel> tvShowsItemViewModelList) {
        this.tvShowsItemViewModelList = tvShowsItemViewModelList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ItemTvShowBinding binding;

        public ViewHolder(ItemTvShowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(TvShowsItemViewModel itemViewModel) {
            binding.setItemViewModel(itemViewModel);
        }
    }
}
