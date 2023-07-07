package libreriajpa.persistence;

import java.util.List;
import libreriajpa.entities.Libro;

/**
 *
 * @author lucas
 */
public class LibroDAO extends DAO {

    public boolean consultarLibros(String atributo, String valor) {
        List<Libro> libros = super.consulta(Libro.class, atributo, valor);
        if (!libros.isEmpty()) {
            for (Libro libro : libros) {
                if (libro.getAlta()) {
                    System.out.println(libro);
                }
            }
            return true;
        }
        return false;
    }
}
