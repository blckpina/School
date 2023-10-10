package com.example.demoApi4.repository;

import com.example.demoApi4.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Integer>{
}
