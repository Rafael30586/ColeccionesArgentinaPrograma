import entidades.Alumno;
import servicios.AlumnoServicio;

import java.util.ArrayList;


public class Main { //La nota final da mal

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos;
        AlumnoServicio alumnoServicio = new AlumnoServicio();

        alumnos = alumnoServicio.crearAlumno();
        System.out.println("Nota final del alumno: "+alumnoServicio.notaFinal(alumnoServicio.buscarAlumno(alumnos)));

        //System.out.println("Hello world!");
    }


}