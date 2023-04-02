package introPOO.entidades;

import java.util.Scanner;


public class Juego {
    
    static Scanner read = new Scanner(System.in);
    
    private int num;
    private int num2;
    private int intentos;

    public Juego() {
    }
    

    public void iniciarJuego(){
        
        System.out.println("========\nPlayer 1\n========\nIngrese el número a adivinar");
        num = read.nextInt();
        
        intentos = 0;
        System.out.print("========\nPlayer 2\n========\nAdivina el número >> ");
        while (intentos < 4){
            num2 = read.nextInt();
            intentos++;
            if (num2 == num) {
                System.out.println("======================================");
                System.out.println("Felicitaciones!!! adivinaste el número");
                System.out.println("======================================");
                System.out.println("Nro de intentos realizados: " + intentos );
                break;
            }
            if (intentos < 4){
                if (num2 > num) {
                System.out.println("Más Bajo!!!");
                } else {
                System.out.println("Más Alto!!!");
                }
                System.out.println("=== " + (4 - intentos) + " intento/s restante/s ===");
            }
            
        }
        
        if (intentos == 4) {
            System.out.println("=============");
            System.out.println("GAME OVER!!!!");
            System.out.println("=============");
        }
        
    }
 
}
