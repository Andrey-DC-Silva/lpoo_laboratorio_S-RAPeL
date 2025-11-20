package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "tecnicos")
public class Tecnico extends Pessoa {

    @Column(name = "especializacao")
    private String especializacao;

    @OneToMany(mappedBy = "tecnico")
    private List<Equipamento> equipamentos = new ArrayList<>();

    public Tecnico() {
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
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
            equipamento.setTecnico(this);
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("---- Dados do Tecnico ----");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDtNasc().format(formato));
        System.out.println("Especialização: " + getEspecializacao());

        System.out.println("-Equipamentos Operados:");
        if (equipamentos.isEmpty()) {
            System.out.println("Nenhum equipamento registrado.");
        } else {
            for (Equipamento equipamento : equipamentos) {
                System.out.print(" - " + equipamento.getModelo());
                System.out.println(" / Sala: " + equipamento.getSala());
            }
        }
        System.out.println("==============================");
    }

    @Override
    public void mostrarResumo() {
        System.out.println("");
        System.out.println("===============================");
        System.out.println("--- Resumo do Tecnico ---");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Especialização: " + getEspecializacao());
        System.out.println("===============================");
    }
}
