package com.libreriajpa.controller;

import java.util.List;
import com.libreriajpa.entities.Editorial;

/**
 *
 * @author LUCAS MOLINA
 */
public class EditorialJpaController extends JpaController {

    public void crearEditorial(Editorial editorial) throws Exception {
        super.crear(editorial);
    }

    public void editarEditorial(Editorial editorial) throws Exception {
        super.actualizar(editorial);
    }

    public Editorial buscarEditorial(String nombre) throws Exception {
        List<Editorial> editoriales = super.consulta(Editorial.class, "nombre", "'" + nombre + "'");
        if (!editoriales.isEmpty()) {
            return editoriales.get(0);
        }
        return null;
    }

    public void switchAlta(Editorial editorial, Boolean alta) throws Exception {
        editorial.setAlta(alta);
        super.actualizar(editorial);
    }
}
