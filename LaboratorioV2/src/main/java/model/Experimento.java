package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.*;

@Entity
@Table(name = "experimentos")
public class Experimento implements Mostrar, Serializable {

    @Transient
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "exp_id")
    private int id;

    @Column(name = "exp_titulo")
    private String titulo;

    @Column(name = "exp_descricao")
    private String descricao;

    @Column(name = "exp_data")
    private LocalDate dtRealizacao;

    @ManyToOne
    @JoinColumn(name = "exp_responsavel")
    private Pesquisador responsavel;

    @ManyToOne
    @JoinColumn(name = "proj_id")
    private Projeto projeto;

    public Experimento() {
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public int getID() {
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

    public LocalDate getDtRealizacao() {
        return dtRealizacao;
    }

    public void setDtRealizacao(LocalDate data) {
        this.dtRealizacao = data;
    }

    public Pesquisador getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pesquisador responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public String mostrarDados() {

        String texto = "";

        texto += "\n---- Dados do Experimento ----";
        texto += "\nID: " + id;
        texto += "\nTítulo: " + titulo;
        texto += "\nDescrição: " + descricao;
        texto += "\nData de Realização: " + dtRealizacao.format(formato);
        texto += "\nResponsável - ID: " + responsavel.getId() + " / " + (responsavel != null ? responsavel.getNome() : "Não definido");

        return texto;
    }

}
