package Guia5;

import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9
 * @author lucas
 */
public class Ejercicio06 {

    // defino el scanner como static para poder usarlo en las funciones que haga falta.
    static Scanner read = new Scanner(System.in); 
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int dimension;
        //defino el tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz, no debe superar el orden 10.");
        dimension = read.nextInt();
        
        if (dimension<1 || dimension>10) { //limito el tamaño a 10
            do {
               System.out.println("Ingrese un tamaño válido");
               dimension = read.nextInt();
               //hasta que no se ingrese un tamaño entre 1 y 10 no se saldrá del bucle
            } while (dimension< 1 || dimension >10); 
        }

        int[][] array = new int[dimension][dimension];//defino el array
        
        llenarArray(array, dimension);//llamo a la función para rellenar el array
        
        boolean verif = magic(array, dimension);//retorno la verificación de las sumas
        
        mostrarArray(array,dimension);
        if (verif) {
            System.out.println("!!!!!!!!!!!!!!!!!\n ES un cuadrado mágico :)");
        }else{
            System.out.println("!!!!!!!!!!!!!!!!!\n NO es un cuadrado mágico :(");
        }
        
        
    }
        
    
    public static void llenarArray(int[][] array, int dimension){
        int num;
        
        System.out.println("Rellene la matriz");
        
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                do {
                    System.out.print("[" + i + ", " + j + "] >> ");
                    num = read.nextInt();
                } while (num<1 || num>dimension*dimension);
                array[i][j] = num;
            }
        }  
    }
    
    public static boolean magic(int[][] array, int dimension){
        
        int diagPrinc = 0, diagSec = 0, sumaFila, sumaCol;
        boolean magic;
        
        for (int i = 0; i < dimension; i++) {
            diagPrinc += array[i][i];
            diagSec += array[i][dimension-1-i];
        }
        //comparo los valores de las sumas de las diagonales
        magic = (diagPrinc == diagSec);
        
        if (magic) {
            for (int i = 0; i < dimension; i++) {
                sumaFila = 0;
                sumaCol = 0;
                for (int j = 0; j < dimension; j++) {
                    sumaFila += array[i][j];
                    sumaCol += array[j][i];
                }
                //comparo las sumas de columnas y filas con la diagonal
                magic = (sumaFila == sumaCol) && (sumaFila == diagPrinc); 
            }
        }
        return magic;
    }
    
    public static void mostrarArray(int[][] array, int dimension){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
