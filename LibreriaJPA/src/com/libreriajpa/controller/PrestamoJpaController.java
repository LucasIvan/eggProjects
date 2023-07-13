package com.libreriajpa.controller;

import com.libreriajpa.entities.Prestamo;
import java.util.List;

/**
 *
 * @author LUCAS MOLINA
 */
public class PrestamoJpaController extends JpaController{
    public void crearPrestamo(Prestamo prestamo) throws Exception{
        super.crear(prestamo);
    }
    
    public void editarPrestamo(Prestamo prestamo) throws Exception{
        super.actualizar(prestamo);
    }
    
    public List<Prestamo> consultarPrestamosCliente(String documento) throws Exception {
        List<Prestamo> prestamos = super.consulta(Prestamo.class, "cliente.getDocumento", documento);
        return prestamos;
    }
    
    public void devolucion(Prestamo prestamo) throws Exception{
        prestamo.setDevuelto(Boolean.TRUE);
        super.actualizar(prestamo);
    }
}
