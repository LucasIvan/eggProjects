package libreriajpa.services;

import java.util.Scanner;
import libreriajpa.entities.Autor;
import libreriajpa.persistence.AutorDAO;

/**
 *
 * @author LUCAS MOLINA
 */
public class AutorService {
    
    private final AutorDAO autorDao = new AutorDAO();
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Autor ingresarAutor(String nombre){
        Autor autorBusqueda = autorDao.buscarAutor(nombre);
        if (autorBusqueda != null) {
            System.out.println("""
                               ========================================
                                      Se vincula Autor existente
                               ========================================
                               """);
            return autorBusqueda;
        }else{
            System.out.println("""
                               ========================================
                                   Se crea nueva instancia de Autor
                               ========================================
                               """);
            Autor autor = new Autor(nombre, true);
            autorDao.crearAutor(autor);
            return autor;
        }
    }
    
    public void consultarAutor(){
        System.out.println("""
                           
                           ========================================
                                      CONSULTAR AUTORES
                           ========================================
                           """);
        System.out.print("NOMBRE >> ");
        String nombre = read.next();
        System.out.println(autorDao.buscarAutor(nombre));
        
    }
}
