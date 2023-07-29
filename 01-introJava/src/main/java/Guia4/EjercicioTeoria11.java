package Guia4;

import java.util.Scanner;

public class EjercicioTeoria11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String frase;
        do {
            System.out.println("Ingrese una frase/palabra finalizada en punto");
            frase = read.next();
            if (frase.substring(frase.length()-1, frase.length()).equals(".")) {
                codificador(frase);
            }else{
                System.out.println("No finalizó la frase en un punto");
            }
        } while (!frase.substring(frase.length()-1, frase.length()).equals("."));
        
    }
    
    public static void codificador(String frase){
        //frase = frase.toLowerCase();
        int longitud = frase.length();
        String car, codi;
        for (int i = 0; i < longitud; i++) {
            car = frase.substring(i, i+1);
            switch (car){
                case "a":
                    codi = "@";
                    break;
                case "e":
                    codi = "#";
                    break;
                case "i":
                    codi = "$";
                    break;
                case "o":
                    codi = "%";
                    break;
                case "u":
                    codi = "*";
                    break;
                default:
                    codi = car;
                    break;
            }
            System.out.print(codi);
        }
       
    }

}

