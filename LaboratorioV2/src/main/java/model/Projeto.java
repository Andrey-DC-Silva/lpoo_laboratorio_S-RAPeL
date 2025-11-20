package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "projetos")
public class Projeto implements Mostrar, Serializable {

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "proj_id")
    private int id;

    @Column(name = "proj_titulo")
    private String titulo;

    @Column(name = "proj_descricao")
    private String descricao;

    @Column(name = "proj_dtInicio")
    private LocalDate dtInicio;

    @Column(name = "proj_dtFim")
    private LocalDate dtFim;

    @Column(name = "proj_status")
    private String status;

    @OneToMany(mappedBy = "projeto")
    private List<Pesquisador> pesquisadores = new ArrayList<>();

    @OneToMany(mappedBy = "projeto")
    private List<Experimento> experimentos = new ArrayList<>();

    public Projeto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public void setPesquisadores(List<Pesquisador> pesquisadores) {
        this.pesquisadores = pesquisadores;
    }

    public void adicionarPesquisador(Pesquisador p) {
        if (p != null && !pesquisadores.contains(p)) {
            pesquisadores.add(p);
            p.setProjeto(this);
        }
    }

    public List<Experimento> getExperimentos() {
        return experimentos;
    }

    public void setExperimentos(List<Experimento> experimentos) {
        this.experimentos = experimentos;
    }

    public void adicionarExperimento(Experimento experimento) {
        if (experimento != null && !this.experimentos.contains(experimento)) {
            this.experimentos.add(experimento);
            experimento.setProjeto(this);
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados do Projeto ----");
        System.out.println("Titulo: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Início: " + dtInicio.format(formato));
        System.out.println("Fim: " + dtFim.format(formato));
        System.out.println("Status: " + status);

        System.out.println("Pesquisadores envolvidos:");
        for (Pesquisador p : pesquisadores) {
            System.out.println(" - ID:" + p.getId() + ", Nome: " + p.getNome());
        }

        System.out.println("Experimentos relacionados:");
        if (experimentos.isEmpty()) {
            System.out.println(" Nenhum experimento associado.");
        } else {
            for (Experimento e : experimentos) {
                System.out.println(" - ID: " + e.getID()
                        + ", Título: " + e.getTitulo() + ", Data: " + e.getDtRealizacao().format(formato));
            }
        }
        System.out.println("===============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Resumo do Projeto ----");
        System.out.println("Título: " + titulo);
        System.out.println("Status: " + status);
        System.out.print(" - Início: " + dtInicio.format(formato));
        if (dtFim != null) {
            System.out.println(" - Fim: " + dtFim.format(formato));
        }
        System.out.println("===============================");
    }

}
