package libreriajpa.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author lucas
 */
@Entity
public class Libro implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    private String isbn;
    private String titulo;
    private Integer anho;
    private Integer ejemplares;
    private Integer ejemplaresPrestados;
    private Integer ejemplaresRestantes;
    private Boolean alta;
    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String isbn, String titulo, Integer anho, Integer ejemplares, Boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anho = anho;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = 0;
        this.ejemplaresRestantes = ejemplares;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAnho() {
        return anho;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnho(Integer anho) {
        this.anho = anho;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return """
               
               ======================================== 
                               DETALLE
               ========================================
               
                       ISBN:   \t""" + isbn
                + "\n\tALTA: \t\t" + alta
                + "\n\tTitulo: \t" + titulo 
                + "\n\tAnho:   \t" + anho 
                + "\n\tAutor:   \t" + autor.getNombre()
                + "\n\tEditorial:  \t" + editorial.getNombre()
                + "\n\tEjemplares:  \t" + ejemplares
                + "\n\tEj Prest:  \t" + ejemplaresPrestados
                + "\n\tEj Disp:  \t" + ejemplaresRestantes
                + "\n\n========================================\t\t";
    }
}
