package Guia3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
    EJ 6 - Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
    y el promedio de estaturas en general.
 */
public class Extra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        double altura, suma = 0, sumaUn = 0, cantUn = 0;
        
        System.out.println("Ingrese la cantidad de personas");
        int cantidad = read.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese estaturas: ");
            altura = read.nextFloat();
            if (altura < 1.60){
                sumaUn += altura;
                cantUn++;
            }
            suma += altura;
        }
        sumaUn /= cantUn;
        suma /= cantidad;
                
        DecimalFormat formato = new DecimalFormat("####.##");
        
        System.out.println("El promedio de estaturas por debajo de 1.60mts es: " + formato.format(sumaUn));

        System.out.println("El promedio de estaturas general es: " + formato.format(suma));
    }
    
}
