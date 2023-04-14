package claseUtilidades.services;

import java.util.Arrays;

public class ArreglosService {
    
    public double[] inicializarA(double a[]){
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random()*10;
        }
        return a;
    }
    
    public void mostrar(double a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]\t");
        }
        System.out.println("\n");
    }
    
    public void ordenar(double a[]){
        Arrays.sort(a);
    }
    
    public double[] inicializarB(double a[], double b[]){
        for (int i = 0; i < 10; i++) {
            b[i] = a[i];
        }
        Arrays.fill(b, 10, 20,0.5);
        
        return b;
    }
}
