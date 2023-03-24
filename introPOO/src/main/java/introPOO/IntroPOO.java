package introPOO;

import introPOO.entidades.Cancion;
import java.util.Scanner;
import introPOO.entidades.Circunferencia;
import introPOO.entidades.Libro;
import introPOO.entidades.Operacion;
import introPOO.entidades.Puntos;
import introPOO.entidades.Rectangulo;


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
        
        Puntos dist = new Puntos();
        dist.crearPuntos();
        System.out.println("La distancia entre los puntos es: " + dist.distancia());
    }
    
}
