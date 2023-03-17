
package Guia3;

import java.util.Scanner;

/** EJ 6 - Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla
    el siguiente menú: El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y
    luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
    Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
    se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa.*/

public class Ejercicio06 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrse dos números positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean selec = false;
        
        do{
            System.out.print("\nMENU\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\nElija una opción\n");
            int opc = leer.nextInt();
            
            switch(opc){
                case 1:
                    int suma = num1 + num2;
                    System.out.print(suma);
                    break;
                    
                case 2:
                    int resta = num1 - num2;
                    System.out.print(resta);
                    break;
                    
                case 3:
                    int mult = num1 * num2;
                    System.out.print(mult);
                    break;
                    
                case 4:
                    int div = num1 / num2;
                    System.out.print(div);
                    break;
                    
                case 5:
                    System.out.print("¿Está seguro que desea sair del programa?\nY/N\n");
                    String sel = leer.next();
                    if (sel.equalsIgnoreCase("Y") ){
                        selec = true;
                    }
                default:
                    System.out.print("Saliendo del sistema");
            }
        }while(!selec);
    }
    
}
