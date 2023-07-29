package Guia3;

import java.util.Scanner;
/**
 * EJ 8 - Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
   Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
   lo siguiente:
   * * * *
   *     *
   *     *
   * * * *     
*/
public class Ejercicio08 {

    /** 
     * @param args
     */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("Ingrse la cantidad de elementos");
        int cantidad = leer.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                if (i == 0 || i == cantidad-1) {
                    System.out.print(" * ");
                } else if (j == 0 || j == cantidad-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }
    }
    
}
