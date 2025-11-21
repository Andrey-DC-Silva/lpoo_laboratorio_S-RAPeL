package model;

import javax.persistence.*;

@Entity
@Table(name = "pesquisadores")
public class Pesquisador extends Pessoa {

    @Column(name = "pesq_area")
    private String areaAtuacao;

    @Column(name = "pesq_afiliacao")
    private String afiliacao;

    @ManyToOne
    @JoinColumn(name = "proj_id")
    private Projeto projeto;

    public Pesquisador() {
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacoes(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados do Pesquisador ----");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDtNasc().format(formato));
        System.out.println("Área de Atuação: " + getAreaAtuacao());
        System.out.println("Afiliação: " + getAfiliacao());
        System.out.println("===============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo do Pesquisador ---");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Área de Atuação: " + getAreaAtuacao());
        System.out.println("===============================");
    }
}
