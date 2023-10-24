package com.example.demoApi5.controller;

import com.example.demoApi5.model.Disciplina;
import com.example.demoApi5.model.Professor;
import com.example.demoApi5.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiDisciplina")
public class DisciplinaControl {

    @Autowired
    DisciplinaRepository discRepo;

    @GetMapping("/todos")
    public void buscarDisciplinas()
    {
        discRepo.findAll();
    }

    @GetMapping("/todos/codigo/{codigo}")
    public Optional<Disciplina> buscarDisciplinaPorId(@PathVariable("codigo") int codigo)
    {
        return discRepo.findById(codigo);
    }

    @GetMapping("/todos/nome/{nome}")
    public List<Disciplina> buscarDisciplinaPorNome(@PathVariable("nome") String nome)
    {
        return discRepo.findByNome(nome);
    }

    @GetMapping("/todos/cargaHora/{cargaHora}")
    public List<Disciplina> buscarDisciplinaPorCargaHoraria(@PathVariable("cargaHora") int cargaHora)
    {
        return discRepo.findByCargaHora(cargaHora);
    }

    @GetMapping("/todos/sigla/{sigla}")
    public List<Disciplina> buscarDisciplinaPorSigla(@PathVariable("sigla") String sigla)
    {
        return discRepo.findBySigla(sigla);
    }
}
