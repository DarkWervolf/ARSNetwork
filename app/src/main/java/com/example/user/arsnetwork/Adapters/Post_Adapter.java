
package com.example.user.arsnetwork.Adapters;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.user.arsnetwork.Models.Post;
import com.example.user.arsnetwork.R;
import com.example.user.arsnetwork.ViewHolders.PostViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Post_Adapter extends FirebaseRecyclerAdapter<Post, PostViewHolder>  {
    public Post_Adapter(@NonNull FirebaseRecyclerOptions<Post> options) {
        super(options);
    }

    //Put data (model) in ViewHolder (layout)
    @Override
    protected void onBindViewHolder(@NonNull PostViewHolder holder, int position, @NonNull Post model) {
        holder.onBind(model);
        System.out.println("Bind!");
        System.out.println(model);
    }

    //Create ViewHolder
    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        System.out.println("onCreateViewHolder!");
        return new PostViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.model_post, viewGroup, false));
    }
}
