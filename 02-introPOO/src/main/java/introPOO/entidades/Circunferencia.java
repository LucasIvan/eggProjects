package introPOO.entidades;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Circunferencia {
    
    private double radio;
    
    static Scanner read = new Scanner(System.in);

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia");
        setRadio(read.nextDouble());
    }
    
    public double area(){
        return Math.PI * Math.pow(radio,2);
    }
    
    public double perimetro(){
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
}
