package libreriajpa.persistence;

import java.util.Arrays;
import java.util.List;
import libreriajpa.entities.Libro;

/**
 *
 * @author LUCAS MOLINA
 */
public class LibroDAO extends DAO {
    
    public void crearLibro(Libro libro){
        super.crear(libro);
    }
    
    public void editarLibro(Libro libro){
        super.actualizar(libro);
    }
    
    public List consultarLibros(String atributo, String valor) {
        List<Libro> libros = super.consulta(Libro.class, atributo, valor);
        List retorno;
        if (!libros.isEmpty()) {
            retorno = Arrays.asList(Boolean.TRUE, libros);
            return retorno;
        }
        retorno = Arrays.asList(Boolean.FALSE, libros);
        return retorno;
    }
    
    public void switchAlta(Libro libro, Boolean alta){
        libro.setAlta(alta);
        super.actualizar(libro);
    }
}
