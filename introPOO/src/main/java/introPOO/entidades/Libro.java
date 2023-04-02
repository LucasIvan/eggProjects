package introPOO.entidades;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Libro {
    
    static Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    private String isbn;
    private String titulo;
    private String autor;
    private int numPags;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int numPags) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    }

    public void ingresarLibro() {
        System.out.println("Ingrese los datos del libro");
        System.out.print("ISBN: ");
        isbn  = read.nextLine();
        System.out.print("Título: ");
        titulo  = read.nextLine();
        System.out.print("Autor: ");
        autor  = read.nextLine();
        System.out.print("paginas: ");
        numPags  = read.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPags=" + numPags + '}';
    }

 

}
