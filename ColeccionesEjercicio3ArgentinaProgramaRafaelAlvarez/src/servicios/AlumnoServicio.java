package servicios;

import entidades.Alumno;

import java.util.*;

public class AlumnoServicio {


    public ArrayList<Alumno> crearAlumno(){ //hay algun problema con este metodo aparentemente. Casi seguro que hay un problema con este
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        char respuesta='s';
        String nombreAlumno;
        Integer primeraNota;
        Integer segundaNota;
        Integer terceraNota;
        List<Integer> notas;

        while(respuesta!='n'){
            if(respuesta=='s'){

                notas = new ArrayList(3);
                System.out.println("Nombre del alumno: ");
                nombreAlumno= entrada.next();

                System.out.println("Ingresar primera nota: ");
                primeraNota = entrada.nextInt();
                notas.add(primeraNota);

                System.out.println("Ingresar segunda nota: ");
                segundaNota = entrada.nextInt();
                notas.add(segundaNota);

                System.out.println("Ingresar tercera nota: ");
                terceraNota = entrada.nextInt();
                notas.add(terceraNota);

                //alumno.setNotas(notas);

                listaAlumnos.add(new Alumno(nombreAlumno,notas));
                //indice++;

                //notas.clear();

                System.out.println("¿Desea crear otro alumno?(s/n)");
                respuesta = entrada.next().toLowerCase().charAt(0);
            }else if(respuesta!='n'&&respuesta!='s'){
                System.out.println("Opción incorrecta");
                System.out.println("¿Desea crear otro alumno?(s/n)");
                respuesta = entrada.next().toLowerCase().charAt(0);
            }

        }
        listaAlumnos.trimToSize();
        return listaAlumnos;
    }


    public double notaFinal(Alumno alumno){
        double sumaNotas=0;
        double promedio;

        for(Integer nota : alumno.getNotas()){
            sumaNotas += nota;
        }

        promedio = (sumaNotas/3);
        return promedio;
        //return sumaNotas/(alumno.getNotas().size());
    }

    public Alumno buscarAlumno(ArrayList<Alumno> alumnos){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        String nombreAlumno;
        Alumno elegido = new Alumno();
        boolean seEncuentra = false;

        System.out.println("Ingresar nombre de uno de los alumnos: ");
        nombreAlumno = entrada.next();

        for(Alumno alumno : alumnos){
            if(alumno.getNombre().equals(nombreAlumno)){
                elegido = alumno;
                seEncuentra = true;
            }
        }
        if(!seEncuentra){
            System.out.println("El alumno no se encuentra en la lista");
        }
        return elegido;
    }
}
