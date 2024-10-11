package com.example.hw31_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw31_3m.databinding.FragmentBlankBinding;

import java.util.ArrayList;


public class MainFragment extends Fragment {

    private FragmentBlankBinding binding;
    private ArrayList<Dorama> doramaList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        DoramaAdapter adapter = new DoramaAdapter(doramaList);
        binding.rvDarama .setAdapter(adapter);
    }

    private void loadData() {
        doramaList.add(new Dorama("F4", "comedy", "https://i.mydramalist.com/peoVE_4f.jpg"));
        doramaList.add(new Dorama("Escape7", "drama", "https://upload.wikimedia.org/wikipedia/en/a/a8/The_Escape_of_the_Seven_poster.jpg"));
        doramaList.add(new Dorama("Penthouse", "drama", "https://upload.wikimedia.org/wikipedia/ru/4/4f/The_Penthouse_War_in_Life.jpg"));
        doramaList.add(new Dorama("Vigilante", "drama", "https://asianwiki.com/images/c/ce/Vigilante_KD-p1.jpg"));
        doramaList.add(new Dorama("Descendants", "melodrama", "https://upload.wikimedia.org/wikipedia/ru/f/ff/Descendants_of_the_Sun.jpg"));
        doramaList.add(new Dorama("Heirs", "melodrama", "https://upload.wikimedia.org/wikipedia/en/f/f7/The_Inheritors_poster.jpg"));
        doramaList.add(new Dorama("The Glory", "drama", "https://upload.wikimedia.org/wikipedia/en/7/79/The_Glory_TV_series.jpg"));
        doramaList.add(new Dorama("Vincenzo", "drama", "https://upload.wikimedia.org/wikipedia/en/thumb/5/5b/Vincenzo_TV_series.jpg/220px-Vincenzo_TV_series.jpg"));
        doramaList.add(new Dorama("Empress Ki", "drama", "https://m.media-amazon.com/images/M/MV5BNThlM2ZjYzItYzhmYS00MjI5LTg5YTAtYzZlN2FjNmIwYzc3XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_.jpg"));
        doramaList.add(new Dorama("K2", "melodrama", "https://static.hdrezka.ac/i/2016/10/10/ja4efe31781eaji70m65u.jpg"));

    }
}