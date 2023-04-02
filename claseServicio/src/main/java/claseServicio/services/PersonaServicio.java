package claseServicio.services;

import claseServicio.entities.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    static Scanner read = new Scanner(System.in);
    
    
    public boolean esMayorDeEdad(Persona persona){
        return (persona.getEdad()>= 18);
    }
   
    
    public void crearPersona(Persona persona){
        boolean verif = false;
        
        System.out.println("Ingrese el nombre");
        persona.setNombre(read.nextLine());
        
        System.out.println("Ingrese la edad");
        persona.setEdad(read.nextInt());
        
        do{
           System.out.println("Ingrese el sexo");
           String sexo = (read.nextLine());
        if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O") ) {
            persona.setNombre(sexo);
            verif = true;
        }else{
            System.out.println("Ingrese una opción válida");
        } 
        }while(!verif);
        
        System.out.println("Ingrese el peso");
        persona.setPeso(read.nextDouble());
        
        System.out.println("Ingrese la altura");
        persona.setAltura(read.nextDouble());
        
    }


    public int calcularIMC(){
        
    }
}
