package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Tecnico;

public class TecnicoDAO extends PersistenciaJPA {

    public List<Tecnico> listaTecnicos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Tecnico> query
                    = em.createQuery("SELECT t FROM Tecnico t", Tecnico.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
