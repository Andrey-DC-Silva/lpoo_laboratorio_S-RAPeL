package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Sala;

public class SalaDAO extends PersistenciaJPA{

    public List<Sala> listaSalas() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Sala> query
                    = em.createQuery("SELECT s FROM Sala s", Sala.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
