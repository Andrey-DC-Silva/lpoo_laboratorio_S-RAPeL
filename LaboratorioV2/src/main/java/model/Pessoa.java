package model;

import java.io.Serializable;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.persistence.*;

@MappedSuperclass
public abstract class Pessoa implements Mostrar, Serializable {

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "dtNasc")
    private LocalDate dtNasc;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private Usuarios usuario;

    public Pessoa() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.length() == 11) {
            cpf = cpf.replace(".", "").replace("-", "").trim();
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido");
        }
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(LocalDate dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    
    @Override
    public String toString() {
        return nome;
    }

}
