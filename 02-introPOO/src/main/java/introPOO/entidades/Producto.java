package introPOO.entidades;

import java.util.Scanner;

public class Producto {
    //Atributos
    private String Nombre;
    private String Codigo;
    private int Stock;
    private double Precio;
    private static Scanner read = new Scanner(System.in);
    //Constructores
    public Producto(){    
    }
    public Producto(String Nombre, String Codigo, int Stock, double Precio) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Stock = Stock;
        this.Precio = Precio;
    }
    //Métodos
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    public int getStock() {
        return Stock;
    }
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    public void crearProducto(){
        Scanner sc = new Scanner (System.in);// Instanciación
        System.out.print("Ingrese la descripción del Producto: ");
        Nombre = sc.nextLine();
        System.out.print("Ingrese el Código del Producto: ");
        Codigo = sc.nextLine();
        System.out.print("Ingrese el Stock del Producto: ");
        Stock = sc.nextInt();
        System.out.print("Ingrese el Precio del Producto: ");
        Precio = sc.nextDouble();
    }
    public void venderProducto(){
       int venta;
       String resp;
       boolean concluida;
        do {    
            System.out.print("Ingrese la cantidad de producto vendido: ");
            venta = read.nextInt();
            if (Stock >= venta) {
                Stock -= venta;
                concluida = true;
            } else {
                System.out.println("Cantidad insuficiente...\n Cantidad disponible: "+Stock);
                System.out.print("Desea continuar con la venta S/N: ");
                read.next();
                resp = read.nextLine();
                concluida = !resp.equalsIgnoreCase("S");
            }    
        } while (concluida == false);       
    }
    public void cambiarPrecio(){
        
        double newPrice;
        boolean concluido;
        do {            
            System.out.print("Ingrese el nuevo precio: ");
            newPrice = read.nextDouble();
            if (newPrice>0) {
                Precio = newPrice;
                concluido = true;
            } else {
                System.out.println("El precio del producto no puede ser 0 o Negativo...");
                concluido = false;
            }
        } while (concluido == false);  
    }
    public void mostrarProducto(){
        System.out.println("Descripción de Producto: "+Nombre);
        System.out.println("Código de Producto: "+Codigo);
        System.out.println("Stock de Producto: "+Stock);
        System.out.println("Precio de Producto: "+Precio);
    }
    
}