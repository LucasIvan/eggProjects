package relaciones;

import relaciones.entities.Dni;
import relaciones.entities.Equipo;
import relaciones.entities.Jugador;
import relaciones.entities.Persona;

/**
 *
 * @author lucas
 */
public class Relaciones {

    public static void main(String[] args) {
        
        
        //*********************** EJ GUIA TEORICA *************************************
        //----------------- Relacion 1 a 1 -----------------------------
        /*
        Persona p1 = new Persona();
        Dni p1Dni = new Dni('A',25164255);
        
        p1.setNombre("Ignacio");
        p1.setApellido("Zapata");
        p1.setDni(p1Dni);
        
        System.out.println(p1);
        
        System.out.println(p1.getDni().getNumero());
        */
        //---------------- Relación 1 a muchos -------------------------
        /*
        Equipo rojo = new Equipo();
        for (Jugador jugador : rojo.getJugadores()) {
            System.out.println(jugador);
        }
        */
        
    }
}
