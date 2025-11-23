package model.dao;

import java.util.List;
import java.util.Optional;
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

    public Optional<Equipamento> buscarPorId(int id) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Equipamento> query = em.createQuery(
                    "SELECT e FROM Equipamento e WHERE e.id = :id", Equipamento.class);
            query.setParameter("id", id);
            return query.getResultList().stream().findFirst();
        } finally {
            em.close();
        }
    }

}
