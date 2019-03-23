package br.com.fiap.exercicio1.repository;

import br.com.fiap.exercicio1.dto.OrderDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository{

    private List<OrderDTO> orderList = new ArrayList<>();

    public OrderDTO findById(int idPedido){
        for (OrderDTO order : orderList) {
            if (order.getIdPedido() == idPedido)
                return order;
        }

        return null;
    }

    @Override
    public OrderDTO save(OrderDTO orderDTO) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getIdPedido() == orderDTO.getIdPedido()) {
                return null;
            }
        }
        orderList.add(orderDTO);
        orderDTO.setIdPedido(Integer.valueOf(orderList.size()));
        return orderDTO;
    }

    @Override
    public OrderDTO update(OrderDTO orderDTO) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getIdPedido() == orderDTO.getIdPedido()) {
                orderList.set(i, orderDTO);
                return orderDTO;
            }
        }
        return null;
    }

    public String delete(int idPedido) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getIdPedido() == idPedido) {
                orderList.remove(i);
                return "Excluído com sucesso.";
            }
        }
        return null;
    }

}
