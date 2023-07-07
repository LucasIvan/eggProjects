package libreriajpa.services;

import java.util.List;
import java.util.Scanner;
import libreriajpa.entities.*;
import libreriajpa.persistence.LibroDAO;

/**
 *
 * @author lucas
 */
public class LibroService {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    private final LibroDAO libroDao = new LibroDAO();
    private final AutorService autorService = new AutorService();
    private final EditorialService editorialService = new EditorialService();

    public void ingresarLibro() {
        System.out.println("""
                           ========================================
                                        INGRESAR LIBRO
                           ========================================
                           """);
        System.out.print("ISBN >> ");
        try {
            String isbn = read.next();
            //TODO: mejorar la busqueda para que al encontrar es isbn si "alta = false" editar toda la info del libro.
            if (libroDao.consultarLibros("isbn", isbn)) {
                actualizarCantidad(isbn);
            } else {
                crearNuevoLibro(isbn);
            }
        } catch (Exception e) {
            System.out.println("EXCEPCION AL INGRESAR LIBRO");
        }

    }

    private void actualizarCantidad(String isbn) {//AÑADIR MENU DE OPCIONES PARA PARA PERMITIR MODIFICAR A GUSTO EL LIBRO
        System.out.println("""
                               ========================================
                                            LIBRO ENCONTRADO
                               ========================================
                               """);
        System.out.println("""
                               ========================================
                                    Desea atualizar datos del libro
                               ========================================
                               """);
        System.out.print("Y/N >> ");
        try {
            boolean selec = read.next().equalsIgnoreCase("Y");

            if (selec) {
                List<Libro> libros = libroDao.consulta(Libro.class, "isbn", "'"+isbn+"'");
                Libro libro = libros.get(0);
                System.out.println("""
                                   ========================================
                                                  MENU EDITAR
                                   ========================================
                                   1 - Editar Titulo
                                   2 - Editar Autor
                                   3 - Editar Anho
                                   4 - Editar Editorial
                                   5 - Sumar Ejemplares
                                   0 - Salir Sin Editar
                                   """);
                String selecEdit = read.next();
                //TODO: añadir bucle
                switch (selecEdit) {
                    case "1" -> {
                        System.out.print("Ingrese Nuevo Nombre >> ");
                        String titulo = read.next();
                        libro.setTitulo(titulo);
                    }
                    case "2" -> {
                        System.out.print("Ingrese Nuevo Autor >> ");
                        String autorNombre = read.next();
                        Autor autor = autorService.ingresarAutor(autorNombre);
                        libro.setAutor(autor);
                    }
                    case "3" -> {
                        
                    }
                    case "4" -> {
                        
                    }
                    case "5" -> {
                        System.out.print("Ingrese la cantidad a sumar >> ");
                        String cant = read.next();
                        libro.setEjemplares(libro.getEjemplares()+ Integer.valueOf(cant));
                        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()+Integer.valueOf(cant));
                        System.out.println("========================================");
                        System.out.println("Se agregaron " + cant + " unidades al stock.");
                        System.out.println("========================================");
                    }
                    case "0" -> {
                        System.out.println("No se realizo ninguna modificacion");
                    }
                    default -> {System.out.println("Elija opción válida");}
                }
                

            } else {
                System.out.println("No se efectuaron cambios para el libro");
            }
        } catch (Exception e) {
            System.out.println("Error al leer la entrada del usuario: " + e.getMessage());
        }
    }

    private void crearNuevoLibro(String isbn) {
        try {
            System.out.print("Titulo >> ");
            String titulo = read.next();

            System.out.print("Anio >> ");
            String anho = read.next();

            System.out.print("Cantidad de ejemplares >> ");
            String ejemplares = read.next();

            System.out.print("Nombre de Autor >> ");
            String autorNombre = read.next().toUpperCase();
            Autor autor = autorService.ingresarAutor(autorNombre);

            System.out.print("Nombre de Editorial >> ");
            String editorialNombre = read.next().toUpperCase();
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
            boolean selec = read.next().equalsIgnoreCase("Y");

            if (selec) {
                libroDao.crear(libro);
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
            System.out.println("EXCEPCION AL INTENTAR CREAR LIBRO");
        }
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
                                0 - Volver a Menu principal
                           ========================================   
                           """);
            try {
                selec = read.next();
                switch (selec) {
                    case "1" -> {
                        System.out.print("ISBN >> ");
                        String isbn = read.next();
                        libroDao.consultarLibros("isbn", "'"+isbn+"'");
                    }
                    case "2" -> {
                        System.out.print("Titulo >> ");
                        String titulo = read.next();
                        libroDao.consultarLibros("titulo", "'"+titulo+"'");
                    }
                    case "3" -> {
                        System.out.print("Autor >> ");
                        String autor = read.next();
                        libroDao.consultarLibros("autor.nombre", "'"+autor+"'");
                    }
                    case "4" -> {
                        System.out.print("Editorial >> ");
                        String editorial = read.next();
                        libroDao.consultarLibros("editorial.nombre", "'"+editorial+"'");
                    }
                    case "0" -> {
                        System.out.println("""
                                           ========================================
                                                 Regresando al menu principal
                                           ========================================
                                           """);
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
        } while (!"0".equals(selec));

    }

}
