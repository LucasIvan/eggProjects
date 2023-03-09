
package bassman_55.introjava;

import java.util.Scanner;

//@author bassman_55

public class IntroJava {

     public static void main(String[] args) {
        
        //variable scanner para leer datos del usuario
        Scanner leer = new Scanner(System.in);
/*
        //variable string que se utilizará para los datos
        String nombre;
        //mostramos un msj por pantalla
        System.out.println("Ingrese su nombre");
        //guardamos en nombre lo que leemos en el ingreso de datos
        nombre = leer.next();
        System.out.println("Hola Mundo! soy " +nombre+ " y estoy programando en Java!");
//---------------------------------------------------------------------------------------------------------------
        Ejercicio de la guía T de definir diferentes variables
         
        int numero;
        boolean ver;
        String nomb2;
        float decimal;
//---------------------------------------------------------------------------------------------------------------
        EJ 1 - Escribir un programa que pida dos números enteros por teclado y calcule
        la suma de los dos. El programa deberá después mostrar el resultado de la suma
        
      
       
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("El valor de la suma es: " + suma);
        
//--------------------------------------------------------------------------------------------------------------
        //EJ 2 - Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla
        
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        System.out.println("Hola " + nombre + " estás programando en Java");
        
        
//---------------------------------------------------------------------------------------------------------------
        //EJ 3 - Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
        //Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        String frase;
        System.out.println("Ingresa una frase");
        frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
//--------------------------------------------------------------------------------------------------------------

        //EJ 4 - Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
        //La fórmula correspondiente es: F = 32 + (9 * C / 5)
    
        System.out.println("Ingrese la temperatura en C");
        float C = leer.nextFloat();
        float F = 32 + (9 * C / 5);
        System.out.println(F);
    */
//----------------------------------------------------------------------------------------------------------------
        //EJ 5 - Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
        //el triple y la raíz cuadrada de ese número.
        //Nota: investigar la función Math.sqrt().
        
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        System.out.println(doble);
        System.out.println(triple);
        System.out.println(Math.sqrt(num));
        
    
    }
    
}

