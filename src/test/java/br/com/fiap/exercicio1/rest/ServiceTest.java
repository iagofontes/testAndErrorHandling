package br.com.fiap.exercicio1.rest;

import br.com.fiap.exercicio1.dto.OrderDTO;
import br.com.fiap.exercicio1.repository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(SpringRunner.class)
@WebMvcTest(OrderRepository.class)
public class ServiceTest {

    @Autowired
    private MockMvc mvc;
    @MockBean
    private Service service;

    @Test
    public void findById() {
        OrderDTO orderDTO = mock(OrderDTO.class);

        orderDTO.setIdPedido(1);

        service.findById(orderDTO.getIdPedido());
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