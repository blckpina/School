package com.example.demoApi5.controller;

import com.example.demoApi5.model.Aluno;
import com.example.demoApi5.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiAluno")
public class AlunoControl {

    @Autowired
    AlunoRepository alrepo;

    @GetMapping("/todos")
    public List<Aluno> buscarTodosAlunos()
    {
        return alrepo.findAll();
    }

}
