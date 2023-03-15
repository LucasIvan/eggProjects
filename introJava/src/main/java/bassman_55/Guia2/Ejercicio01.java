
package bassman_55.Guia2;

import java.util.Scanner;

/**
 *  EJ 1 - Escribir un programa que pida dos números enteros por teclado y calcule
        la suma de los dos. El programa deberá después mostrar el resultado de la suma.
 */

public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("El valor de la suma es: " + suma);
    }
    
}
