package com.libreriajpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author LUCAS MOLINA
 */
@Entity
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "secuencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuecia")
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    @ManyToOne
    private Libro libro;
    @ManyToOne
    private Cliente cliente;
    private Boolean devuelto;

    public Prestamo() {
    }

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Libro libro, Cliente cliente) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.cliente = cliente;
        this.devuelto = false;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return """
               
               ======================================== 
                               DETALLE
               ========================================
               
                       ID: \t\t\t""" + id
                + "\n\tFecha de Prestamo:\t" + fechaPrestamo
                + "\n\tFecha de Devolucion:\t" + fechaDevolucion
                + "\n\tLibro:  \t\t\t" + libro
                + "\n\tCliente:  \t\t\t" + cliente
                + "\n\tDevuelto:  \t\t\t" + devuelto
                + "\n\n========================================\t\t";
    }
}
