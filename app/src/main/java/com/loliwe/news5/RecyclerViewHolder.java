package com.loliwe.news5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView txtView;
    public TextView txtView2;
    public ImageView img1;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        txtView = itemView.findViewById(R.id.titletextView1);
        txtView2 = itemView.findViewById(R.id.newstextView2);
        img1 = itemView.findViewById(R.id.imageView);
    }
    /*public TextView getView() { return txtView; }
    public TextView getView2() { return txtView2; }
    public ImageView getImage() { return img1; }*/
}
