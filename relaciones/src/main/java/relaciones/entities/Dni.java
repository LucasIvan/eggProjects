package relaciones.entities;

public class Dni {
    private char serie;
    private long numero;

    public Dni() {
    }

    public Dni(char serie, long numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public long getNumero() {
        return numero;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
    
}
