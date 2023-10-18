package com.example.demoApi5.controller;

import com.example.demoApi5.model.Professor;
import com.example.demoApi5.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/todos/ne/{ne}")
    public Optional<Professor> buscarPorNe(@PathVariable("ne") int ne)
    {
        return prrepo.findById(ne);
    }

    @GetMapping("/todos/nome/{nome}")
    public List<Professor> buscarPorNome(@PathVariable("nome") String nome)
    {
        return prrepo.findByNome(nome);
    }

    @GetMapping("/todos/idade/{idade}")
    public List<Professor> buscarPorIdade(@PathVariable("idade") int idade)
    {
        return prrepo.findByIdade(idade);
    }

    @PostMapping("/inserir")
    public void inserirProf(@RequestBody Professor pr)
    {
        prrepo.save(pr);
    }
}
