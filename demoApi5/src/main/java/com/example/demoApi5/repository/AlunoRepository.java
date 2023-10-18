package com.example.demoApi5.repository;

import com.example.demoApi5.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    List<Aluno> findByNome(String nome);

    List<Aluno> findByAltura(double altura);
}
