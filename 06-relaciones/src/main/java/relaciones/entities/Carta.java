package relaciones.entities;

public class Carta {
    private String palo;
    private Integer numero;

    public Carta() {
    }

    public Carta(String palo, Integer numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + '}';
    } 
}
