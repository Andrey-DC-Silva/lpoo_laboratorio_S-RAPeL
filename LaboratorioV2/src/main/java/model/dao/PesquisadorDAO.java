package model.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Pesquisador;

public class PesquisadorDAO extends PersistenciaJPA {

    public List<Pesquisador> listaPesquisadores() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Pesquisador> query
                    = em.createQuery("SELECT p FROM Pesquisador p", Pesquisador.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Optional<Pesquisador> buscarPorId(int id) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Pesquisador> query = em.createQuery(
                    "SELECT p FROM Pesquisador p WHERE p.id = :id", Pesquisador.class);
            query.setParameter("id", id);
            return query.getResultList().stream().findFirst();
        } finally {
            em.close();
        }
    }

}
