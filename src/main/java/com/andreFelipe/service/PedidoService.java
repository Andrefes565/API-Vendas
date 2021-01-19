package com.andreFelipe.service;

import com.andreFelipe.domain.entity.Pedido;
import com.andreFelipe.domain.entity.enums.StatusPedido;
import com.andreFelipe.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statuspedido);
}
