package com.libreriajpa.controller;

import java.util.List;
import com.libreriajpa.entities.Autor;

/**
 *
 * @author LUCAS MOLINA
 */
public class AutorJpaController extends JpaController {

    public void crearAutor(Autor autor) throws Exception {
        super.crear(autor);
    }

    public void editarAutor(Autor autor) throws Exception {
        super.actualizar(autor);
    }

    public Autor buscarAutor(String nombre) throws Exception {
        List<Autor> autores = super.consulta(Autor.class, "nombre", "'" + nombre + "'");
        if (!autores.isEmpty()) {
            return autores.get(0);
        }
        return null;
    }

    public void switchAlta(Autor autor, Boolean alta) throws Exception {
        autor.setAlta(alta);
        super.actualizar(autor);
    }

}
