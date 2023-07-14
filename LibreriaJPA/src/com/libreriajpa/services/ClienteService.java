package com.libreriajpa.services;

import com.libreriajpa.controller.ClienteJpaController;
import com.libreriajpa.controller.PrestamoJpaController;
import com.libreriajpa.entities.Cliente;
import java.util.Scanner;

/**
 *
 * @author LUCAS MOLINA
 */
public class ClienteService {

    private final ClienteJpaController clienteJpa = new ClienteJpaController();
    private final PrestamoJpaController prestamoJpa = new PrestamoJpaController();
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Cliente ingresarCliente() {
        try {
            System.out.println("""
                               ========================================
                                           INGRESAR CLIENTE
                               ========================================
                               """);
            System.out.print("Documento >> ");
            String documento = read.next().trim();
            Cliente clienteBusqueda = clienteJpa.buscarCliente(documento);
            if (clienteBusqueda != null) {
                clienteEncontrado(clienteBusqueda);
                return clienteBusqueda;
            } else {
                Cliente cliente = crearCliente(documento);
                return cliente;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void clienteEncontrado(Cliente cliente) {
        System.out.println("""
                               ========================================
                                           CLIENTE ECONTRADO
                               ========================================
                               """);
        System.out.println(cliente);
        System.out.println("""
                               ========================================
                                   Desea atualizar datos del Cliente
                               ========================================
                               """);
        System.out.print("Y/N >> ");
        boolean selec = read.next().trim().equalsIgnoreCase("Y");
        if (selec) {
            actualizarCliente(cliente);
        }
    }

    private Cliente crearCliente(String documento) {
        try {
            System.out.println("""
                               ========================================
                                             Crear Cliente
                               ========================================
                               """);
            System.out.print("Nombre >> ");
            String nombre = read.next().trim();
            System.out.print("Apellido >> ");
            String apellido = read.next().trim();
            System.out.print("Telefono >> ");
            String telefono = read.next().trim();

            Cliente cliente = new Cliente(Long.valueOf(documento), nombre, apellido, telefono);

            System.out.println("""
                               ========================================
                                            CONFIRMAR DATOS
                               ========================================
                               
                               """);
            System.out.println(cliente);
            System.out.println("""
                               ========================================
                                    Desea confirmar los datos?
                               ========================================
                               """);
            System.out.print("Y/N >> ");
            boolean selec = read.next().trim().equalsIgnoreCase("Y");

            if (selec) {
                clienteJpa.crearCliente(cliente);
                System.out.println("""
                               ========================================
                                          REGISTRO COMPLETADO
                               ========================================
                               """);
                return cliente;
            } else {
                System.out.println("""
                               ========================================
                                 HA CANCELADO EL INGRESO DEL CLIENTE
                               ========================================
                               """);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EXCEPCION AL INTENTAR CREAR CLIENTE");
        }
        return null;
    }

    private void actualizarCliente(Cliente cliente) {
        boolean salir = false;
        do {
            System.out.println("""
                                   ========================================
                                                  MENU EDITAR
                                   ========================================
                                             1 - Editar Alta
                                             2 - Editar Nombre
                                             3 - Editar Apellido
                                             4 - Editar Telefono
                                             5 - Editar Documento
                                             6 - Confirmar Cambios
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
                            case "A" ->
                                clienteJpa.switchAlta(cliente, Boolean.TRUE);
                            case "B" ->
                                clienteJpa.switchAlta(cliente, Boolean.FALSE);
                            default ->
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
                        cliente.setNombre(nombre);
                    }
                    case "3" -> {
                        System.out.print("Ingrese Nuevo Apellido >> ");
                        String apellido = read.next().trim();
                        cliente.setApellido(apellido);
                    }
                    case "4" -> {
                        System.out.print("Ingrese Nuevo Telefono >> ");
                        String telefono = read.next().trim();
                        cliente.setTelefono(telefono);
                    }
                    case "5" -> {
                        System.out.print("Ingrese Nuevo Documento >> ");
                        String documento = read.next().trim();
                        cliente.setDocumento(Long.valueOf(documento));
                    }
                    case "6" -> {
                        System.out.println("""
                                   ========================================
                                               CONFIRMAR CAMBIOS
                                   ========================================
                                   """);
                        System.out.println(cliente);
                        System.out.println("""
                               ========================================
                                   Confirmar y actualizar los datos?
                               ========================================
                               """);
                        System.out.print("Y/N >> ");
                        boolean selec = read.next().trim().equalsIgnoreCase("Y");
                        if (selec) {
                            clienteJpa.editarCliente(cliente);
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

    public void consultasCliente() {
        try {
            String selec;
            System.out.println("""
                           
                           ========================================
                                         BUSCAR CLIENTE
                           ======================================== 
                           """);
            System.out.print("Documento >> ");
            String documento = read.next().trim();
            Cliente clienteBusqueda = clienteJpa.buscarCliente(documento);
            if (clienteBusqueda != null) {
                System.out.println(clienteBusqueda);
                submenuCliente(clienteBusqueda);
            } else {
                System.out.println("""
                           
                           ========================================
                                     Cliente no encontrado
                           ========================================
                                  Desea crear nuevo cliente?
                           """);
                System.out.print(" Y/N >> ");
                selec = read.next().trim();
                if (selec.equalsIgnoreCase("Y")) {
                    crearCliente(documento);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void submenuCliente(Cliente cliente) {
        try {
            System.out.println("""
                           ========================================
                                         MENU CLIENTE
                           ======================================== 
                               1 - Editar registro
                               2 - Listar Prestamos del cliente
                               0 - Salir
                           ========================================
                           """);
            System.out.print(">> ");
            String selec = read.next().trim();
            switch (selec) {
                case "1" -> {
                    actualizarCliente(cliente);
                }
                case "2" -> {
                    prestamoJpa.consultarPrestamosCliente(""+cliente.getDocumento());
                }
                case "0" -> {
                    
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

    }

}
