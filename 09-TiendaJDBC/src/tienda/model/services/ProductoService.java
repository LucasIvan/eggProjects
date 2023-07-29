package tienda.model.services;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Scanner;
import tienda.model.entities.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author lucas
 */
public class ProductoService {

    private static final Scanner read = new Scanner(System.in).useDelimiter("\n");
    private final ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto(){
        String nombre;
        Double precio;
        Integer codigoFabricante;

        NumberFormat format = NumberFormat.getInstance();
        Number number;

        System.out.println("""
                           
                           ===============================================================================
                           =                        Ingrese los datos del Producto                       =
                           ===============================================================================
                           """);

        while (true) {
            try {
                System.out.print("Nombre del producto >> ");
                nombre = read.next().trim();
                if (nombre.isEmpty()) {
                    throw new Exception("Debe indicar el nombre del producto");
                }

                System.out.print("Precio >> ");
                String precioStr = read.next().trim();
                if (precioStr.isEmpty()) {
                    throw new Exception("Debe indicar el precio del producto");
                }

                try {
                    number = format.parse(precioStr);
                    precio = number.doubleValue();
                } catch (ParseException e) {
                    throw new Exception("Debe ingresar un precio valido");
                }

                System.out.print("Codigo de Fabricante >> ");
                String fabricanteStr = read.next().trim();
                if (fabricanteStr.isEmpty()) {
                    throw new Exception("Debe indicar el codigo de fabricante");
                }
                try {
                    number = format.parse(fabricanteStr);
                    codigoFabricante = number.intValue();
                } catch (ParseException e) {
                    throw new Exception("Debe ingresar un codigo de fabricante válido");
                }

                break;
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCodigoFabricante(codigoFabricante);

        System.out.println("""
                           
                           ===============================================================================
                           =                        Verifique los datos ingresados                       =
                           ===============================================================================
                           """);
        System.out.println("Se fijo el nombre del producto en: " + nombre
                + "\nSe fijo el precio del producto en: " + precio
                + "\nSe fijo el codigo de fabricante en: " + codigoFabricante);
        System.out.println("""
                           
                           ===============================================================================
                           Ingrese 'S' si todo esta corecto y desea continuar con el registro del producto
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
            dao.ingresarProducto(producto);
            System.out.println("""
                           
                           ===============================================================================
                           =                    El producto se registro correctamente                    =
                           ===============================================================================
                           """);
        } else {
            System.out.println("""
                           ===============================================================================
                           =                    Ha cancelado el registro del producto                    =
                           ===============================================================================
                           """);
        }

    }

    public void listarProductos(String sql){
        try {
            Collection<Producto> productos = dao.listarProductos(sql);
            if (productos.isEmpty()) {
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
                for (Producto producto : productos) {
                    String codigo = String.format("%-2s", producto.getCodigo());
                    String nombre = String.format("%-30s", producto.getNombre());
                    String precio = String.format("$ %s", producto.getPrecio());
                    System.out.println("\t" + codigo + " - " + nombre + "\t\t\t" + precio);
                }
                System.out.println("\n===============================================================================\n\n\n");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
