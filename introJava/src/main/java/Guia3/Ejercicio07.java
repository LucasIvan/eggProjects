package Guia3;

import java.util.Scanner;

/** EJ 7 - Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo
    de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: 
    tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último
    tiene que ser una O.
    Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” 
    marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el 
    formato se considera incorrecta.
    Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
    incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
    funciones de Java Substring(), Length(), equals().*/

public class Ejercicio07 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        String cadena;
        int cont1 = 0;
        int cont2 = 0;
        
        do{
            System.out.println("Ingrse una cadena de hasta 5 caracteres");
            cadena = leer.nextLine();
            cadena = cadena.toUpperCase();
            if ((cadena.length()<=5)&&(cadena.substring(0, 1)).equals("X")
            &&(cadena.substring(cadena.length()-1,cadena.length())).equals("O") ){
                cont1 += 1;
            }else{
                cont2 += 1;
            }
        }while(!cadena.equals("&&&&&"));
        
        System.out.println("La cantidad de lecturas correctas son: " + cont1);
        System.out.println("La cantidad de lecturas incorrectas son: " + cont2);
    }
    
}
