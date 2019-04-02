package br.com.fiap.exercicio1.repository;

import br.com.fiap.exercicio1.dto.OrderDTO;
import br.com.fiap.exercicio1.rest.Service;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OrderRepositoryImplTest {

    @Autowired
    private MockMvc mvc;
    @MockBean
    private OrderRepository repository;


    @Test
    public void findById() {
        OrderDTO orderDTO = mock(OrderDTO.class);

        orderDTO.setIdPedido(1);
        when(this.repository.findById(orderDTO.getIdPedido())).thenReturn(orderDTO);

    }

    @Test
    public void save() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}