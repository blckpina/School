package com.example.demoApi5.controller;

import com.example.demoApi5.model.Professor;
import com.example.demoApi5.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apiProfessor")
public class ProfessorControl {

    @Autowired
    ProfessorRepository prrepo;

    @GetMapping("/todos")
    public List<Professor> buscarTodosProfessores()
    {
        return prrepo.findAll();
    }

}
