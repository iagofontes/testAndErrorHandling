package br.com.fiap.exercicio1.rest;

import br.com.fiap.exercicio1.dto.OrderDTO;
import br.com.fiap.exercicio1.repository.OrderRepository;
import br.com.fiap.exercicio1.repository.OrderRepositoryImpl;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class Service {

    @Autowired
    OrderRepository orderRepository;

    @RequestMapping(value="findById/{idPedido}", method = RequestMethod.GET)
    public ResponseEntity<OrderDTO> findById(@PathVariable(value="idPedido") int idPedido) {
        return new ResponseEntity<OrderDTO>(orderRepository.findById(idPedido), HttpStatus.valueOf(200));
    }

    @RequestMapping(value="save", method = RequestMethod.POST)
    public ResponseEntity<OrderDTO> save(@Valid @RequestBody OrderDTO orderDTO) {
        OrderDTO savedOrder = orderRepository.save(orderDTO);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{idPedido}")
                .buildAndExpand(savedOrder.getIdPedido()).toUri();
        return ResponseEntity.created(location).build();
    }

    @RequestMapping(value="update", method = RequestMethod.PUT)
    public ResponseEntity<OrderDTO> update(@Valid @RequestBody OrderDTO orderDTO) {
        return new ResponseEntity<OrderDTO>(orderRepository.update(orderDTO), HttpStatus.valueOf(200));
    }

    @RequestMapping(value="delete/{idPedido}", method = RequestMethod.DELETE)
    public ResponseEntity<String> delete(@PathVariable(value="idPedido")@Valid @RequestBody int idPedido) {
        return new ResponseEntity<String>(orderRepository.delete(idPedido), HttpStatus.valueOf(200));
    }
}
