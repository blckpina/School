package com.example.projetoApi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clienteApi")
public class Cliente {

    @Id
    private int codC;

    @Column
    private String nome;

    @Column
    private String email;

    public int getCodC() {
        return codC;
    }

    public void setCodC(int codC) {
        this.codC = codC;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
