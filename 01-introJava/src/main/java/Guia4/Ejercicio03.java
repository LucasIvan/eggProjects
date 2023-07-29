package Guia4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio03 {

    /*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
    estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
    que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
    i.* 0.86 libras es un 1 € 
    ii. * 1.28611 $ es un 1 €
    iii. * 129.852 yenes es un 1 €
    */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad en euros");
        double euros = read.nextDouble();
        System.out.println("Seleccione a que moneda desea convertir\nA- Dólares\nB- Yenes\nC- Libras\n");
        String sel = read.next();
        
        cambio(euros,sel);
        
    }
    
    
    
    public static void cambio(double euros, String moneda){
        
        switch (moneda){
            case "A" -> {
                double dolar = euros * 1.28611;
                System.out.println(euros + " euros equivalen a $ " + dolar + " Dólares.");
            }
            case "B" -> {
                double yen = euros * 129.852;
                System.out.println(euros + " euros equivalen a Y " + yen + " Yenes.");
            }
            case "C" -> {
                double libra = euros * 0.86;
                System.out.println(libra + " euros equivalen a L " + libra + " Libras");
            }
        }
    }
    
}
