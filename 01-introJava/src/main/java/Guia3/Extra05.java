package Guia3;

import java.util.Scanner;

/**
    EJ 5 - Una obra social tiene tres clases de socios:
        Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
         descuento en todos los tipos de tratamientos.
        Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
         descuento para los mismos tratamientos que los socios del tipo A.
        Los socios que menos aportan, los de tipo ‘C’, no reciben
          descuentos sobre dichos tratamientos.
        Solicite una letra (carácter) que representa la clase de un socio, y
         luego un valor real que represente el costo del tratamiento (previo
         al descuento) y determine el importe en efectivo a pagar por dicho socio.
 */
public class Extra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Indique la categoría del socio");
        String clase = read.next();
        clase = clase.toUpperCase();
        System.out.println("Ingrese el costo del tratamiento");
        double costo = read.nextDouble();
        
        switch (clase) {
            case "A" -> {
                costo = costo - costo * 0.5;
                System.out.println("El costo del tratamiento será de: " + costo);
            }
            case "B" -> {
                costo = costo - costo * 0.35;
                System.out.println("El costo del tratamiento será de: " + costo);
            }
            case "C" -> System.out.println("El costo del tratamiento será de: " + costo);
            default -> System.out.println("Error - Categoría no registrada");
        }
    }
    
}
