package claseServicio.services;

import claseServicio.entities.Persona;
import java.util.Scanner;

public class PersonaServicio {
    
    static Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public boolean esMayorDeEdad(Persona persona){
        return (persona.getEdad()>= 18);
    }
    
    public Persona crearPersona(){
        boolean verif = false;
        
        System.out.println("Ingrese el nombre");
        String nombre = (read.next());
        
        System.out.println("Ingrese la edad");
        int edad = (read.nextInt());
        
        String sexo;
        do{
           System.out.println("Ingrese el sexo");
           sexo = (read.next());
        if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O") ) {
            verif = true;
        }else{
            System.out.println("Ingrese una opción válida");
        } 
        }while(!verif);
        
        System.out.println("Ingrese el peso");
        double peso = (read.nextDouble());
        
        System.out.println("Ingrese la altura");
        double altura = (read.nextDouble());
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }


    public int calcularIMC(Persona persona){
        double IMC = persona.getPeso()/(Math.pow(persona.getAltura(), 2));
        
        if (IMC < 20){
            return -1;
        } else if (IMC >= 20 && IMC <= 25){
            return 0;
        } else{
            return 1;
        } 
        
    }
    
    public void informe(Persona persona){
        
        if (calcularIMC(persona) == 0){
            System.out.println("La persona se encuentra en su peso ideal");
            System.out.println("Es mayor de edad? = "+ esMayorDeEdad(persona));
        }else if (calcularIMC(persona) == -1){
            System.out.println("La persona se encuentra por debajo de su peso ideal");
            System.out.println("Es mayor de edad? = "+ esMayorDeEdad(persona));
        }else if (calcularIMC(persona) == 1){
            System.out.println("La persona se encuentra por ensima de su peso ideal");
            System.out.println("Es mayor de edad = "+ esMayorDeEdad(persona));
        }
    }
    
    

}
