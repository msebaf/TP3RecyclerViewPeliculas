package com.miempresa.tp3recyclerviewpeliculas;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.ArrayList;

import modelos.Pelicula;

public class MainActivityViewModel extends AndroidViewModel {
    private ArrayList<Pelicula> peliculas = new ArrayList<>();


    public MainActivityViewModel(@NonNull Application application) {
        super(application);

        peliculas.add(new Pelicula("https://i.blogs.es/e5ec52/los-vengadores-the-avengers-la-pelicula-foto/1366_2000.jpg", "Avengers", "El director de la Agencia " +
                "SHIELD decide reclutar a un equipo para salvar al mundo de un desastre casi seguro cuando un enemigo" +
                " inesperado surge como una gran amenaza para la seguridad mundial."," Anthony Russo","Chris Evans"));
        peliculas.add(new Pelicula("https://p2.trrsf.com/image/fget/cf/774/0/images.terra.com/2023/03/15/2108236161-gattaca1.jpg",
                "GATTACA","Ambientada en una sociedad futura, en la que la mayor parte de los niños son" +
                " concebidos in vitro y con técnicas de selección genética. Vincent (Ethan Hawke), uno de los últimos" +
                " niños concebidos de modo natural, nace con una deficiencia cardíaca y no le auguran más de treinta años" +
                " de vida. Se le considera un inválido y, como tal, está condenado a realizar los trabajos más desagradables." +
                " Su hermano Anton, en cambio, ha recibido una espléndida herencia genética que le garantiza múltiples " +
                "oportunidades. Desde niño, Vincent sueña con viajar al espacio, pero sabe muy bien que nunca será seleccionado. " +
                "Durante años ejerce toda clase de trabajos hasta que un día conoce a un hombre que le proporciona la clave para " +
                "formar parte de la élite: suplantar a Jerome (Jude Law), un deportista que se quedó paralítico por culpa de un " +
                "accidente. De este modo, Vincent ingresa en la Corporación Gattaca, una industria aeroespacial, que lo selecciona " +
                "para realizar una misión en Titán. Todo irá bien, gracias a la ayuda de Jerome, hasta que el director del proyecto es" +
                " asesinado y la consiguiente investigación pone en peligro los planes de Vincent.","Andrew Niccol","Ethan Hawke"));
        peliculas.add(new Pelicula("https://areajugones.sport.es/wp-content/uploads/2022/08/indiana-jones-imagen-2-1080x609.jpg.webp",
                "Indiana Jones", "El arqueólogo Indiana Jones necesita encontrar el Arca de la Alianza, una reliquia bíblica" +
                " que contiene los Diez Mandamientos y que convierte en invencible a su poseedor. Jones deberá adelantarse a los nazis, quienes" +
                " también buscan el Arca.","Steven Spielberg","Harrison Ford"));
        peliculas.add(new Pelicula("https://m.media-amazon.com/images/I/41M1KZZT52L._SY445_.jpg","TITANIC",
                "Jack (DiCaprio), un joven artista, gana en una partida de cartas un pasaje para viajar a América en el " +
                        "Titanic, el transatlántico más grande y seguro jamás construido. A bordo conoce a Rose (Kate Winslet), una " +
                        "joven de una buena familia venida a menos que va a contraer un matrimonio de conveniencia con Cal (Billy Zane), " +
                        "un millonario engreído a quien sólo interesa el prestigioso apellido de su prometida. Jack y Rose se enamoran," +
                        " pero el prometido y la madre de ella ponen todo tipo de trabas a su relación. Mientras, el gigantesco y lujoso " +
                        "transatlántico se aproxima hacia un inmenso iceberg","James Cameron","Leonardo DiCaprio"));
    }
        public ArrayList<Pelicula> getPeliculas(){
            return peliculas;
        }

}
