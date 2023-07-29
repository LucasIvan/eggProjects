package Guia5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/**
    Realizar un algoritmo que llene un vector de tamaño N con valores
    aleatorios y le pida al usuario un número a buscar en el vector. El
    programa mostrará dónde se encuentra el numero y si se encuentra repetido
 * @author lucas
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int tamanioV = read.nextInt();
        
        int[] vector = new int [tamanioV];
        llenarV(vector, tamanioV);
        
        System.out.println("Ingrese un número para buscar");
        int num = read.nextInt();
        
        int cantidad = buscador(vector, tamanioV, num);
        if (cantidad>1) {
            System.out.println("El número se encuentra más de una vez");
        }else if (cantidad==0) {
            System.out.println("El número no se encontró en el vector");
        }
        
    }
    
    public static void llenarV(int[] vector,int tamanioV){
        for (int i = 0; i < tamanioV; i++) {
            vector[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }
    }
    
    public static int buscador(int[] vector,int tamanioV, int num){
        int cont = 0;
        for (int i = 0; i < tamanioV; i++) {
            if (vector[i]== num) {
                if (cont == 0) {
                    System.out.println("El número se encontró en el índice: [" + i + "]");
                }
                cont++;
            }
        }
        return cont;
    }
    
}
