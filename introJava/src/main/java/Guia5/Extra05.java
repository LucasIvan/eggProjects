package Guia5;

import java.util.Scanner;

/**
 * Realizar un programa que llene una matriz de tamaño NxM con valores 
 * aleatorios y muestre la suma de sus elementos.
 * @author lucas
 */
public class Extra05 {
static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese el tamaño para la matriz");
        int n = read.nextInt();
        System.out.print(n + "x");
        int m = read.nextInt();
        
        int[][] array = new int[n][m];
        
        llenarArray(array,n,m);
        
        System.out.println("La suma de los elementos de la matriz es: " + sumarElem(array,n,m));
    }
    
    public static void llenarArray(int[][] array, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 99 + 1);
            }
        }
    }
    
    public static int sumarElem(int[][] array, int n, int m){
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += array[i][j];
            }
        }
        return suma;
    }
    
}
