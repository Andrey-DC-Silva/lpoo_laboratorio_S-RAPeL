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

    @Override
    public String mostrarDados() {

        String texto = "";

        texto += "---- Dados do Equipamento ----";
        texto += "Modelo: " + modelo;
        texto += "Descrição: " + descricao;
        texto += "Estado: " + estado;

        return texto;

    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo do Equipamento ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Estado: " + estado);
        System.out.println("===============================");
    }

    @Override
    public String toString() {
        return modelo;
    }

}
