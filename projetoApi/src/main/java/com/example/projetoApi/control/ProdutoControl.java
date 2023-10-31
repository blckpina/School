package com.example.projetoApi.control;

import com.example.projetoApi.model.Produto;
import com.example.projetoApi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiProduto")
public class ProdutoControl {

    @Autowired
    ProdutoRepository prRepo;

    @GetMapping("/todos")
    public List<Produto> buscarProduto()
    {
        return prRepo.findAll();
    }

    @GetMapping("/todos/cod/{codP}")
    public Optional<Produto> buscarPorCodigo(@PathVariable("codP") int codP)
    {
        return prRepo.findById(codP);
    }

    @GetMapping("/todos/parteDescricao/{parteDescricao}")
    public List<Produto> buscarPorParteDescricao(@PathVariable("parteDescricao") String parteDescricao)
    {
        return prRepo.findByParteDescricao(parteDescricao);
    }

    @GetMapping("/todos/precoMenor/{preco}")
    public List<Produto> buscarPorMenorPreco(@PathVariable("preco") double preco)
    {
        return prRepo.findByPrecoMenor(preco);
    }

    @GetMapping("/todos/marca/{marca}")
    public List<Produto> buscarPorMarca(@PathVariable("marca") String marca)
    {
        return prRepo.findByMarca(marca);
    }

    @GetMapping("/todos/parteMarcaPreco/{parteMarca}/{preco}")
    public List<Produto> buscarPorParteMarcaPreco(@PathVariable("parteMarca") String parteMarca, @PathVariable("preco") double preco)
    {
        return prRepo.findByParteMarcaPreco(parteMarca, preco);
    }

    @PostMapping("/inserir")
    public void inserirProduto(@RequestBody Produto pr)
    {
        prRepo.save(pr);
    }

    @PutMapping("/atualizar")
    public void atualizarProduto(@RequestBody Produto pr)
    {
        prRepo.save(pr);
    }

    @DeleteMapping("/remover")
    public void removerProduto(@RequestBody Produto pr)
    {
        prRepo.delete(pr);
    }

    @DeleteMapping("/remover/cod/{codP}")
    public void removerPorCodigo(@PathVariable("codP") int codP)
    {
        prRepo.deleteById(codP);
    }
}
