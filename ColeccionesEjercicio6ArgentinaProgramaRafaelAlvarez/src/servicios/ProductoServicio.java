package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    public void introducirElemento(HashMap<String,Double> productos){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        double precio;
        String nombre;

        System.out.println("Nombre del producto");
        nombre = entrada.next().toUpperCase();
        System.out.println("precio del producto");
        precio = entrada.nextDouble();
        productos.put(nombre,precio);
        System.out.println("------------------------------------------");
    }

    public void modificarPrecio(HashMap<String,Double> productos){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        String nombreProducto;
        boolean seEcuentra = false;

        System.out.println("Nombre de producto a modificar: ");
        nombreProducto = entrada.next().toUpperCase();

        for(Map.Entry<String , Double> entry : productos.entrySet()){
            if(entry.getKey().equals(nombreProducto)){
                System.out.println("¿Nuevo precio?: ");
                entry.setValue(entrada.nextDouble());
                seEcuentra = true;
            }
        }
        if(!seEcuentra){
            System.out.println("El producto solicitado no se encontraba en la lista");
        }
        System.out.println("------------------------------------------");
    }

    public void eliminarProducto(HashMap<String,Double> productos){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        boolean seEcuentra = false;

        System.out.println("Nombre de producto a eliminar: ");
        String nombreProducto = entrada.next().toUpperCase();
        for(Map.Entry<String , Double> entry : productos.entrySet()){
            if(entry.getKey().equals(nombreProducto)){
                productos.remove(entry.getKey(),entry.getValue());
            }
        }
        if(!seEcuentra){
            System.out.println("El producto solicitado no se encontraba en la lista");
        }
        System.out.println("------------------------------------------");
    }

    public void mostrarProductos(HashMap<String,Double> productos){
        for(Map.Entry<String , Double> entry : productos.entrySet()){
            System.out.println(entry);
        }
        System.out.println("------------------------------------------");
    }
}
