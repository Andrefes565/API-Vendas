package com.andreFelipe.domain.repository;

import com.andreFelipe.domain.entity.Cliente;
import com.andreFelipe.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);

    @Query(" select p from Pedido p left join fetch p.itens where p.id =:id ")
    Optional<Pedido> findByFetchItens(Integer id);
}
