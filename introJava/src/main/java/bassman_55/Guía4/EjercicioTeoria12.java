package bassman_55.Guía4;

import java.util.Scanner;

public class EjercicioTeoria12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese dos números");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        
        multiplo(num1,num2);
    }
    public static void multiplo(int num1, int num2){
        
        if (num1 % num2 == 0){
            System.out.println("El primer número es múltiplo del segundo");
        }else{
            System.out.println("El primer número no es múltiplo del segundo");
        }
        
    }
    
}
