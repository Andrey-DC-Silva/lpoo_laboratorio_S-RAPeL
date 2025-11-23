package model.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Projeto;

public class ProjetoDAO extends PersistenciaJPA {

    public List<Projeto> listaProjetos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Projeto> query
                    = em.createQuery("SELECT p FROM Projeto p", Projeto.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Optional<Projeto> buscarPorId(int id) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Projeto> query = em.createQuery(
                    "SELECT p FROM Projeto p WHERE p.id = :id", Projeto.class);
            query.setParameter("id", id);
            return query.getResultList().stream().findFirst();
        } finally {
            em.close();
        }
    }

}
