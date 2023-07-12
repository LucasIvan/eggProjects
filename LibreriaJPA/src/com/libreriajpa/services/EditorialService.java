package com.libreriajpa.services;

import java.util.Scanner;
import com.libreriajpa.entities.Editorial;
import com.libreriajpa.controller.EditorialJpaController;

/**
 *
 * @author LUCAS MOLINA
 */
public class EditorialService {

    private final EditorialJpaController editorialJpa = new EditorialJpaController();
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Editorial ingresarEditorial(String nombre) {
        try {
            Editorial editorialBusqueda = editorialJpa.buscarEditorial(nombre);
            if (editorialBusqueda != null) {
                System.out.println("""
                               ========================================
                                    Se vincula Editorial existente
                               ========================================
                               """);
                return editorialBusqueda;
            } else {
                System.out.println("""
                               ========================================
                                 Se crea nueva instancia de Editorial
                               ========================================
                               """);
                Editorial editorial = new Editorial(nombre);
                editorialJpa.crearEditorial(editorial);
                return editorial;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void consultarEditorial() {
        try {
            System.out.println("""
                           
                           ========================================
                                     CONSULTAR EDITORIAL
                           ========================================
                           """);
            System.out.print("NOMBRE >> ");
            String nombre = read.next();
            Editorial busqueda = editorialJpa.buscarEditorial(nombre);
            if (busqueda != null) {
                editorialEncontrada(busqueda);
            } else {
                System.out.println("""
                               ========================================
                                  No hay coincidencias de Editorial.
                               ========================================
                               """);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void actualizarEditorial(Editorial editorial) {
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
                                editorialJpa.switchAlta(editorial, Boolean.TRUE);
                                break;
                            case "B":
                                editorialJpa.switchAlta(editorial, Boolean.FALSE);
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
                        editorial.setNombre(nombre);
                    }
                    case "3" -> {
                        System.out.println("""
                                   ========================================
                                               CONFIRMAR CAMBIOS
                                   ========================================
                                   """);
                        System.out.println(editorial);
                        System.out.println("""
                               ========================================
                                   Confirmar y actualizar los datos?
                               ========================================
                               """);
                        System.out.print("Y/N >> ");
                        boolean selec = read.next().trim().equalsIgnoreCase("Y");
                        if (selec) {
                            editorialJpa.editarEditorial(editorial);
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

    private boolean editorialEncontrada(Editorial editorial) {
        System.out.println("""
                               ========================================
                                            AUTOR ENCONTRADO
                               ========================================
                               """);
        System.out.println(editorial);
        System.out.println("""
                               ========================================
                                    Desea atualizar datos del Autor
                               ========================================
                               """);
        System.out.print("Y/N >> ");
        boolean selec = read.next().trim().equalsIgnoreCase("Y");
        if (selec) {
            actualizarEditorial(editorial);
        }
        return true;
    }

    public void darBaja() {
        try {
            System.out.println("""
                           ========================================
                                      DAR BAJA EDITORIAL
                           ========================================
                           """);
            System.out.print("Nombre >> ");
            String nombre = read.next().trim();
            Editorial editorial = editorialJpa.buscarEditorial(nombre);
            if (editorial != null) {
                if (editorial.getAlta()) {
                    editorialJpa.switchAlta(editorial, Boolean.FALSE);
                    System.out.println("Editorial: " + editorial.getNombre() + " Dada de Baja");
                } else {
                    System.out.println("No se encontro la editorial");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
