package introPOO.entidades;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Operacion {
    
    static Scanner read = new Scanner(System.in);
    
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public int getNumero1() {
        return numero1;
    }
    
    public int getNumero2() {
        return numero2;
    }

    public void crearOperacion(){
        System.out.println("Ingrese dos números");
        
        System.out.print("num1 >> ");
        setNumero1(read.nextInt());
        
        System.out.print("num2 >> ");
        setNumero2(read.nextInt());
    }
    
    public int sumar(){
        return numero1+numero2;
    }
    
    public int restar(){
        return numero1-numero2;
    }
    
    public int multiplicar(){
        if (numero1 != 0 && numero2 != 0){
            return numero1*numero2;
        }else{
            System.out.println("La multiplicación no es válida");
        }
        return 0;
    }
    
    public double dividir(){
        if (numero2 != 0){
            return numero1/numero2;
        }else{
            System.out.println("La división no es válida");
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
}
