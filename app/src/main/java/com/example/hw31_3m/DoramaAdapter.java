package com.example.hw31_3m;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw31_3m.databinding.ItemDoramaBinding;

import java.util.ArrayList;

public class DoramaAdapter extends RecyclerView.Adapter<DoramaViewHolder> {

    private ArrayList<Dorama> doramaList;

    public DoramaAdapter(ArrayList<Dorama> doramaList) {
        this.doramaList = doramaList;
    }

    @NonNull
    @Override
    public DoramaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DoramaViewHolder(ItemDoramaBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DoramaViewHolder holder, int position) {
        holder.onBind(doramaList.get(position));

    }

    @Override
    public int getItemCount() {
        return doramaList.size();
    }
}

class DoramaViewHolder extends RecyclerView.ViewHolder {
    private ItemDoramaBinding binding;

    public DoramaViewHolder(@NonNull ItemDoramaBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }


    public void onBind(Dorama dorama) {
        binding.tvName.setText(dorama.getName());
        binding.tvGenres.setText(dorama.getGenres());
        Glide.with(binding.imgDorama).load(dorama.getImgDorama()).into(binding.imgDorama);

    }
}
