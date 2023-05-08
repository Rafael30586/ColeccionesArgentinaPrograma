import servicios.PaisServicio;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> paises;

        PaisServicio paisServicio = new PaisServicio();

        paises = paisServicio.crearPais();
        paisServicio.ordenarPaises(paises);
        paisServicio.eliminarPais(paises);

        //System.out.println("Hello world!");
    }
}