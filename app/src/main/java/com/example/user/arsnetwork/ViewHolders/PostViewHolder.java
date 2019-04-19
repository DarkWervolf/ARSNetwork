package com.example.user.arsnetwork.ViewHolders;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.arsnetwork.Models.Post;
import com.example.user.arsnetwork.R;

public class PostViewHolder extends RecyclerView.ViewHolder{

    public TextView titleView;
    public TextView textView;
    public TextView authorsView;
    public TextView likesCounterView;

    public ImageView starView;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);

        //connecting view with viewHolder
        titleView = itemView.findViewById(R.id.post_title);
        textView = itemView.findViewById(R.id.post_text);
        authorsView = itemView.findViewById(R.id.post_authors);
        likesCounterView = itemView.findViewById(R.id.post_star_counter);

        starView = itemView.findViewById(R.id.post_star);
    }

    //setting post layout with data from post
    public void onBind(Post post){
        titleView.setText(post.getTitle());
        textView.setText(post.getText());
        authorsView.setText(post.getAuthors());

    }
}
