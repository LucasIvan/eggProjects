package libreriajpa.persistence;

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
public abstract class DAO<T> {

    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    protected EntityManager em = emf.createEntityManager();

    private void conectar() {
        try {
            if (!em.isOpen()) {
                em = emf.createEntityManager();
            }
        } catch (Exception e) {
            System.out.println("EXCEPCION AL INTENTAR CONECTAR");
            System.out.println(e.getMessage());
        }
    }

    private void desconectar() {
        try {
            em.close();
        } catch (Exception e) {
            System.out.println("EXCEPCION AL INTENTAR DESCONECTAR");
            System.out.println(e.getMessage());
        }
    }

    protected void crear(T entity) {
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
            System.out.println("EXCEPCION AL INTENTAR PERSISTIR ENTIDAD");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
    }

    protected void actualizar(T entity) {
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
            System.out.println("EXCEPCION AL INTENTAR ACTUALIZAR ENTIDAD");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
    }

    protected List<T> listarTabla(Class<T> entityClass) {
        conectar();
        List<T> entities = null;
        try {
            entities = em.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass).getResultList();
        } catch (Exception e) {
            System.out.println("EXCEPCION AL CONSULTAR ENTIDAD");
            e.printStackTrace();
        }
        return entities;
    }

    protected T buscarPorId(Class<T> entityClass, long id) {
        conectar();
        T entity = null;
        try {
            entity = em.find(entityClass, id);
        } catch (Exception e) {
            System.out.println("EXCEPCION AL CONSULTAR LLAVE PRIMARIA");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return entity;
    }

    protected List<T> consulta(Class<T> entityClass, String atributo, String valor) {
        conectar();
        List<T> entities = null;
        try {
            String jpql = "SELECT e FROM " + entityClass.getSimpleName() + " e WHERE e." + atributo + " = " + valor;
            TypedQuery<T> query = em.createQuery(jpql, entityClass);
            entities = query.getResultList();
        } catch (Exception e) {
            System.out.println("EXCEPCION AL CONSULTAR ATRIBUTO");
        }
        return entities;
    }

    protected void eliminar(Class<T> entityClass, long id) {
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
            System.out.println("EXCEPCION AL INTENTAR ELIMINAR ENTIDAD");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
    }
}
