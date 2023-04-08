package com.miempresa.tp3recyclerviewpeliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.miempresa.tp3recyclerviewpeliculas.databinding.ActivityDetalleBinding;

import modelos.Pelicula;

public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_detalle);
        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Bundle bundle = getIntent().getBundleExtra("pelicula");
        Pelicula pelicula = (Pelicula) bundle.getSerializable("pelicula");
        Log.d("salida",pelicula.getDirector());
         binding.tvTituloD.setText(pelicula.getTitulo());
         binding.tvActor.setText(pelicula.getActorPrincipal());
         binding.tvDirector.setText(pelicula.getDirector());
         binding.tveReviewD.setText(pelicula.getResenia());
        Glide.with(this).
                load(pelicula.getUrlFoto()).
                diskCacheStrategy(DiskCacheStrategy.ALL).
                into(binding.ivCarteleraD);

    }
}