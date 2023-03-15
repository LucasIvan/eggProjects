package bassman_55.Guia2;

import java.util.Scanner;

/**
    EJ 3 - Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
    Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        System.out.println("Ingresa una frase");
        frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
