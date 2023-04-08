package com.miempresa.tp3recyclerviewpeliculas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;
import java.util.zip.Inflater;

import modelos.Pelicula;

public class MainActivityAdapter  extends RecyclerView.Adapter<MainActivityAdapter.ViewHolder> {

    private Context context;
    private List<Pelicula> peliculas;
    private LayoutInflater inf;



    public MainActivityAdapter(Context context, List<Pelicula> peliculas, LayoutInflater inf) {
        this.context = context;
        this.peliculas = peliculas;
        this.inf = inf;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = inf.inflate(R.layout.pelicula_card ,parent,false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.review.setText(peliculas.get(position).getResenia());
        holder.titulo.setText(peliculas.get(position).getTitulo());
        Glide.with(context).
                load(peliculas.get(position).getUrlFoto()).
                diskCacheStrategy(DiskCacheStrategy.ALL).
                into(holder.cartel);
        Pelicula pelicula = peliculas.get(position);
        holder.boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("pelicula", pelicula);
                Intent intent = new Intent(context, DetalleActivity.class);
                intent.putExtra("pelicula", bundle);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView cartel;
        TextView titulo, review;
        Button boton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cartel = itemView.findViewById(R.id.ivCartel);
            titulo= itemView.findViewById(R.id.tvTitulo);
            review= itemView.findViewById(R.id.tvReview);
            boton= itemView.findViewById(R.id.btDetalle);

        }
    }
}
