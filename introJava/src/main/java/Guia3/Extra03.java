package Guia3;

import java.util.Scanner;

/**
    EJ 3 - Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario 
    mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
    
        System.out.println("Ingrese una letra");
        String letra = read.next();
        letra = letra.toUpperCase();
        
        if (letra.equals("A")||letra.equals("E")||letra.equals("I")||letra.equals("O")||letra.equals("U")){
            System.out.print("Es una vocal");
        }else{
            System.out.print("No es vocal");
        }
    }
    
}
