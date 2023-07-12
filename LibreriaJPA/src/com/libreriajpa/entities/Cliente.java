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
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "secuencia", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuecia")
    private Long id;
    private Long documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private Boolean alta;

    public Cliente() {
    }

    public Cliente(Long documento, String nombre, String apellido, String telefono) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.alta = true;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Long getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
                + "\n\tDocumento: \t\t" + documento
                + "\n\tNombre:  \t" + nombre
                + "\n\tApellido:   \t" + apellido
                + "\n\tTelefono:   \t" + telefono
                + "\n\tAlta:    \t" + alta
                + "\n\n========================================\t\t";
    }
}
