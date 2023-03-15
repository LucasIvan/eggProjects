package bassman_55.Guia3;

import java.util.Scanner;

/** EJ 5 - Escriba un programa en el cual se ingrese un valor límite positivo, y a
    continuación solicite números al usuario hasta que la suma de los
    números introducidos supere el límite inicial.
    */

public class Ejercicio05 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrse un número límite positivo");
        int numLimite = leer.nextInt();
        int suma = 0;
        do{
            System.out.println("Ingrse un número");
            int num = leer.nextInt();
            
            suma = suma + num;
            
        }while(suma<numLimite);
        
    }
    
}
