package model.dao;

import java.util.List;
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


    public Pesquisador buscarPorId(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pesquisador.class, id);
        } finally {
            em.close();
        }
    }

    public List<Pesquisador> listaPorProjeto(int projetoId) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Pesquisador> query = em.createQuery(
                    "SELECT p FROM Pesquisador p WHERE p.projeto.id = :projetoId", Pesquisador.class);
            query.setParameter("projetoId", projetoId);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
}
