package com.example.demoApi5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProfessorApi")
public class Professor {

    @Id
    private int ne;

    @Column
    private String nome;

    @Column
    private int idade;

    public int getNe() {
        return ne;
    }

    public void setNe(int ne) {
        this.ne = ne;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
