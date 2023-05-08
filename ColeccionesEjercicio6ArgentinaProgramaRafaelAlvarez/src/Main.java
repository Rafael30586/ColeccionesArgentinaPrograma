import servicios.ProductoServicio;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Double> productos = new HashMap();
        ProductoServicio productoServicio = new ProductoServicio();

        menu(productos,productoServicio);

        //System.out.println("Hello world!");
    }

    public static void menu(HashMap<String,Double> productos,ProductoServicio productoServicio){
        boolean salir = false;
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int opcion;

        while(!salir){
            System.out.println("------------------------------------------");
            System.out.println("Elija una opción");
            System.out.println("1- Agregar producto");
            System.out.println("2- Modificar precio");
            System.out.println("3- Eliminar producto");
            System.out.println("4- Mostrar lista");
            System.out.println("5- Salir");
            opcion = entrada.nextInt();

            switch(opcion){
                case 1: productoServicio.introducirElemento(productos);break;
                case 2: productoServicio.modificarPrecio(productos);break;
                case 3: productoServicio.eliminarProducto(productos);break;
                case 4: productoServicio.mostrarProductos(productos);break;
                case 5: salir = true;
                        System.out.println("Saliendo del programa...");
                        break;
            }
        }
    }
}