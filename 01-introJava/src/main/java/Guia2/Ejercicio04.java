package Guia2;

import java.util.Scanner;

/**
    EJ 4 - Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
    La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en C");
        float C = leer.nextFloat();
        float F = 32 + (9 * C / 5);
        System.out.println(F);
    }
    
}
