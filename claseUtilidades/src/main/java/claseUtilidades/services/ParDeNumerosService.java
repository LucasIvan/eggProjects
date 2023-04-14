package claseUtilidades.services;

import claseUtilidades.entities.ParDeNumeros;

public class ParDeNumerosService {
    
    public ParDeNumeros crearPar(){
        return new ParDeNumeros();
    }
    
    public void mostrarValores(ParDeNumeros par){
        System.out.println(par.getNum1());
        System.out.println(par.getNum2());
    }
    
    public double devolverMayor(ParDeNumeros par){
        if (par.getNum1()>par.getNum2()) {
            return par.getNum1();
        }else{
            return par.getNum2();
        }
    }
    
    public double calcularPotencia(ParDeNumeros par){
        double num1 = Math.round(par.getNum1());
        double num2 = Math.round(par.getNum2());
        
        if (par.getNum1()>par.getNum2()) {
            return Math.pow(num1,num2 );
        }else{
            return Math.pow(num2,num1 );
        }
    }
    
    public double calcularRaiz(ParDeNumeros par){
        double num;
        if (par.getNum1()>par.getNum2()) {
            num = Math.abs(par.getNum2());
            return Math.sqrt(num);
        }else{
            num = Math.abs(par.getNum1());
            return Math.sqrt(num);
        }
    }
}
