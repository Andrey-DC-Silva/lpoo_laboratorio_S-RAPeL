package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Experimento;
import model.Pesquisador;
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

    public Projeto buscarProjetoCompleto(int id) {
        EntityManager em = getEntityManager();
        try {
            Projeto proj = em.find(Projeto.class, id);
            if (proj != null) {
                proj.getPesquisadores().size();
                proj.getExperimentos().size();
            }
            return proj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void adicionarPesquisador(Projeto projeto, Pesquisador pesquisador) throws Exception {
        if (!projeto.getPesquisadores().contains(pesquisador)) {
            projeto.getPesquisadores().add(pesquisador);
            persist(projeto);
        } else {
            throw new Exception("Pesquisador já está no projeto!");
        }
    }

    public void removerPesquisador(Projeto projeto, Pesquisador pesquisador) throws Exception {
        if (projeto.getPesquisadores().remove(pesquisador)) {
            pesquisador.setProjeto(null);
            persist(projeto);
        } else {
            throw new Exception("Pesquisador não pertence a este projeto!");
        }
    }

    public void adicionarExperimento(Projeto projeto, Experimento experimento) throws Exception {
        if (!projeto.getExperimentos().contains(experimento)) {
            projeto.getExperimentos().add(experimento);
            experimento.setProjeto(projeto);
            persist(experimento);
        } else {
            throw new Exception("Experimento já está no projeto!");
        }
    }

    public void removerExperimento(Projeto projeto, Experimento experimento) throws Exception {
        if (projeto.getExperimentos().remove(experimento)) {
            experimento.setProjeto(null);
            persist(experimento);
        } else {
            throw new Exception("Experimento não pertence a este projeto!");
        }
    }

}
