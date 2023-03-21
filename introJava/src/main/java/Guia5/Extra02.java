package Guia5;

import java.util.Scanner;

/**
    Escriba un programa que averigüe si dos vectores de N enteros son
    iguales (la comparación deberá detenerse en cuanto se detecte alguna
    diferencia entre los elementos)
 * @author lucas
 */
public class Extra02 {
static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        System.out.println("Ingrese el tamaño de los vectores");
        int dimension = read.nextInt();
        
        int[] vector = new int[dimension];
        int[] vector2 = new int[dimension];
        
        System.out.println("Llene el primer vector");
        llenarVector(vector);
        
        System.out.println("Llene el vector a comparar");
        llenarVector(vector2);

        
        if (comparar(vector, vector2)) {
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores son diferentes");
        }
        
    }
    
    public static void llenarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + i + "] >> ");
            vector[i] = read.nextInt();
        }
    }
    
    public static boolean comparar(int[] vector, int[] vector2){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }
    
}
