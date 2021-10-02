package br.com.fiap.orderservice.controller;

import br.com.fiap.orderservice.entity.Order;
import br.com.fiap.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/order")
    public ResponseEntity<Order>getSave(@RequestBody Order order){
        return new ResponseEntity<>(order, HttpStatus.ACCEPTED);
    }
}