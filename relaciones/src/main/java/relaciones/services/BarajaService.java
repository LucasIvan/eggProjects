package relaciones.services;

import java.util.Collections;
import java.util.Scanner;
import relaciones.entities.Baraja;
import relaciones.entities.Carta;

public class BarajaService {

    public Baraja crearBaraja() {
        Baraja baraja = new Baraja();
        for (String palo : baraja.getPalos()) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    Carta carta = new Carta(palo, i);
                    baraja.getCartas().add(carta);
                }
            }
        }
        return baraja;
    }

    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getCartas());
    }

    public Carta siguienteCarta(Baraja baraja) {
        if (baraja.getCartas().isEmpty()) {
            System.out.println("No hay más cartas");
            return null;
        } 
        Carta next = baraja.getCartas().get(0);
        baraja.getMonton().add(next);
        baraja.getCartas().remove(next);
        return next;
    }
    
    public int cartasDisponibles(Baraja baraja){
        return baraja.getCartas().size();
    }
    
    public void darCartas(Baraja baraja){
        Scanner read = new Scanner(System.in); 
        System.out.println("Cuantas cartas desea");
        int cantidad = read.nextInt();
        
        if (baraja.getCartas().size()>= cantidad) {
            for (int i = 0; i < cantidad; i++) {
                siguienteCarta(baraja);
            }
        }else{
            System.out.println("No hay más cartas CTM");
        }
    }
    
    public void cartasMonton(Baraja baraja){
        if (baraja.getMonton().isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        }else{
           System.out.println(baraja.getMonton()); 
        }
    }
    
    public void mostrarBaraja(Baraja baraja){
        System.out.println(baraja.getCartas());
    }
}
