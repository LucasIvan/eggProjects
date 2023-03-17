package Guia5;

import java.util.Scanner;

/**
    Recorrer un vector de N enteros contabilizando cuántos números son de
    1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 * @author lucas
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int tamanioV = read.nextInt();
        
        int[] vector = new int [tamanioV];
        llenarVec(vector, tamanioV);
        
        contar(vector, tamanioV);  
    }


    public static void llenarVec(int[] vector, int tamanioV){
        
        for (int i = 0; i < tamanioV; i++) {
            vector[i] = (int) (Math.random() * 99999) + 1;
        }
        
    }


    public static void contar(int[] vector, int tamanioV){
        
        int digit, unD = 0, dosD = 0, tresD = 0, cuatroD = 0, cincoD = 0;
        
        for (int i = 0; i < tamanioV; i++) {
            digit = digitos(vector[i]);
            
            switch (digit){
                case 1 -> {
                    unD++;
                }
                case 2 -> {
                    dosD++;
                }
                case 3 -> {
                    tresD++;
                }
                case 4 -> {
                    cuatroD++;
                }
                case 5 -> {
                    cincoD++;
                }
            }
            
        }
        
        System.out.println("Lista de números según dígitos\n"
                + "Con un dígito hay: " + unD +" números\n"
                + "Con dos dígitos hay: " + dosD +" números\n"
                + "Con tras dígitos hay: " + tresD +" números\n"
                + "Con cuatro dígitos hay: " + cuatroD +" números\n"
                + "Con cinco dígitos hay: " + cincoD +" números\n");
        
    }


    public static int digitos(int num){
        
        int digitos = 0;
        
        while(num != 0){
            num = num/10;
            digitos++;
        }
        return digitos;
    }
    
    
}