package claseUtilidades.services;

import claseUtilidades.entities.Persona;
import java.util.Date;

public class PersonaService {
    
    public Persona crearPersona(String nombre, Date fecha){
        return new Persona(nombre, fecha);
    }
    
    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        int diaNacimiento = persona.getFechaNacimiento().getDate();
        int mesNacimiento = persona.getFechaNacimiento().getMonth();
        int anhoNacimiento = persona.getFechaNacimiento().getYear();
        int edad = fechaActual.getYear() - anhoNacimiento;

        if (mesNacimiento > fechaActual.getMonth() || (mesNacimiento == fechaActual.getMonth() && diaNacimiento > fechaActual.getDate())) {
            edad--;
        }
        return edad;
    }
   
    public boolean menorQue(Persona persona, int edad){
        return calcularEdad(persona) < edad;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha nacimiento: " + persona.getFechaNacimiento().getDate() + "/" + persona.getFechaNacimiento().getMonth() + "/" + persona.getFechaNacimiento().getYear() );
    }

}
