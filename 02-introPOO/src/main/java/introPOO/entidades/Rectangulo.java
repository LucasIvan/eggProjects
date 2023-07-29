package introPOO.entidades;

import java.util.Scanner;

public class Rectangulo {
    
    static Scanner read = new Scanner(System.in);
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public void crearRectangulo(){
        System.out.println("Ingrese los valores para el rectángulo");
        System.out.print("Base >> ");
        setBase(read.nextInt());
        System.out.print("Altura >> ");
        setAltura(read.nextInt());
    }
    
    public double superficie(){
        return base*altura;
    }
    
    public double perimetro(){
        return (base+altura)*2;
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1 ||j==0 || j==base-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
