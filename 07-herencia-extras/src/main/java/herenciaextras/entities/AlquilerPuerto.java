package herenciaextras.entities;

import java.util.ArrayList;
import java.util.Date;

public class AlquilerPuerto {
    private String nombre;
    private Integer dni;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private String amarre;
    private Barco barco;

    public AlquilerPuerto() {
    }

    public AlquilerPuerto(String nombre, Integer dni, Date fechaAlquiler, Date fechaDevolucion, String amarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.amarre = amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public String getAmarre() {
        return amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setAmarre(String amarre) {
        this.amarre = amarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "AlquilerPuerto{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", amarre=" + amarre + ", barcos=" + barco + '}';
    }
    
    
}
