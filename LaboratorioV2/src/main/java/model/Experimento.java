package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.*;

@Entity
@Table(name = "experimentos")
public class Experimento implements Mostrar, Serializable {

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "exp_id")
    private int id;

    @Column(name = "exp_titulo")
    private String titulo;

    @Column(name = "exp_descricao")
    private String descricao;

    @Column(name = "exp_data")
    private LocalDate data;

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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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
    public String mostrarDados(){
        
        String texto = ""; 
       
        texto += "---- Dados do Experimento ----";
        texto += "ID: " + id;
        texto += "Título: " + titulo;
        texto += "Descrição: " + descricao;
        texto += "Data de Realização: " + data.format(formato);
        texto += "Responsável - ID: " + responsavel.getId() + " / " + (responsavel != null ? responsavel.getNome() : "Não definido");

        return texto;
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo do Experimento ---");
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Data: " + data.format(formato));
        System.out.println("Responsável - Id:" + responsavel.getId() + " / " + responsavel);
        System.out.println("===============================");
    }

}
