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
                    = em.createQuery("SELECT u FROM Usuarios u", Usuarios.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Usuarios buscarPorId(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuarios.class, id);
        } finally {
            em.close();
        }
    }

    public Usuarios buscarPorCpfESenha(String cpf, String senha) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Usuarios> query = em.createQuery(
                    "SELECT u FROM Usuarios u JOIN u.pesquisador p WHERE p.cpf = :cpf AND u.senha = :senha",
                    Usuarios.class
            );
            query.setParameter("cpf", cpf);
            query.setParameter("senha", senha);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }
    
    
}
