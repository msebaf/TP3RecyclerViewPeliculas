package com.miempresa.tp3recyclerviewpeliculas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.miempresa.tp3recyclerviewpeliculas.databinding.ActivityMainBinding;

import java.util.ArrayList;

import modelos.Pelicula;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;
private MainActivityViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);


        RecyclerView rv = binding.rvPeliculas;




        GridLayoutManager grilla = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL,false);
        rv.setLayoutManager(grilla);
        MainActivityAdapter adapter = new MainActivityAdapter(this, mv.getPeliculas(), getLayoutInflater());
        rv.setAdapter(adapter);

    }
}