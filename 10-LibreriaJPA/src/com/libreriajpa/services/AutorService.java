package com.libreriajpa.services;

import java.util.Scanner;
import com.libreriajpa.entities.Autor;
import com.libreriajpa.controller.AutorJpaController;

/**
 *
 * @author LUCAS MOLINA
 */
public class AutorService {

    private final AutorJpaController autorJpa = new AutorJpaController();
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Autor ingresarAutor(String nombre) {
        try {
            Autor autorBusqueda = autorJpa.buscarAutor(nombre);
            if (autorBusqueda != null) {
                System.out.println("""
                               ========================================
                                      Se vincula Autor existente
                               ========================================
                               """);
                return autorBusqueda;
            } else {
                System.out.println("""
                               ========================================
                                   Se crea nueva instancia de Autor
                               ========================================
                               """);
                Autor autor = new Autor(nombre);
                autorJpa.crearAutor(autor);
                return autor;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void consultarAutor() {
        try {
            System.out.println("""
                           
                           ========================================
                                      CONSULTAR AUTORES
                           ========================================
                           """);
            System.out.print("NOMBRE >> ");
            String nombre = read.next();
            Autor busqueda = autorJpa.buscarAutor(nombre);
            if (busqueda != null) {
                autorEncontrado(busqueda);
            } else {
                System.out.println("""
                               ========================================
                                    No hay coincidencias de Autor.
                               ========================================
                               """);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void actualizarAutor(Autor autor) {
        try {
            boolean salir = false;
            do {
                System.out.println("""
                                   ========================================
                                                  MENU EDITAR
                                   ========================================
                                             1 - Editar Alta
                                             2 - Editar Nombre
                                             3 - Confirmar Cambios
                                             0 - Salir
                                   ========================================
                                   """);
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
                                autorJpa.switchAlta(autor, Boolean.TRUE);
                                break;
                            case "B":
                                autorJpa.switchAlta(autor, Boolean.FALSE);
                            default:
                                System.out.println("""
                                           ========================================
                                                        Opcion inválida
                                           ========================================
                                           """);
                        }
                    }
                    case "2" -> {
                        System.out.print("Ingrese Nuevo Nombre >> ");
                        String nombre = read.next().trim();
                        autor.setNombre(nombre);
                    }
                    case "3" -> {
                        System.out.println("""
                                   ========================================
                                               CONFIRMAR CAMBIOS
                                   ========================================
                                   """);
                        System.out.println(autor);
                        System.out.println("""
                               ========================================
                                   Confirmar y actualizar los datos?
                               ========================================
                               """);
                        System.out.print("Y/N >> ");
                        boolean selec = read.next().trim().equalsIgnoreCase("Y");
                        if (selec) {
                            autorJpa.editarAutor(autor);
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
            } while (!salir);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean autorEncontrado(Autor autor) {
        System.out.println("""
                               ========================================
                                            AUTOR ENCONTRADO
                               ========================================
                               """);
        System.out.println(autor);
        System.out.println("""
                               ========================================
                                    Desea atualizar datos del Autor
                               ========================================
                               """);
        System.out.print("Y/N >> ");
        boolean selec = read.next().trim().equalsIgnoreCase("Y");
        if (selec) {
            actualizarAutor(autor);
        }
        return true;
    }

    public void darBaja() {
        try {
            System.out.println("""
                           ========================================
                                        DAR BAJA AUTOR
                           ========================================
                           """);
            System.out.print("Nombre >> ");

            String nombre = read.next().trim();
            Autor autor = autorJpa.buscarAutor(nombre);
            if (autor != null) {
                if (autor.getAlta()) {
                    autorJpa.switchAlta(autor, Boolean.FALSE);
                    System.out.println("Autor: " + autor.getNombre() + " Dado de Baja");
                } else {
                    System.out.println("No se encontro el autor");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}