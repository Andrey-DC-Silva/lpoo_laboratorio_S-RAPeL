package model;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;

    @Column(nullable = false)
    private String senha;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
