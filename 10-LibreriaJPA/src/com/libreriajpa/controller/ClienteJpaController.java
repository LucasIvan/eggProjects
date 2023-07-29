package com.libreriajpa.controller;

import com.libreriajpa.entities.Cliente;
import java.util.List;

/**
 *
 * @author LUCAS MOLINA
 */
public class ClienteJpaController extends JpaController{
    
    public void crearCliente(Cliente cliente) throws Exception {
        super.crear(cliente);
    }

    public void editarCliente(Cliente cliente) throws Exception {
        super.actualizar(cliente);
    }

    public Cliente buscarCliente(String documento) throws Exception {
        List<Cliente> clientes = super.consulta(Cliente.class, "documento", documento);
        if (!clientes.isEmpty()) {
            return clientes.get(0);
        }
        return null;
    }
    
        public void switchAlta(Cliente cliente, Boolean alta) throws Exception {
        cliente.setAlta(alta);
        super.actualizar(cliente);
    }

    
}
