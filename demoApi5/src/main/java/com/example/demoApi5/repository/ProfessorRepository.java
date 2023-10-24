package com.example.demoApi5.repository;

import com.example.demoApi5.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

    List<Professor> findByNome(String nome);

    List<Professor> findByIdade(int idade);

    @Query("select a from Professor a where a.nome like %?1% and a.idade > ?2")
    List<Professor> findByNomeIdade(String nome, int idade);

    @Query("select a from Professor a where a.nome like %?1% and a.ne < ?2")
    List<Professor> findByNomeNe(String nome, int ne);
}
