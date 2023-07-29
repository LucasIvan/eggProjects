package claseServicio.services;

import claseServicio.entities.Fraccion;
import java.util.Scanner;

public class FraccionServicio {

    public void suma(Fraccion a){
        if (a.getDenominador1() == a.getDenominador2()){
            System.out.println("El resultado de la suma es: ");
            System.out.println((a.getNumerador1() + a.getNumerador2()) + "/" + a.getDenominador1());
        } else {
            System.out.println("El resultado de la suma es: ");
             System.out.println((a.getNumerador1() + a.getNumerador2()) + "/" + (a.getDenominador1()* a.getDenominador2() ));
        }
    }

    public void resta(Fraccion a){
        if (a.getDenominador1() == a.getDenominador2()){
            System.out.println("El resultado de la resta es: ");
            System.out.println((a.getNumerador1() - a.getNumerador2()) + "/" + a.getDenominador1());
        } else {
            System.out.println("El resultado de la resta es: ");
            System.out.println((a.getNumerador1() - a.getNumerador2()) + "/" + (a.getDenominador1()* a.getDenominador2() ));
        }
    }

    public void multiplicacion(Fraccion a){
        System.out.println("El resultado de la multiplicación es: ");
        System.out.println((a.getNumerador1() * a.getNumerador2()) + "/" + (a.getDenominador1()*a.getDenominador2()));
    }

    public void division(Fraccion a){
        System.out.println("El resultado de la división es: ");
        System.out.println((a.getNumerador1() * a.getDenominador2()) + "/" + (a.getDenominador1()*a.getNumerador2()));
    }

    public void menu(Fraccion a){
        Scanner read = new Scanner(System.in);
        int opc;
        do { 
            System.out.println("Menu \n 1. Sumar Fracciones \n 2. Restar Fracciones \n 3. Multiplicar Fracciones \n 4. Dividir Fracciones \n 5. Salir");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    suma(a);
                    break;
                case 2:
                    resta(a);
                    break;
                case 3:
                    multiplicacion(a);
                    break;
                case 4:
                    division(a);
                    break;
                case 5:
                    break;
                default:
                    throw new AssertionError("Elija una de las opciones");
            } 
        } while (opc != 5);
        

    }

}
