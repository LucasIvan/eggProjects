

package claseServicio.services;


import claseServicio.entities.Raices;
import java.util.Scanner;

public class RaicesServicio {
    
    static Scanner read = new Scanner(System.in);
    
    public double getDiscriminante(Raices r){
        return (Math.pow(r.getB(), 2)-(4 * r.getA() *r.getC()));
    }
    
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r) > 0;
    }
    
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r) == 0;
    }
    
    public void obtenerRaices(Raices r){
        if (tieneRaices(r)) {
            System.out.println((-r.getB()+Math.sqrt((Math.pow(r.getB(), 2)-(4 * r.getA() *r.getC()))))/(2*r.getA()));
            System.out.println((-r.getB()-Math.sqrt((Math.pow(r.getB(), 2)-(4 * r.getA() *r.getC()))))/(2*r.getA()));
        }
    }
    
    public void obtenerRaiz(Raices r){
        if (tieneRaiz(r)) {
            System.out.println((-r.getB()+Math.sqrt((Math.pow(r.getB(), 2)-(4 * r.getA() *r.getC()))))/(2*r.getA()));
        }
    }
    
    public void calcular(Raices r){
        if (tieneRaices(r)) {
            obtenerRaices(r);
        }else if (tieneRaiz(r)){
            obtenerRaiz(r);
        }else{
            System.out.println("No hay solución");
        }
            
    }
}
