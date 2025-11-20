package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "equipamentos")
public class Equipamento implements Mostrar, Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "equip_id")
    private int id;

    @Column(name = "equip_modelo")
    private String modelo;

    @Column(name = "equip_descricao")
    private String descricao;

    @Column(name = "equip_estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "equip_sala")
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "id_tecnico")
    private Tecnico tecnico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados do Equipamento ----");
        System.out.println("Modelo: " + modelo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Estado: " + estado);
        System.out.println("Sala: " + sala);
        System.out.println("===============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo do Equipamento ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Estado: " + estado);
        System.out.println("Sala: " + sala);
        System.out.println("===============================");
    }
}
