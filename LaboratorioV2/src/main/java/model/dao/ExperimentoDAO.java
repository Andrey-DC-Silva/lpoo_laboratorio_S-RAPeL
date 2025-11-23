package model.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Experimento;
import model.Projeto;

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

    public Optional<Experimento> buscarPorId(int id) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Experimento> query = em.createQuery(
                    "SELECT ex FROM Experimento ex WHERE ex.id = :id", Experimento.class);
            query.setParameter("id", id);
            return query.getResultList().stream().findFirst();
        } finally {
            em.close();
        }
    }

}
