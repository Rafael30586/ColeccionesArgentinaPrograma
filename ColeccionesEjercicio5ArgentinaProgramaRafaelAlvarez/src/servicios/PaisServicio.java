package servicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServicio {
    public HashSet<String> crearPais(){
        HashSet<String> paises = new HashSet();
        char respuesta='s';
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        String pais;

        while(respuesta=='s'){

            System.out.println("Nombre de un pais: ");
            pais = entrada.next().toUpperCase();

            paises.add(pais);

            do{
                System.out.println("Desea agregar mas paises? (s/n): ");
                respuesta = entrada.next().toLowerCase().charAt(0);
            }while(respuesta!='s'&&respuesta!='n');

            if(respuesta=='n'){
                System.out.println("-------------------------------------------");
                for(String p : paises){
                    System.out.println(p);
                }
                System.out.println("-------------------------------------------");
            }

        }
        return paises;
    }

    public void ordenarPaises(HashSet<String> paises){
        ArrayList<String> listaPaises = new ArrayList(paises);
        listaPaises.sort(String::compareTo);
        System.out.println("-------------------------------------------");
        for(String pais : listaPaises){
            System.out.println(pais);
        }
        System.out.println("-------------------------------------------");
    }

    public void eliminarPais(HashSet<String> paises){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        Iterator<String> iterador = paises.iterator();
        System.out.println("Elija un pais para eliminar");
        String pais = entrada.next().toUpperCase();
        boolean seEncuentra = false;

        while(iterador.hasNext()){
            if(iterador.next().equals(pais)){
                iterador.remove();
                seEncuentra = true;
            }
        }

        if(!seEncuentra){
            System.out.println("El pais elegido no se encontraba en la lista");
        }else{
            System.out.println("-------------------------------------------");
            /*
            while(iterador.hasNext()){ //no funciona
                System.out.println(iterador.next());
            }*/
            //System.out.println(paises); //funciona pero prefiero hacerlo con un for each
            for(String p : paises){
                System.out.println(p);
            }
            System.out.println("-------------------------------------------");
        }

    }
}
