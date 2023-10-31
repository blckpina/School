package com.example.projetoApi.repository;

import com.example.projetoApi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("Select a from Cliente a where a.nome like %?1%")
    List<Cliente> findByParteNome(String parteNome);

    @Query("Select a from Cliente a where a.email like %?1%")
    List<Cliente> findByEmail(String email);

    @Query("Select a from Cliente a where a.nome like %?1% and a.email like %?2%")
    List<Cliente> findByParteNomeEmail(String parteNome, String parteEmail);
}
