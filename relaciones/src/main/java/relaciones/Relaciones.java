package relaciones;

import relaciones.entities.Baraja;
import relaciones.entities.Dni;
import relaciones.entities.Equipo;
import relaciones.entities.Jugador;
import relaciones.entities.Persona;
import relaciones.services.BarajaService;

/**
 *
 * @author lucas
 */
public class Relaciones {

    public static void main(String[] args) {
        
        
        //**********************************  EJ GUIA TEORICA *************************************
        //---------------------------------- Relacion 1 a 1 -----------------------------
        /*
        Persona p1 = new Persona();
        Dni p1Dni = new Dni('A',25164255);
        
        p1.setNombre("Ignacio");
        p1.setApellido("Zapata");
        p1.setDni(p1Dni);
        
        System.out.println(p1);
        
        System.out.println(p1.getDni().getNumero());
        */
        //---------------------------------- Relación 1 a muchos -------------------------
        /*
        Equipo rojo = new Equipo();
        for (Jugador jugador : rojo.getJugadores()) {
            System.out.println(jugador);
        }
        */
        //********************************** EJ 01 *****************************************
        
        
        //********************************** EJ 03 *****************************************
        BarajaService sv = new BarajaService();
        Baraja baraja = sv.crearBaraja();
        System.out.println(baraja.toString());
        sv.barajar(baraja);
        System.out.println(baraja);
        System.out.println("Cartas Disponibles: " + sv.cartasDisponibles(baraja));
        for (int i = 0; i < 5; i++) {
            System.out.println(sv.siguienteCarta(baraja)); 
        }
        System.out.println("Cartas Disponibles: " + sv.cartasDisponibles(baraja));
        sv.darCartas(baraja);
        System.out.println("Cartas del montón");
        sv.cartasMonton(baraja);
        System.out.println("Cantidad del montón: " + baraja.getMonton().size());
        System.out.println("Cartas Disponibles: " + sv.cartasDisponibles(baraja));
        System.out.println("Cartas que le quedan a la baraja");
        sv.mostrarBaraja(baraja);
    }
}
