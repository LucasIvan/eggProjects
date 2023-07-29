package Guia5;

import java.util.Scanner;

/**
   Realizar un algoritmo que calcule la suma de todos los elementos 
   de un vector de tamaño N, con los valores ingresados por el usuario
 * @author lucas
 */
public class Extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int dimension = read.nextInt();
        
        int[] vector = new int[dimension];
        int suma = 0;
        
        System.out.println("Ahora rellene al vector");
        for (int i = 0; i < dimension; i++) {
            System.out.print("[" + i + "] >> ");
            vector[i] = read.nextInt();
            suma += vector[i];
        }
        
        System.out.println("El resultado de la suma de los elementos es: " + suma);
    }
    
}
