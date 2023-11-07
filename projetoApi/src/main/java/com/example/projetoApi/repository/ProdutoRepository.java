package com.example.projetoApi.repository;

import com.example.projetoApi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    @Query("Select a from Produto a where a.descricao like ?1%")
    List<Produto> findByParteDescricao(String parteDescricao);

    @Query("Select a from Produto a where a.preco < ?1")
    List<Produto> findByPrecoMenor(double preco);

    List<Produto> findByMarca(String marca);

    @Query("Select a from Produto a where a.marca like %?1% and a.preco < ?2")
    List<Produto> findByParteMarcaPreco(String parteMarca, double preco);
}
