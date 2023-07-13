package com.libreriajpa;

import com.libreriajpa.services.LibroService;
import com.libreriajpa.services.EditorialService;
import com.libreriajpa.services.AutorService;
import com.libreriajpa.services.ClienteService;
import com.libreriajpa.services.PrestamoService;
import java.util.Scanner;

/**
 *
 * @author LUCAS MOLINA
 */
public class Libreria {

    private static final Scanner read = new Scanner(System.in).useDelimiter("\n");
    private static final LibroService ls = new LibroService();
    private static final ClienteService cs = new ClienteService();
    private static final PrestamoService ps = new PrestamoService();

    /**
     * @param args
     */
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        boolean salir = false;
        String selec;
        while (!salir) {
            System.out.println("""
                           ========================================
                           ================= MENU =================
                                    1 - Prestar Libro/s
                                    2 - Devolucion de Libro/s(FALTA)
                                    3 - Ingresar Libro
                                    4 - Buscar Registro
                                    5 - Nuevo Cliente
                                    0 - Salir
                           ========================================    
                           """);
            try {
                selec = read.next().trim();
                switch (selec) {
                    case "1" -> {
                        ps.prestarLibro();
                    }
                    case "2" -> {

                    }
                    case "3" -> {
                        ls.ingresarLibro();
                    }
                    case "4" -> {
                        buscarRegistro();
                    }
                    case "5" -> {
                        cs.ingresarCliente();
                    }
                    case "0" -> {
                        System.out.println("""
                                           ========================================
                                                           SALIENDO...
                                           ========================================
                                           """);
                        salir = true;
                    }
                    default ->
                        throw new Exception("""
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

    private static void buscarRegistro() {
        boolean flag = true;
        do {
            System.out.println("""
                           ========================================
                                       MENU DE BUSQUEDA
                           ========================================
                                    1 - Buscar Libros
                                    2 - Buscar Autor
                                    3 - Buscar Editorial
                                    4 - Buscar Cliente
                                    0 - Volver A Menu Principal
                           ========================================    
                           """);
            try {
                String selec = read.next().trim();
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
                        cs.consultasCliente();
                    }
                    case "0" -> {
                        flag = false;
                    }
                    default ->
                        throw new Exception("""
                                           ========================================
                                                    Ingrese una opcion valida
                                           ========================================
                                           """);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
        } while (flag);
    }
}
