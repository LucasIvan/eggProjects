package Guia2;

import java.util.Scanner;

/**
    EJ 5 - Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
    el triple y la raíz cuadrada de ese número.
    Nota: investigar la función Math.sqrt().
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        System.out.println(doble);
        System.out.println(triple);
        System.out.println(Math.sqrt(num));
    }
    
}
