package introPOO.entidades;

import java.util.Scanner;

public class Puntos {
    
    static Scanner read = new Scanner(System.in);
    
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        System.out.println("Ingrese las coordenadas del punto 1");
        System.out.print("x >> ");
        setX1(read.nextDouble());
        System.out.print("y >> ");
        setY1(read.nextDouble());
        System.out.println("Ingrese las coordenadas del punto 2");
        System.out.print("x >> ");
        setX2(read.nextDouble());
        System.out.print("y >> ");
        setY2(read.nextDouble());
    }
    
    public double distancia(){
        return Math.sqrt( (Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)) );
    }
}
