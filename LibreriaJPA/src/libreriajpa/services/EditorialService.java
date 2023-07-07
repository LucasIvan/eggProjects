package libreriajpa.services;

import java.util.Scanner;
import libreriajpa.entities.Editorial;
import libreriajpa.persistence.EditorialDAO;

/**
 *
 * @author lucas
 */
public class EditorialService {
    
    private final EditorialDAO editorialDao = new EditorialDAO();
    private final Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Editorial ingresarEditorial(String nombre){
        Editorial editorialBusqueda = editorialDao.buscarEditorial(nombre);
        if (editorialBusqueda != null) {
            System.out.println("""
                               ========================================
                                    Se vincula Editorial existente
                               ========================================
                               """);
            return editorialBusqueda;
        }else{
            System.out.println("""
                               ========================================
                                 Se crea nueva instancia de Editorial
                               ========================================
                               """);
            Editorial editorial = new Editorial(nombre, true);
            editorialDao.crear(editorial);
            return editorial;
        }
    }
    
    public void consultarEditorial(){
        System.out.println("""
                           
                           ========================================
                                     CONSULTAR EDITORIAL
                           ========================================
                           """);
        System.out.print("NOMBRE >> ");
        String nombre = read.next();
        System.out.println(editorialDao.buscarEditorial(nombre));
        
    }
}
