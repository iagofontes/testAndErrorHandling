package br.com.fiap.exercicio1.repository;

import br.com.fiap.exercicio1.dto.OrderDTO;
import org.springframework.http.ResponseEntity;

public interface OrderRepository {
    public OrderDTO findById(int idPedido);
    public OrderDTO save(OrderDTO orderDTO);
    public OrderDTO update(OrderDTO orderDTO);
    public String delete(int idPedido);
}

