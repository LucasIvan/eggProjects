package tienda.model.entities;

/**
 *
 * @author lucas
 */
public class Producto {
    private Integer codigo;
    private String nombre;
    private Double precio;
    private Integer codigoFabricante;

    public Producto() {
    }

    public Producto(String nombre, Double precio, Integer codigoFabricante) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Integer getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCodigoFabricante(Integer codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo = " + codigo + ", nombre = " + nombre + ", precio = " + precio + ", codigoFabricante = " + codigoFabricante + '}';
    }
    
    
}
