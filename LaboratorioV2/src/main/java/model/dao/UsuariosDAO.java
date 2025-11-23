package model.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.*;
import model.Usuarios;

public class UsuariosDAO extends PersistenciaJPA {

    public List<Usuarios> listaUsuarios() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Usuarios> query
                    = em.createQuery("SELECT us FROM Usuarios u", Usuarios.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Optional<Usuarios> buscarPorId(int id) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Usuarios> query = em.createQuery(
                    "SELECT u FROM Usuarios u WHERE u.id = :id", Usuarios.class);
            query.setParameter("id", id);
            return query.getResultList().stream().findFirst();
        } finally {
            em.close();
        }
    }

    public Usuarios buscaPorIdSenha(int id, String hashSenha) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Usuarios> query = em.createQuery(
                    "SELECT u FROM Usuarios u WHERE u.id = :id AND u.senha = :senha", Usuarios.class);
            query.setParameter("id", id);
            query.setParameter("senha", hashSenha);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
