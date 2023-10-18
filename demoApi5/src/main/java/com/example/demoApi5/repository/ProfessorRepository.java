package com.example.demoApi5.repository;

import com.example.demoApi5.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

    List<Professor> findByNome(String nome);

    List<Professor> findByIdade(int idade);
}
