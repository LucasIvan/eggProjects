
package bassman_55.selectivas_bucles;

import java.util.Scanner;

public class EstructuraSelectiva {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //-------------------------------------------------------------------------------------------------------
        
        //Ej 1 - Crear un programa que dado un número determine si es par o impar.
        /*
        System.out.println("Ingrse un número");
        int num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
        */
        //------------------------------------------------------------------------------------------------------
        
        /*EJ 2 - Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
        pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
        Nota: investigar la función equals() en Java*/
        /*
        System.out.println("Ingrse una frase");
        String frase = leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        */
        //-------------------------------------------------------------------------------------------------------
        
        /*EJ 3 - Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
        Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
        Nota: investigar la función Lenght() en Java*/
        /*
        System.out.println("Ingrse una frase");
        String frase = leer.nextLine();
        
        //int largo = frase.length();
        
        if (frase.length() == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        */
        //------------------------------------------------------------------------------------------------------
        
        /*EJ 4 - Escriba un programa que pida una frase o palabra y valide si la primera letra 
        de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje 
        por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
        Nota: investigar la función Substring y equals() de Java*/
        /*
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.nextLine();
        
        if (frase.substring(0,1).equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        */
        
        
        
        
        
        
        
        
        
    }
}
