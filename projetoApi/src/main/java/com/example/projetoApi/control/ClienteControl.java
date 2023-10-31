package com.example.projetoApi.control;

import com.example.projetoApi.model.Cliente;
import com.example.projetoApi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiCliente")
public class ClienteControl {

    @Autowired
    ClienteRepository clRepo;

    @GetMapping("/todos")
    public List<Cliente> buscarCliente()
    {
        return clRepo.findAll();
    }

    @GetMapping("/todos/cod/{codC}")
    public Optional<Cliente> buscarPorCodigo(@PathVariable("codC") int codC)
    {
        return clRepo.findById(codC);
    }

    @GetMapping("/todos/parteNome/{parteNome}")
    public List<Cliente> buscarPorParteNome(@PathVariable("parteNome") String parteNome)
    {
        return clRepo.findByParteNome(parteNome);
    }

    @GetMapping("/todos/email/{email}")
    public List<Cliente> buscarPorEmail(@PathVariable("email") String email)
    {
        return clRepo.findByEmail(email);
    }

    @GetMapping("/todos/parteNomeEmail/{parteNome}/{parteEmail}")
    public List<Cliente> buscarPorParteNomeEmail(@PathVariable("parteNome") String parteNome, @PathVariable("parteEmail") String parteEmail)
    {
        return clRepo.findByParteNomeEmail(parteNome, parteEmail);
    }

    @PostMapping("/inserir")
    public void inserirCliente(@RequestBody Cliente cl)
    {
        clRepo.save(cl);
    }

    @PutMapping("/atualizar")
    public void atualizarCliente(@RequestBody Cliente cl)
    {
        clRepo.save(cl);
    }

    @DeleteMapping("/remover")
    public void removerCliente(@RequestBody Cliente cl)
    {
        clRepo.delete(cl);
    }

    @DeleteMapping("/remover/cod/{codC}")
    public void removerPorCodigo(@PathVariable("codC") int codC)
    {
        clRepo.deleteById(codC);
    }
}
