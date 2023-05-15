package relaciones.entities;

import java.util.ArrayList;

public class Baraja {
    private ArrayList <Carta> cartas = new ArrayList();
    private String[] palos = {"Espada","Basto","Oro","Copa"};
    private ArrayList <Carta> monton = new ArrayList();

    public Baraja() {
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public String[] getPalos() {
        return palos;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void setPalos(String[] palos) {
        this.palos = palos;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + ", palos=" + palos + '}';
    }
}
  