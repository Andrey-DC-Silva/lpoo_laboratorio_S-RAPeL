package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "salas")
public class Sala implements Mostrar, Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "sala_id")
    private int id;

    @Column(name = "sala_tipo")
    private String tipo;

    @Column(name = "sala_estado")
    private String estado;

    @OneToMany(mappedBy = "sala")
    private List<Equipamento> equipamentos = new ArrayList<>();

    public Sala() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        if (equipamento != null && !this.equipamentos.contains(equipamento)) {
            this.equipamentos.add(equipamento);
            equipamento.setSala(this);
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados da Sala ----");
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado: " + estado);
        System.out.println("-Equipamentos na Sala:");
        if (equipamentos.isEmpty()) {
            System.out.println(" Nenhum equipamento no local.");
        } else {
            for (Equipamento e : equipamentos) {
                System.out.println(" - " + e.getModelo() + ", Estado: " + e.getEstado());
            }
        }
        System.out.println("===============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo da Sala ---");
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado: " + estado);
        System.out.println("===============================");
    }

}
