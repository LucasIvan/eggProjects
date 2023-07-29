package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.model.entities.Fabricante;

/**
 *
 * @author lucas
 */
public final class FabricanteDAO extends DAO {
    
    public void ingresarFabricante(Fabricante fabricante){
        try {
            if (fabricante == null) {
                throw new Exception("No se especifico un producto");
            }

            String sql = String.format("INSERT INTO fabricante (nombre) VALUES ('%s');",
                    fabricante.getNombre());
            insertarModificarEliminar(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            desconectarBase();
        }
    }

    public Collection<Fabricante> listarFabricantes(String sql) throws Exception {
        try {
            consultarBase(sql);
            Fabricante fabricante;
            Collection<Fabricante> productos = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                productos.add(fabricante);
            }
            return productos;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
