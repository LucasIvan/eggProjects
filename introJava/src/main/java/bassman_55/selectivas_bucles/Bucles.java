package bassman_55.selectivas_bucles;

import java.util.Scanner;

public class Bucles {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        /*EJ 5 - Escriba un programa en el cual se ingrese un valor límite positivo, y a
        continuación solicite números al usuario hasta que la suma de los
        números introducidos supere el límite inicial.*/
        /*
        System.out.println("Ingrse un número límite positivo");
        int numLimite = leer.nextInt();
        int suma = 0;
        do{
            System.out.println("Ingrse un número");
            int num = leer.nextInt();
            
            suma = suma + num;
            
        }while(suma<numLimite);
        */
        //------------------------------------------------------------------------------------------
        
        /*EJ 6 - Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla
        el siguiente menú: El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y
        luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
        se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa.*/
        
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
                    if (sel.equals("Y") || sel.equals("y")){
                        selec = true;
                    }
                default:
                    System.out.print("Saliendo del sistema");
            }
        }while(!selec);
        
        
        
        
        
        
        
        
    }
}
