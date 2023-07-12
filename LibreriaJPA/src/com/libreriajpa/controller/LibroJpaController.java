package com.libreriajpa.controller;

import java.util.Arrays;
import java.util.List;
import com.libreriajpa.entities.Libro;

/**
 *
 * @author LUCAS MOLINA
 */
public class LibroJpaController extends JpaController {
    
    public void crearLibro(Libro libro) throws Exception{
        super.crear(libro);
    }
    
    public void editarLibro(Libro libro) throws Exception{
        super.actualizar(libro);
    }
    
    public List consultarLibros(String atributo, String valor) throws Exception {
        List<Libro> libros = super.consulta(Libro.class, atributo, valor);
        List retorno;
        if (!libros.isEmpty()) {
            retorno = Arrays.asList(Boolean.TRUE, libros);
            return retorno;
        }
        retorno = Arrays.asList(Boolean.FALSE, libros);
        return retorno;
    }
    
    public void switchAlta(Libro libro, Boolean alta) throws Exception{
        libro.setAlta(alta);
        super.actualizar(libro);
    }
}
