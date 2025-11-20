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

}
