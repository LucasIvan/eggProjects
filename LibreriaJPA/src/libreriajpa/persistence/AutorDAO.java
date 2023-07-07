package libreriajpa.persistence;

import java.util.List;
import libreriajpa.entities.Autor;

/**
 *
 * @author LUCAS MOLINA
 */
public class AutorDAO extends DAO {
    
    public void crearAutor(Autor autor){
        super.crear(autor);
    }
    
    public Autor buscarAutor(String nombre) {
        List<Autor> autores = super.consulta(Autor.class, "nombre", "'"+nombre+"'");
        if (!autores.isEmpty()) {
            return autores.get(0);
        } else {
            System.out.println("""
                               ========================================
                                  No hay coincidencias de Editorial.
                               """);
            return null;
        }
    }

}
