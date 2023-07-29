package com.libreriajpa.services;

import com.libreriajpa.entities.Editorial;
import com.libreriajpa.entities.Autor;
import com.libreriajpa.entities.Libro;
import java.util.List;
import java.util.Scanner;
import com.libreriajpa.controller.LibroJpaController;

/**
 *
 * @author LUCAS MOLINA
 */
public class LibroService {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    private final LibroJpaController libroJpa = new LibroJpaController();
    private final AutorService autorService = new AutorService();
    private final EditorialService editorialService = new EditorialService();

    public void ingresarLibro() {
        try {
            System.out.println("""
                           ========================================
                                        INGRESAR LIBRO
                           ========================================
                           """);
            System.out.print("ISBN >> ");
            String isbn = read.next().trim();
            List<Libro> buscarLibro = libroJpa.consultarLibros("isbn", isbn);
            if (!buscarLibro.isEmpty()) {
                libroEncontrado(buscarLibro);
            } else {
                crearNuevoLibro(isbn);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EXCEPCION AL INGRESAR LIBRO");
        }
    }
    
    private boolean libroEncontrado(List<Libro> libros) {
        System.out.println("""
                               ========================================
                                            LIBRO ENCONTRADO
                               ========================================
                               """);
        System.out.println(libros.get(0));
        System.out.println("""
                               ========================================
                                    Desea atualizar datos del libro
                               ========================================
                               """);
        System.out.print("Y/N >> ");
        boolean selec = read.next().trim().equalsIgnoreCase("Y");
        if (selec) {
            actualizarLibro(libros.get(0));
        }
        return true;
    }

    private void crearNuevoLibro(String isbn) {
        try {
            System.out.print("Titulo >> ");
            String titulo = read.next().trim();

            System.out.print("Anio >> ");
            String anho = read.next().trim();

            System.out.print("Cantidad de ejemplares >> ");
            String ejemplares = read.next().trim();

            System.out.print("Nombre de Autor >> ");
            String autorNombre = read.next().toUpperCase().trim();
            Autor autor = autorService.ingresarAutor(autorNombre);

            System.out.print("Nombre de Editorial >> ");
            String editorialNombre = read.next().toUpperCase().trim();
            Editorial editorial = editorialService.ingresarEditorial(editorialNombre);//revisar metodos de Editorial

            Libro libro = new Libro(isbn, titulo, Integer.valueOf(anho), Integer.valueOf(ejemplares), Boolean.TRUE, autor, editorial);
            System.out.println("""
                               ========================================
                                            CONFIRMAR DATOS
                               ========================================
                               
                               """);
            System.out.println(libro);
            System.out.println("""
                               ========================================
                                    Desea confirmar los datos?
                               ========================================
                               """);
            System.out.print("Y/N >> ");
            boolean selec = read.next().trim().equalsIgnoreCase("Y");

            if (selec) {
                libroJpa.crearLibro(libro);
                System.out.println("""
                               ========================================
                                          REGISTRO COMPLETADO
                               ========================================
                               """);
            } else {
                System.out.println("""
                               ========================================
                                  HA CANCELADO EL INGRESO DEL LIBRO
                               ========================================
                               """);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EXCEPCION AL INTENTAR CREAR LIBRO");
        }
    }
    
    private void actualizarLibro(Libro libro) {
        boolean salir = false;
        do {
            System.out.println("""
                                   ========================================
                                                  MENU EDITAR
                                   ========================================
                                             1 - Editar Alta
                                             2 - Editar Titulo
                                             3 - Editar Autor
                                             4 - Editar Anho
                                             5 - Editar Editorial
                                             6 - Sumar Ejemplares
                                             7 - Confirmar Cambios
                                             0 - Salir
                                   ========================================
                                   """);
            try {
                String selecEdit = read.next().trim();
                switch (selecEdit) {
                    case "1" -> {
                        System.out.println("""
                                           ========================================
                                                        A - Dar ALTA
                                                        B - Dar BAJA
                                           ========================================
                                           """);
                        String selecAlta = read.next().toUpperCase().trim();
                        switch (selecAlta) {
                            case "A":
                                libroJpa.switchAlta(libro, Boolean.TRUE);
                                break;
                            case "B":
                                libroJpa.switchAlta(libro, Boolean.FALSE);
                            default:
                                System.out.println("""
                                           ========================================
                                                        Opcion inválida
                                           ========================================
                                           """);
                        }
                    }
                    case "2" -> {
                        System.out.print("Ingrese Nuevo Titulo >> ");
                        String titulo = read.next().trim();
                        libro.setTitulo(titulo);
                    }
                    case "3" -> {
                        System.out.print("Ingrese Nuevo Autor >> ");
                        String autorNombre = read.next().trim();
                        Autor autor = autorService.ingresarAutor(autorNombre);
                        libro.setAutor(autor);
                    }
                    case "4" -> {
                        System.out.print("Ingrese Nuevo Anho >> ");
                        String anho = read.next().trim();
                        libro.setAnho(Integer.valueOf(anho));
                    }
                    case "5" -> {
                        System.out.print("Ingrese Nueva Editorial >> ");
                        String editorialNombre = read.next().trim();
                        Editorial editorial = editorialService.ingresarEditorial(editorialNombre);
                        libro.setEditorial(editorial);
                    }
                    case "6" -> {
                        System.out.print("Ingrese la cantidad a sumar >> ");
                        String cant = read.next().trim();
                        libro.setEjemplares(libro.getEjemplares() + Integer.valueOf(cant));
                        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + Integer.valueOf(cant));
                        System.out.println("========================================");
                        System.out.println("Se agregaron " + cant + " unidades al stock.");
                        System.out.println("========================================");
                    }
                    case "7" -> {
                        System.out.println("""
                                   ========================================
                                               CONFIRMAR CAMBIOS
                                   ========================================
                                   """);
                        System.out.println(libro);
                        System.out.println("""
                               ========================================
                                   Confirmar y actualizar los datos?
                               ========================================
                               """);
                        System.out.print("Y/N >> ");
                        boolean selec = read.next().trim().equalsIgnoreCase("Y");
                        if (selec) {
                            libroJpa.editarLibro(libro);
                        } else {
                            System.out.println("""
                               ========================================
                                  HA CANCELADO LOS CAMBIOS DEL LIBRO
                               ========================================
                               """);
                        }
                        salir = true;
                    }
                    case "0" -> {
                        salir = true;
                    }
                    default -> {
                        System.out.println("""
                                           ========================================
                                                    Ingrese una opcion valida
                                           ========================================
                                           """);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!salir);
    }

    public void consultarLibros() {
        String selec = "";
        do {
            System.out.println("""
                           
                           ========================================
                                         BUSCAR LIBROS
                           ========================================
                                1 - Buscar Libro por ISBN
                                2 - Buscar Libro por Titulo
                                3 - Buscar Libros por Autor
                                4 - Buscar Libros por Editorial
                                0 - Salir
                           ========================================   
                           """);
            try {
                selec = read.next().trim();
                switch (selec) {
                    case "1" -> {
                        System.out.print("ISBN >> ");
                        String isbn = read.next().trim();
                        List buscar = libroJpa.consultarLibros("isbn", "'" + isbn + "'");
                        if (!buscar.isEmpty()) {
                            libroEncontrado(buscar);
                        }
                    }
                    case "2" -> {
                        System.out.print("Titulo >> ");
                        String titulo = read.next().trim();
                        List buscar = libroJpa.consultarLibros("titulo", "'" + titulo + "'");
                        if (!buscar.isEmpty()) {
                            libroEncontrado(buscar);
                        }
                    }
                    case "3" -> {
                        System.out.print("Autor >> ");
                        String autor = read.next().trim();
                        List buscar = libroJpa.consultarLibros("autor.nombre", "'" + autor + "'");
                        if (!buscar.isEmpty()) {
                            libroEncontrado(buscar);
                        }
                    }
                    case "4" -> {
                        System.out.print("Editorial >> ");
                        String editorial = read.next().trim();
                        List buscar = libroJpa.consultarLibros("editorial.nombre", "'" + editorial + "'");
                        if (!buscar.isEmpty()) {
                            libroEncontrado(buscar);
                        }
                    }
                    case "0" -> {
                        System.out.println("""
                                           ========================================
                                                 Regresando al menu principal
                                           ========================================
                                           """);
                    }
                    default ->
                        throw new Exception("""
                                           ========================================
                                                    Ingrese una opcion valida
                                           ========================================
                                           """);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (!"0".equals(selec));

    }

    public void darBaja() {
        try {
            System.out.println("""
                           ========================================
                                        DAR BAJA LIBRO
                           ========================================
                           """);
            System.out.print("ISBN >> ");
            String isbn = read.next().trim();
            List<Libro> buscar = libroJpa.consultarLibros("isbn", isbn);
            if (!buscar.isEmpty()) {
                Libro libro = buscar.get(0);
                if (libro.getAlta()) {
                    libroJpa.switchAlta(libro, Boolean.FALSE);
                    System.out.println("Libro: " + libro.getTitulo() + " Dado de Baja");
                } else {
                    System.out.println("No se encontro libro");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
