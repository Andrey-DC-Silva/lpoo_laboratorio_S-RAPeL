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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuarios usuario;

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

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
        if (usuario != null) {
            usuario.setPesquisador(this);
        }
    }

    @Override
    public String mostrarDados() {

        String texto = "";

        texto += "---- Dados do Pesquisador ----";
        texto += "ID: " + getId();
        texto += "Nome: " + getNome();
        texto += "CPF: " + getCpf();
        texto += "Data de Nascimento: " + getDtNasc().format(formato);
        texto += "Área de Atuação: " + getAreaAtuacao();
        texto += "Afiliação: " + getAfiliacao();

        return texto;

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
