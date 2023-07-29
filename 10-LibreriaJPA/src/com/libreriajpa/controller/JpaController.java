package com.libreriajpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 *
 * @author LUCAS MOLINA
 * @param <T>
 */
public abstract class JpaController<T> {

    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    protected EntityManager em = emf.createEntityManager();

    private void conectar() throws Exception {
        try {
            if (!em.isOpen()) {
                em = emf.createEntityManager();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("EXCEPCION AL INTENTAR CONECTAR");
        }
    }

    private void desconectar() throws Exception {
        try {
            if (em.isOpen()) {
                em.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("EXCEPCION AL INTENTAR DESCONECTAR");
        }
    }

    protected void crear(T entity) throws Exception {
        conectar();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            throw new Exception("EXCEPCION AL INTENTAR PERSISTIR ENTIDAD");
        } finally {
            desconectar();
        }
    }

    protected void actualizar(T entity) throws Exception {
        conectar();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            throw new Exception("EXCEPCION AL INTENTAR ACTUALIZAR ENTIDAD");
        } finally {
            desconectar();
        }
    }

    protected List<T> listarTabla(Class<T> entityClass) throws Exception {
        conectar();
        List<T> entities = null;
        try {
            String jpql = String.format("SELECT e FROM %s e WHERE e", entityClass.getSimpleName());
            entities = em.createQuery(jpql, entityClass).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("EXCEPCION AL CONSULTAR ENTIDAD");
        }
        return entities;
    }

    protected T buscarPorId(Class<T> entityClass, long id) throws Exception {
        conectar();
        T entity = null;
        try {
            entity = em.find(entityClass, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("EXCEPCION AL CONSULTAR LLAVE PRIMARIA");
        }
        return entity;
    }

     protected List<T> consulta(Class<T> entityClass, String atributo, String valor) throws Exception {
        conectar();
        List<T> entities = null;
        try {
            String jpql = "SELECT e FROM " + entityClass.getSimpleName() + " e WHERE e." + atributo + " = " + valor;
            TypedQuery<T> query = em.createQuery(jpql, entityClass);
            entities = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("EXCEPCION AL CONSULTAR ATRIBUTO");
        }
        return entities;
    }

    protected void eliminar(Class<T> entityClass, long id) throws Exception {
        conectar();
        EntityTransaction transaction = em.getTransaction();
        try {
            conectar();
            transaction.begin();
            T entity = em.find(entityClass, id);
            em.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            throw new Exception("EXCEPCION AL INTENTAR ELIMINAR ENTIDAD");
        } finally {
            desconectar();
        }
    }
}
