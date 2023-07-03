package tienda;

import java.util.Scanner;
import tienda.model.services.FabricanteService;
import tienda.model.services.ProductoService;

/**
 *
 * @author lucas
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        try (Scanner read = new Scanner(System.in).useDelimiter("\n")) {
            String selec;
            ProductoService ps = new ProductoService();
            FabricanteService fs = new FabricanteService();
            do {
                System.out.println("""
                                   ===============================================================================
                                   =================================== MENU ======================================
                                   =                                                                             =
                                   =                       A - Listar productos                                  =
                                   =                       B - Listar productos entre $120 y $202                =
                                   =                       C - Listar Portatiles                                 =
                                   =                       D - Listar producto mas barato                        =
                                   =                       E - Ingresar producto                                 =
                                   =                       F - Ingresar fabricante                               =
                                   =                       G - Editar producto                                   =
                                   =                       S - Salir                                             =
                                   =                                                                             =
                                   ===============================================================================
                                   """);
                selec = read.next().toUpperCase();

                switch (selec) {
                    case "A" -> {
                        ps.listarProductos("SELECT * FROM producto");
                    }
                    case "B" -> {
                        ps.listarProductos("SELECT * FROM producto WHERE precio > 120 AND precio < 202");
                    }
                    case "C" -> {
                        ps.listarProductos("SELECT * FROM producto WHERE nombre LIKE '%portátil%'");
                    }
                    case "D" -> {
                        ps.listarProductos("SELECT * FROM producto WHERE precio = (SELECT MIN(precio) FROM producto)");
                    }
                    case "E" -> {
                        ps.crearProducto();
                    }
                    case "F" -> {
                        fs.crearFabricante();
                    }
                    case "G" -> {//TODO: g) Editar un producto con datos a elección
                    }
                    case "S" ->
                        System.out.println("""
                                   ===============================================================================
                                   =                         Saliendo del programa                               =
                                   ===============================================================================
                                   """);
                    default ->
                        System.out.println("""
                                   ===============================================================================
                                   =                   Opcion no valida. Intente nuevamente                      =
                                   ===============================================================================
                                   """);
                }
            } while (!"S".equals(selec));
        }
    }

}
