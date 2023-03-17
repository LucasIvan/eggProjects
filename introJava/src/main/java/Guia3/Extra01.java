package Guia3;

import java.util.Scanner;

/** EJ 1 - Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
    si el usuario ingresa 1600 minutos, el sistema debe calcular su 
    equivalente: 1 día, 2 horas*/

public class Extra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
    
        double minutos, horas, dias;
        
        System.out.println("Ingrese el tiempo en minutos");
        minutos = read.nextInt();
        
        dias = 0;
        horas = minutos / 60;

        while (horas > 24) {
            dias++;
            horas = horas - 24;
        }
        System.out.println((int) dias + " días y " + (int) horas + " hs");
    }
    
}
