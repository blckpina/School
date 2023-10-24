package com.example.demoApi5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DisciplinaApi")
public class Disciplina {

    @Id
    private int codigo;

    @Column
    private String nome;

    @Column
    private int cargaHora;

    @Column(length = 2)
    private String sigla;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHora() {
        return cargaHora;
    }

    public void setCargaHora(int cargaHora) {
        this.cargaHora = cargaHora;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
