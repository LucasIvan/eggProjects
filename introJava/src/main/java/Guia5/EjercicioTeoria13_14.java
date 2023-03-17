package Guia5;

import java.util.Scanner;

/**
 * Crea un vector llamado ‘equipo’ cuya dimensión sea la cantidad de compañeros 
 * de equipo y define su tipo de dato de tal manera que te permita alojar sus 
 * nombres más adelante.
 * @author bassman_55
 */
public class EjercicioTeoria13_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String[] equipo = new String[8];
        
        for (int i = 0; i < 8; i++) { 
            equipo[i] = read.nextLine();
        }
    }
}
