package relaciones.entities;

import java.util.ArrayList;

public class Equipo {
    private ArrayList <Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList();
        this.jugadores.add(new Jugador("matias","juarez","central",5));
        this.jugadores.add(new Jugador("andres","polombo","arquero",1));
        this.jugadores.add(new Jugador("nicolás","torres","delantero",11));
        this.jugadores.add(new Jugador("javier","mendizuk","lateral",4));
    }

    public Equipo(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }
    
    
}
