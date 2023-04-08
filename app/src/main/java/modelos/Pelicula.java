package modelos;

import java.io.Serializable;
import java.util.ArrayList;

public class Pelicula implements Serializable {
    String urlFoto, titulo, resenia,director;
    String actorPrincipal;

    public Pelicula(String urlFoto, String titulo, String resenia, String director, String actorPrincipal) {
        this.urlFoto = urlFoto;
        this.titulo = titulo;
        this.resenia = resenia;
        this.director = director;
        this.actorPrincipal = actorPrincipal;
    }

    public Pelicula(String urlFoto, String titulo, String resenia) {
        this.urlFoto = urlFoto;
        this.titulo = titulo;
        this.resenia = resenia;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }
}
