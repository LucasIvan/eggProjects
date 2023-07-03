package tienda.model.services;

import java.util.Collection;
import java.util.Scanner;
import tienda.model.entities.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author lucas
 */
public class FabricanteService {
    
    private static final Scanner read = new Scanner(System.in).useDelimiter("\n");
    private final FabricanteDAO dao;

    public FabricanteService() {
        this.dao = new FabricanteDAO();
    }
    
    public void crearFabricante(){
        String nombre;

        System.out.println("""
                           
                           ===============================================================================
                           =                       Ingrese los datos del Fabricante                      =
                           ===============================================================================
                           """);

        while (true) {
            try {
                System.out.print("Nombre del Fabricante >> ");
                nombre = read.next().trim();
                if (nombre.isEmpty()) {
                    throw new Exception("Debe indicar el nombre del fabricante");
                }
                break;
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        Fabricante fabricante = new Fabricante();
        fabricante.setNombre(nombre);

        System.out.println("""
                           
                           ===============================================================================
                           =                        Verifique los datos ingresados                       =
                           ===============================================================================
                           """);
        System.out.println("Se fijo el nombre del Fabricante en: " + nombre);
        System.out.println("""
                           
                           ===============================================================================
                           =     Ingrese 'S' si todo esta corecto y desea continuar con el registro      =
                           ===============================================================================
                           """);
        String input = read.next().trim();
        boolean selec;

        if (input.isEmpty()) {
            selec = false;
        } else {
            selec = input.toUpperCase().charAt(0) == 'S';
        }
        if (selec) {
            dao.ingresarFabricante(fabricante);
            System.out.println("""
                           
                           ===============================================================================
                           =                  El Fabricante se registro correctamente                    =
                           ===============================================================================
                           """);
        } else {
            System.out.println("""
                           ===============================================================================
                           =                   Ha cancelado el registro del fabricante                   =
                           ===============================================================================
                           """);
        }

    }
    
    public void listarFabricante(String sql){
        try {
            Collection<Fabricante> fabricantes = dao.listarFabricantes(sql);
            if (fabricantes.isEmpty()) {
                throw new Exception("""
                                   
                                   ===============================================================================
                                   =                        Su consulta no dio resultados                        =
                                   ===============================================================================
                                   
                                   """);
            } else {
                System.out.println("""
                                   
                                   ===============================================================================
                                   =                           Lista de Productos                                =
                                   ===============================================================================
                                        Codigo                        Nombre                        Precio
                                   """);
                for (Fabricante fabricante : fabricantes) {
                    String codigo = String.format("%-2s", fabricante.getCodigo());
                    String nombre = String.format("%-30s", fabricante.getNombre());
                    System.out.println("\t" + codigo + " - " + nombre + "\t\t\t");
                }
                System.out.println("\n===============================================================================\n\n\n");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
