package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.model.entities.Producto;

/**
 *
 * @author lucas
 */
public final class ProductoDAO extends DAO {

    public void ingresarProducto(Producto producto){
        try {
            if (producto == null) {
                throw new Exception("No se especifico un producto");
            }

            String sql = String.format("INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('%s', '%s', %d);",
                    producto.getNombre(), producto.getPrecio(), producto.getCodigoFabricante());
            insertarModificarEliminar(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listarProductos(String sql) throws Exception {
        try {
            consultarBase(sql);
            Producto producto;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            return productos;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
}
