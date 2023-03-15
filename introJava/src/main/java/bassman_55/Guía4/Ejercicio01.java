package bassman_55.Guía4;

import java.util.Scanner;

public class Ejercicio01 {

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y 
dividir. La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados 
para imprimirlos en el main */
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int sel;
        
        do {
            System.out.println("Elija una opción");
            System.out.println("\n1 - Sumar\n2 - Restar\n3 - Dividir\n4 - Multiplicar\n5 - Salir");
            sel = read.nextInt();
            
            switch (sel){
            case 1:
                int suma = sumar(num1,num2);
                System.out.println("El resultado de la suma es: "+ suma);
                break;
            case 2:
                int resta = restar(num1,num2);
                System.out.println("El resultado de la resta es: "+ resta);
                break;
            case 3:
                double div = dividir(num1,num2);
                System.out.println("El resultado de la división es: "+ div);
                break;
            case 4:
                int mult = multip(num1,num2);
                System.out.println("El resultado de la multiplicación es: "+ mult);
                break;
            case 5:
                System.out.println("Eligió salir");
            }
        } while(sel != 5);
        
    }
    
    
    public static int sumar(int x,int y){
        return x+y;
    }
    
    
    public static int restar(int x,int y){
        return x-y;
    }
    
    
    public static double dividir(double x,double y){
        return x/y;
    }
    
    
    public static int multip(int x,int y){
        return x*y;
    }
    
    
}
