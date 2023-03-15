package bassman_55.Guia3;

import java.util.Scanner;

/**
    EJ 4 - Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
    muestre su equivalente en romano
 */
public class Extra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un número entre 1 y 10");
        int num = read.nextInt();
 
        if (num == 10) {
            System.out.print("X");
        } else if (num == 5) {
            System.out.print("V");
        } else if (num < 4) {
            for (int j = 0; j < num; j++) {
                System.out.print("I");
            }
        } else if (num > 5 && num < 9) {
            System.out.print("V");
            for (int j = 0; j < num - 5; j++) {
                System.out.print("I");
            }
        } else if (num == 9) {
            System.out.print("IX");
        } else if (num == 4) {
            System.out.print("IV");
        } else {
            System.out.println("El numero es incorrecto");
        }
    }
    
}
