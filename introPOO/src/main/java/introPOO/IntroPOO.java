package introPOO;

import java.util.Scanner;
import introPOO.entidades.Cancion;
import introPOO.entidades.Circunferencia;
import introPOO.entidades.Cocina;
import introPOO.entidades.Cuenta;
import introPOO.entidades.Juego;
import introPOO.entidades.Libro;
import introPOO.entidades.Operacion;
import introPOO.entidades.Producto;
import introPOO.entidades.Puntos;
import introPOO.entidades.Receta;
import introPOO.entidades.Rectangulo;
import java.util.ArrayList;
import java.util.List;


public class IntroPOO {

    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        //----------------------- EJ 1 -----------------------------------------
        
        /*
        Libro lib1 = new Libro();
        lib1.ingresarLibro();
        System.out.println(lib1);
        */
        
        //------------------------ EJ 2 ----------------------------------------
        /*
        
        Circunferencia r = new Circunferencia();
        r.crearCircunferencia();        
        System.out.println(r.getRadio());
        System.out.println(r.area());        
        System.out.println(r.perimetro());
        */
        
        //-------------------------- EJ 3 --------------------------------------
        /*
        
        Operacion op = new Operacion();
        op.crearOperacion();
        
        System.out.println(op.dividir());
        */
        
        //-------------------------- EJ 4 --------------------------------------
        /*
        Rectangulo fig = new Rectangulo();
        fig.crearRectangulo();
        
        System.out.println("El perímetro del rectángulo es: " + fig.perimetro());
        System.out.println("La superficie del rectángulo es: " + fig.superficie());
        fig.dibujarRectangulo();
        */
        
        //------------------------- EJ EX 1 ------------------------------------
        /*
        Cancion can = new Cancion();
        can.setTitulo("pachanga");
        can.setAutor("wakanda");
        
        System.out.println(can);
        */
        
        //------------------------- EJ EX 2 ------------------------------------
        /*
        Puntos dist = new Puntos();
        
        dist.crearPuntos();
        System.out.println("La distancia entre los puntos es: " + dist.distancia());
        */
        //------------------------- EJ EX 0 ------------------------------------
        /*
        Producto prod = new Producto();
        
        prod.crearProducto();
        System.out.println("Despues de Crear");
        prod.mostrarProducto();
        prod.venderProducto();
        System.out.println("Despues de Vender");
        prod.mostrarProducto();
        prod.cambiarPrecio();
        System.out.println("Despues de Cambiar Precio");
        prod.mostrarProducto();
        */
        
        //----------------------- EJ EX 3 --------------------------------------
        /*
        Juego game = new Juego();
        game.iniciarJuego();
        */
        
        //------------------------ EJ EX 4 -------------------------------------
        /*
        Cocina cocina = new Cocina();
        
        cocina.crearReceta();
        cocina.crearReceta();
        cocina.crearReceta();
        
        System.out.println("Ingrese la receta buscada");
        System.out.println(cocina.buscarReceta(read.nextLine()));
        
        System.out.println("Ingrese un ingrediente");
        System.out.println(cocina.buscarIngrediente(read.nextLine()));
        */
        //------------------------ EJ EX 5 -------------------------------------
        /*
        Cuenta lucas = new Cuenta(500.30,"Lucas");
        lucas.retirarDinero();
        */
        

    }
    
}
