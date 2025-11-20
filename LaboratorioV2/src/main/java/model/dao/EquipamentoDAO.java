package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Equipamento;

public class EquipamentoDAO extends PersistenciaJPA {

    public List<Equipamento> listaEquipamentos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Equipamento> query
                    = em.createQuery("SELECT e FROM Equipamento e", Equipamento.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
