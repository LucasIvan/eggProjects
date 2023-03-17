package Guia2;

import java.util.Scanner;

/**
 *  EJ 2 - Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        System.out.println("Hola " + nombre + " estás programando en Java");
    }
    
}
