package libreriajpa;

import java.util.Scanner;
import libreriajpa.services.*;

/**
 *
 * @author lucas
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        boolean salir = false;
        while (!salir) {
            System.out.println("""
                           ========================================
                           ================= MENU =================
                                    1 - Buscar Libros
                                    2 - Buscar Autor
                                    3 - Buscar Editorial
                                    4 - Prestar Libro/s
                                    5 - Devolucion de Libros
                                    6 - Ingresar Libro
                                    0 - Salir
                           ========================================    
                           """);
            try {
                String selec = read.next();
                LibroService ls = new LibroService();
                switch (selec) {
                    case "1" -> {
                        ls.consultarLibros();
                    }
                    case "2" -> {
                        AutorService as = new AutorService();
                        as.consultarAutor();
                        
                    }
                    case "3" -> {
                        EditorialService es = new EditorialService();
                        es.consultarEditorial();
                    }
                    case "4" -> {
                        //TODO: EJERCICIO EXTRA
                    }
                    case "5" -> {
                        //TODO: EJERCICIO EXTRA
                    }
                    case "6" -> {
                        ls.ingresarLibro();
                    }
                    case "0" -> {
                        System.out.println("""
                                           ========================================
                                                           SALIENDO...
                                           ========================================
                                           """);
                        salir = true;
                    }
                    default -> throw new Exception("""
                                           ========================================
                                                    Ingrese una opcion valida
                                           ========================================
                                           """);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
