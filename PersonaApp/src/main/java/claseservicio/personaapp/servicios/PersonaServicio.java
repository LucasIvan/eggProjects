package claseservicio.personaapp.servicios;

import claseservicio.personaapp.entities.Persona;
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
        double peso = persona.getPeso();
        double altura = persona.getAltura();
        
        double IMC = peso/(Math.pow(altura, 2));
        
        if (IMC < 20){
            return -1;
        } else if (IMC >= 20 && IMC <= 25){
            return 0;
        } else if (IMC > 25){
            return 1;
        } else {
            System.out.println("A ocurrido un error");
        }
        return 0;
    }
}
