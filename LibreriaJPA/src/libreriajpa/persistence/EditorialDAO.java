package libreriajpa.persistence;

import java.util.List;
import libreriajpa.entities.Editorial;

/**
 *
 * @author LUCAS MOLINA
 */
public class EditorialDAO extends DAO {
    
    public void crearEditorial(Editorial editorial){
        super.crear(editorial);
    }
    
    public Editorial buscarEditorial(String nombre) {
        List<Editorial> editoriales = super.consulta(Editorial.class, "nombre", "'"+nombre+"'");
        if (!editoriales.isEmpty()) {
            return editoriales.get(0);
        } else {
            System.out.println("""
                               ========================================
                                  No hay coincidencias de Editorial.
                               """);
            return null;
        }
    }
}
