package Guia5;

import java.util.Scanner;

/**
    Realice un programa que compruebe si una matriz dada es antisimétrica.
    Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
    pero cambiada de signo. Es decir, A es antisimétrica si A = -AT . 
    La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
    sus filas por columnas (o viceversa)
 * @author lucas
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] array = new int [3][3];
        int[][] array2 = new int [3][3];
        int cont = 0;
        
        llenarArray(array,array2);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == -array2[i][j]){
                    cont++;
                }
            }
        }
        
        if (cont==9) {
            System.out.println("La matriz es antisimétrica");
        }else{
            System.out.println("La matriz no es antisimétrica");
        }
        
    }
    
    public static void llenarArray(int[][] array, int[][] array2){
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = read.nextInt();
                array2[j][i]= array[i][j];
            }
        }
        
    }
    
}
