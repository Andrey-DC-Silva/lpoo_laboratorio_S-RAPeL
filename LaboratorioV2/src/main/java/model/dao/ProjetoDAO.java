package model.dao;

import java.util.List;
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

}
