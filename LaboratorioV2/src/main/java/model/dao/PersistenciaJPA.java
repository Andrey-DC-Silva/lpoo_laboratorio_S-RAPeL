package model.dao;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenciaJPA implements InterfaceBD {

    EntityManager entity;
    EntityManagerFactory factory;

    public PersistenciaJPA() {
        factory = Persistence.createEntityManagerFactory("pu_laboratorio");
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean conexaoAberta() {

        return entity.isOpen();
    }

    @Override
    public void fecharConexao() {
        entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        EntityManager em = getEntityManager();
        return em.find(c, id);
    }

//    @Override
//    public void persist(Object o) throws Exception {
//        entity = getEntityManager();
//        try {
//            entity.getTransaction().begin();
//            if (entity.contains(o)) {
//            } else {
//                entity.merge(o);
//            }
//            entity.getTransaction().commit();
//        } catch (Exception e) {
//            if (entity.getTransaction().isActive()) {
//                entity.getTransaction().rollback();
//            }
//            Logger.getLogger(PersistenciaJPA.class.getName())
//                    .log(Level.SEVERE, "Erro ao persistir a entidade: " + o.getClass().getSimpleName(), e);
//            throw e;
//        }
//    }

    @Override
    public void persist(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            entity.merge(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
            Logger.getLogger(PersistenciaJPA.class.getName())
                    .log(Level.SEVERE, "Erro ao salvar ou atualizar a entidade: " + o.getClass().getSimpleName(), e);
            throw e;
        }
    }

    @Override
    public void remover(Object o) throws Exception {
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            if (!entity.contains(o)) {
                o = entity.merge(o);
            }
            entity.remove(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            System.err.println("Erro ao remover entidade: " + o.getClass().getSimpleName());
            e.printStackTrace();
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }

    public EntityManager getEntityManager() {
        if (entity == null || !entity.isOpen()) {
            entity = factory.createEntityManager();
        }
        return entity;
    }

}
