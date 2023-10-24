package com.example.demoApi5.repository;

import com.example.demoApi5.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {

    List<Disciplina> findByNome(String nome);

    List<Disciplina> findByCargaHora(int cargaHora);

    List<Disciplina> findBySigla(String sigla);
}
