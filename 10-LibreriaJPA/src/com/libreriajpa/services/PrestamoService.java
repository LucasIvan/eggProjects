package com.libreriajpa.services;

import com.libreriajpa.controller.LibroJpaController;
import com.libreriajpa.controller.PrestamoJpaController;
import com.libreriajpa.entities.Cliente;
import com.libreriajpa.entities.Libro;
import com.libreriajpa.entities.Prestamo;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LUCAS MOLINA
 */
public class PrestamoService {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    private final PrestamoJpaController prestamoJpa = new PrestamoJpaController();
    private final LibroJpaController libroJpa = new LibroJpaController();
    private final ClienteService cs = new ClienteService();

    public void prestarLibro() {
        try {
            System.out.print("ISBN del Libro >> ");
            String isbn = read.next().trim();
            List<Libro> libros = libroJpa.consultarLibros("isbn", isbn);
            if (libros.isEmpty()) {
                throw new Exception("No se ha encontrado el libro");
            } else {
                Libro libro = libros.get(0);
                if (libro.getEjemplares() > libro.getEjemplaresPrestados()) {
                    System.out.println(libro);
                    System.out.println("================");
                    Cliente cliente = cs.ingresarCliente();
                    Date fechaPrestamo = new Date();

                    System.out.print("Cantidad dias a prestamo >> ");
                    String cantDias = read.next().trim();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(fechaPrestamo);
                    calendar.add(Calendar.DAY_OF_YEAR, Integer.parseInt(cantDias));
                    Date fechaDevolucion = calendar.getTime();

                    Prestamo prestamo = new Prestamo(fechaPrestamo, fechaDevolucion, libro, cliente);
                    System.out.println("""
                                   ========================================
                                                  CONFIRMAR
                                   ========================================
                                   """);
                    System.out.println("Cliente: " + prestamo.getCliente().getNombre());
                    System.out.println("Libro: " + prestamo.getLibro().getTitulo());
                    System.out.println("Fecha de devolucion: " + prestamo.getFechaDevolucion());
                    System.out.print("Y/N >> ");
                    String selec = read.next().trim();
                    if (selec.equalsIgnoreCase("Y")) {
                        libro.setEjemplaresPrestados(1);
                        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
                        libroJpa.editarLibro(libro);
                        prestamoJpa.crearPrestamo(prestamo);
                    }
                } else {
                    throw new Exception("""
                                        ========================================
                                                    LIBRO SIN STOCK
                                        ========================================
                                        """);
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public void devolucion() {
        try {
            System.out.print("ISBN del Libro >> ");
            String isbn = read.next().trim();
            List<Libro> libros = libroJpa.consultarLibros("isbn", isbn);

            System.out.print("Documento del Cliente >> ");
            String documento = read.next().trim();
            List<Prestamo> prestamos = prestamoJpa.buscarPrestamo(isbn, documento);

            if (libros.isEmpty() || prestamos.isEmpty()) {
                throw new Exception("No se encontro registro");
            } else {
                Libro libro = libros.get(0);
                System.out.println(libro);
                Prestamo prestamo = prestamos.get(0);
                System.out.println(prestamo);
                prestamo.setDevuelto(Boolean.TRUE);
                if (libro.getEjemplaresPrestados() > 0) {
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
                    libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
                } else {
                    throw new Exception("No hay préstamos de este libro, revise detalles del libro");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
