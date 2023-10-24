package com.example.demoApi5.controller;

import com.example.demoApi5.model.Aluno;
import com.example.demoApi5.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/todos/ra/{ra}")
    public Optional<Aluno> buscarPorRa(@PathVariable("ra") int ra)
    {
        return alrepo.findById(ra);
    }

    @GetMapping("/todos/nome/{nome}")
    public List<Aluno> buscarPorNome(@PathVariable("nome") String nome)
    {
        return alrepo.findByNome(nome);
    }

    @GetMapping("/todos/altura/{altura}")
    public List<Aluno> buscarPorAltura(@PathVariable("altura") double altura)
    {
        return alrepo.findByAltura(altura);
    }

    @PostMapping("/inserir")
    public void inserirAluno(@RequestBody Aluno al)
    {
        alrepo.save(al);
    }

    @DeleteMapping("/remover")
    public void removerAluno(@RequestBody Aluno al)
    {
        alrepo.delete(al);
    }

    @DeleteMapping("/remover/ra/{ra}")
    public void removerAlunoPorId (@PathVariable("ra") int ra)
    {
        alrepo.deleteById(ra);
    }

    @PutMapping("/atualizar")
    public void atualizarAluno(@RequestBody Aluno al)
    {
        alrepo.save(al);
    }

    @GetMapping("/todos/parteNome/{parteNome}")
    public List<Aluno> buscarPorParteNome(@PathVariable("parteNome") String parteNome)
    {
        return alrepo.findByParteNome(parteNome);
    }

    @GetMapping("/todos/raMaiorQue/{ra}")
    public List<Aluno> buscarRaMaiorQue(@PathVariable("ra") int ra)
    {
        return alrepo.findByMaiorQue(ra);
    }

    @GetMapping("/todos/alturaMenorQue/{altura}")
    public List<Aluno> buscarAlturaMenorQue(@PathVariable("altura") double altura)
    {
        return alrepo.findByMenorQue(altura);
    }

    @GetMapping("/todos/nomeRa/{nome}/{ra}")
    public List<Aluno> buscarPorNomeRa(@PathVariable("nome") String nome, @PathVariable("ra") int ra)
    {
        return alrepo.findByNomeRa(nome, ra);
    }

    @GetMapping("/todos/nomeAltura/{nome}/{altura}")
    public List<Aluno> buscarPorNomeAltura(@PathVariable("nome") String nome, @PathVariable("altura") double altura)
    {
        return alrepo.findByNomeAltura(nome, altura);
    }
}
