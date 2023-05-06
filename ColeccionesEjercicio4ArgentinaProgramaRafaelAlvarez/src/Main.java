import entidades.Pelicula;
import servicios.PeliculaServicio;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas;
        PeliculaServicio peliculaServicio = new PeliculaServicio();

        peliculas = peliculaServicio.crearPelicula();
        //mostrarPeliculas(peliculas);
        peliculaServicio.mostrarPeliculas(peliculas);
        peliculaServicio.mostrarLargas(peliculas);
        peliculaServicio.ordenarPeliculas(peliculas);
        peliculaServicio.ordenarAscendente(peliculas);
        peliculaServicio.ordenarTitulo(peliculas);
        peliculaServicio.ordenarDirector(peliculas);


        //System.out.println("Hello world!");
    }

    public static void mostrarPeliculas(ArrayList<Pelicula> peliculas){
        System.out.println("------------------------------------------------");
        for(Pelicula pelicula : peliculas){
            System.out.println(pelicula.getTitulo());
        }
        System.out.println("------------------------------------------------");
    }


}