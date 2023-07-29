package com.libreriajpa.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author LUCAS MOLINA
 */
@Entity
public class Editorial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "secuencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="secuecia")
    private Integer id;
    private String nombre;
    private Boolean alta;

    public Editorial() {
    }

    public Editorial(String nombre) {
        this.nombre = nombre;
        this.alta = true;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return """
               
               ======================================== 
                               DETALLE
               ========================================
               
                       ID:   \t""" + id
                + "\n\tNombre: \t" + nombre
                + "\n\tALTA:  \t" + alta
                + "\n\n========================================\t\t";
    }
}
