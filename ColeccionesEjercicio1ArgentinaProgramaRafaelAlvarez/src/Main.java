import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<String> razasDePerro = new ArrayList<>();
    //static Iterator iterador = razasDePerro.iterator();

    public static void main(String[] args) {
        guardarRazas();
        buscarRaza();

        //System.out.println("Hello world!");
    }

    public static void guardarRazas(){
        boolean continuar=true;
        String raza;
        char respuesta = 's';

        while(continuar && respuesta=='s'){
            System.out.println("Escribir nombre de una raza de perro para agregar en la lista");
            raza = entrada.next();
            razasDePerro.add(raza);
            System.out.println("¿Desea continuar? (s o n)");
            respuesta = entrada.next().toLowerCase().charAt(0);


            if(respuesta=='n'){
                continuar = false;
                System.out.println("----------------------------------------------");
                for(String perro : razasDePerro){
                    System.out.print(perro+"   ");
                }
                System.out.println();
                System.out.println("----------------------------------------------");
            }
            else if(respuesta!='s' && respuesta!='n'){ //...hacer que este sea else if !='s' y !='n'
                System.out.println("Opción incorrecta");
                //continuar = true;
                while(respuesta!='s' && respuesta!='n'){
                    System.out.println("¿Desea continuar? (s o n)");
                    respuesta = entrada.next().toLowerCase().charAt(0);
                }
                if(respuesta=='n'){
                    System.out.println("----------------------------------------------");
                    for(String perro : razasDePerro){
                        System.out.print(perro+"   ");
                    }
                    System.out.println("----------------------------------------------");
                }

            }
        }
    }

    public static void buscarRaza(){
        String raza;
        boolean seEncuentra=false;
        Iterator iterador = razasDePerro.iterator();
        System.out.println("Escribir raza de perro a buscar dentro de la lista");
        raza = entrada.next();
        while(iterador.hasNext()){
            if(iterador.next().equals(raza)){
                iterador.remove();
                seEncuentra = true;
            }
        }
        if(seEncuentra){
            System.out.println("----------------------------------------------");
            System.out.println("Se ha eliminado a "+raza+ " de la lista");
            System.out.println("----------------------------------------------");
        }else{
            System.out.println(raza+ " no se encontraba dentro de la lista");
        }
        for(String perro : razasDePerro){
            System.out.print(perro+"   ");
        }
        System.out.println();
        System.out.println("----------------------------------------------");
    }
}