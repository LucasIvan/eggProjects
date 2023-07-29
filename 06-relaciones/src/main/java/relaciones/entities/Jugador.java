package relaciones.entities;

public class Jugador {
    private String nombre;
    private String apellido;
    private String posición;
    private int numero;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posición, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posición = posición;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPosición() {
        return posición;
    }

    public int getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", posici\u00f3n=" + posición + ", numero=" + numero + '}';
    }
    
    
}
