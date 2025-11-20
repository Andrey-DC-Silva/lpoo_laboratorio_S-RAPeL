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

}
