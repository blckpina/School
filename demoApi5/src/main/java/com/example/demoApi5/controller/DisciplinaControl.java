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
    public List<Disciplina> buscarDisciplinas()
    {
        return discRepo.findAll();
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

    @PostMapping("/inserir")
    public void inserirDisciplina(@RequestBody Disciplina disc)
    {
        discRepo.save(disc);
    }

    @DeleteMapping("/remover")
    public void removerDisciplina(@RequestBody Disciplina disc)
    {
        discRepo.delete(disc);
    }

    @DeleteMapping("/remover/codigo/{codigo}")
    public void removerDisciplinaPorId(@PathVariable("codigo") int codigo)
    {
        discRepo.deleteById(codigo);
    }

    @PutMapping("/atualizar")
    public void atualizarDisciplina(@RequestBody Disciplina disc)
    {
        discRepo.save(disc);
    }

    @GetMapping("/todos/siglaCod/{sigla}/{codigo}")
    public List<Disciplina> buscarPorSiglaCodigo(@PathVariable("sigla") String sigla, @PathVariable("codigo") int codigo)
    {
        return discRepo.findBySiglaCod(sigla, codigo);
    }

    @GetMapping("/todos/nomeCod/{nome}/{codigo}")
    public List<Disciplina> buscarPorNomeCodigo(@PathVariable("nome") String nome, @PathVariable("codigo") int codigo)
    {
        return discRepo.findByNomeCod(nome, codigo);
    }

    @GetMapping("/todos/siglaNome/{sigla}/{nome}")
    public List<Disciplina> buscarPorSiglaNome(@PathVariable("sigla") String sigla, @PathVariable("nome") String nome)
    {
        return discRepo.findBySiglaNome(sigla, nome);
    }

}
