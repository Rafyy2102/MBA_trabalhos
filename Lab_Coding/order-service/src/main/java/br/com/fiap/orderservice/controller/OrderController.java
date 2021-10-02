package br.com.fiap.orderservice.controller;

import br.com.fiap.orderservice.dto.OrderDTO;
import br.com.fiap.orderservice.exeption.EntityNotFoundException;
import br.com.fiap.orderservice.exeption.InvalidoRegistroException;
import br.com.fiap.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    private OrderService service;

    @GetMapping("/findById/{idOrder}")
    public ResponseEntity findById(@PathVariable("idOrder") int idOrder) throws EntityNotFoundException {
        OrderDTO order = service.findById(idOrder);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody OrderDTO order) {
        service.save(order);
        return new ResponseEntity<>("http://localhost:8080/findById/" + (service.getCurrentId() - 1),
                HttpStatus.ACCEPTED);
    }

    @PostMapping("/update/{idOrder}")
    public ResponseEntity<OrderDTO> update(@PathVariable("idOrder") int idOrder, @RequestBody OrderDTO order)
            throws EntityNotFoundException, InvalidoRegistroException {
        service.update(idOrder, order);
        return new ResponseEntity<>(order, HttpStatus.ACCEPTED);
    }

    @GetMapping("/delete/{idOrder}")
    public ResponseEntity delete(@PathVariable("idOrder") int idOrder) {
        OrderDTO order = service.delete(idOrder);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}