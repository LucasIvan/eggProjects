package bassman_55.Guia3;

import java.util.Scanner;

/**
 * Ej 1 - Crear un programa que dado un número determine si es par o impar.
*/

public class Ejercicio01 {

    /**
     * @param args        
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrse un número");
        int num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
        
    }
    
}
