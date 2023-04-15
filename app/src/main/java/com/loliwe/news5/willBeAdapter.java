package com.loliwe.news5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class willBeAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    newsFragment mContext;
    ArrayList<dataModel> newsStories;

    public willBeAdapter(newsFragment mContext, ArrayList<dataModel> newsStories) {
        this.mContext = mContext;
        this.newsStories = newsStories;
    }

    @Override
    public int getItemViewType(final int position) {
        return R.layout.fragment_news;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflating the layout
        View view = LayoutInflater.from(mContext.getContext()).inflate(R.layout.recyclerview_layout, parent, false);
        return new RecyclerViewHolder(view);
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        //attach data to layout views
        holder.txtView.setText(newsStories.get(position).getName());
        holder.txtView2.setText(newsStories.get(position).getNews());
        holder.img1.setImageResource(newsStories.get(position).getImages());

        //holder.txtView.getView().setText(newsStories.get(position).getName());
    }

    @Override
    public int getItemCount() {
        //get the size of the array
        return newsStories.size();
    }
}