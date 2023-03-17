package Guia4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
    1. Implementar una función que permita obtener un número entero aleatorio comprendido 
    entre dos límites que introduciremos por teclado. El número obtenido se debe mostrar por pantalla.
 */
public class Extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese límite mínimo");
        int min = read.nextInt();
        System.out.println("Ingrese límite máximo");
        int max = read.nextInt();
        
        System.out.println(nRandom(min,max));
    }
    public static int nRandom(int min, int max){
       return ThreadLocalRandom.current().nextInt(min, max);
   }
}
