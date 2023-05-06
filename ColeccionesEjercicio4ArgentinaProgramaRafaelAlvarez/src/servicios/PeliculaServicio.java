package servicios;

import com.sun.tools.javac.Main;
import entidades.Pelicula;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicio {

    public ArrayList<Pelicula> crearPelicula(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        char respuesta='s';
        ArrayList<Pelicula> peliculas = new ArrayList();
        String titulo,director;
        double duracion;

        while(respuesta=='s'){
            System.out.println("Pelicula: ");
            titulo = entrada.next();
            System.out.println("Director: ");
            director = entrada.next();
            System.out.println("Duracion: ");
            duracion = entrada.nextDouble();

            peliculas.add(new Pelicula(titulo,director,duracion));

            do{
                System.out.println("Añadir otra pelicula?: (s/n)");
                respuesta = entrada.next().toLowerCase().charAt(0);
            }while(respuesta!='s' && respuesta!='n');


        }
        return peliculas;
    }

    public void mostrarPeliculas(ArrayList<Pelicula> peliculas){
        System.out.println("------------------------------------------------");
        System.out.println("Lista de peliculas");
        for(Pelicula pelicula : peliculas){
            System.out.println(pelicula.getTitulo());
        }
        System.out.println("------------------------------------------------");
    }

    public void mostrarLargas(ArrayList<Pelicula> peliculas){
        System.out.println("------------------------------------------------");
        System.out.println("Mayores de 1 hora");
        for(Pelicula pelicula : peliculas){
            if(pelicula.getDuracion()>1){
                System.out.println(pelicula.getTitulo());
            }
        }
        System.out.println("------------------------------------------------");
    }

    public void ordenarPeliculas(ArrayList<Pelicula> peliculas){
        peliculas.sort(Pelicula.compararDuracion);
        System.out.println("------------------------------------------------");
        System.out.println("Ordenadas segun duracion");
        for(Pelicula pelicula : peliculas){
            System.out.println(pelicula.getTitulo());
        }
        System.out.println("------------------------------------------------");
    }

    public void ordenarAscendente(ArrayList<Pelicula> peliculas){
        peliculas.sort(Pelicula.compararDuracion.reversed());
        System.out.println("------------------------------------------------");
        System.out.println("Ordenadas segun duracion (ascendente)");
        for(Pelicula pelicula : peliculas){
            System.out.println(pelicula.getTitulo());
        }
        System.out.println("------------------------------------------------");
    }

    public void ordenarTitulo(ArrayList<Pelicula> peliculas){
        peliculas.sort(Pelicula.compararTitulo);
        System.out.println("------------------------------------------------");
        System.out.println("Ordenadas segun Titulo");
        for(Pelicula pelicula : peliculas){
            System.out.println(pelicula.getTitulo());
        }
        System.out.println("------------------------------------------------");
    }

    public void ordenarDirector(ArrayList<Pelicula> peliculas){
        peliculas.sort(Pelicula.compararDirector);
        System.out.println("------------------------------------------------");
        System.out.println("Ordenadas segun Director");
        for(Pelicula pelicula : peliculas){
            System.out.println(pelicula.getTitulo());
        }
        System.out.println("------------------------------------------------");
    }
}
