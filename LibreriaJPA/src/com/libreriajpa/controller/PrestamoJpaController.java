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
    
    public void consultarPrestamosCliente(String documento) throws Exception {
        List<Prestamo> prestamos = super.consulta(Prestamo.class, "cliente.documento", documento.trim());
        prestamos.forEach(prestamo -> System.out.println(prestamo));
    }
    
    public List<Prestamo> buscarPrestamo(String isbn, String documento) throws Exception{
        String jpql = documento+" AND e.libro.isbn = "+isbn;
        List<Prestamo> prestamos = super.consulta(Prestamo.class, "cliente.documento", jpql);
        return prestamos;
    }
    
    public void devolucion(Prestamo prestamo) throws Exception{
        prestamo.setDevuelto(Boolean.TRUE);
        super.actualizar(prestamo);
    }
}
