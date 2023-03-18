package Guia5;

import java.util.Scanner;

/**
    Crear una función que rellene un vector con números aleatorios, pasándole
    un arreglo por parámetro. Después haremos otra función o
    procedimiento que imprima el vector.
 * @author lucas
 */
public class Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño para el vector");
        int dimension = read.nextInt();
        
        int[] vector = new int[dimension];
        
        llenarVec(vector, dimension);
        imprimirVec(vector, dimension);
    }
    
    public static void llenarVec(int[] vector, int dimension){
        
        for (int i = 0; i < dimension; i++) {
            vector[i] = (int) (Math.random() * 99) + 1;
        }
        
    }
    
    public static void imprimirVec(int[] vector, int dimension){
        
        for (int i = 0; i < dimension; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        
    }
    
  
    
}
