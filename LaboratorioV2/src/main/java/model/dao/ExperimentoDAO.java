package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Experimento;

public class ExperimentoDAO extends PersistenciaJPA {

    public List<Experimento> listaExperimentos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Experimento> query
                    = em.createQuery("SELECT e FROM Experimento e", Experimento.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Experimento buscarPorId(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Experimento.class, id);
        } finally {
            em.close();
        }
    }

    public List<Experimento> listaPorProjeto(int projetoId) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Experimento> query = em.createQuery(
                    "SELECT e FROM Experimento e WHERE e.projeto.id = :projetoId", Experimento.class);
            query.setParameter("projetoId", projetoId);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}
