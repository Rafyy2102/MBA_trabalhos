package br.com.fiap.orderservice.controller;

import br.com.fiap.orderservice.entity.Payment;
import br.com.fiap.orderservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService service;

    @GetMapping("/pay/findById/{idTransacao}")
    public ResponseEntity findById(@PathVariable("idTransacao") int idTransacao) {
        Payment payment = service.findById(idTransacao);
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }

    @PostMapping("/pay/save")
    public ResponseEntity<String> save(@RequestBody Payment payment) {
        service.save(payment);
        return new ResponseEntity<>("http://localhost:8080/pay/findById/" + payment.getIdTransacao(),
                HttpStatus.ACCEPTED);
    }

    @PostMapping("/pay/update/{idTransacao}")
    public ResponseEntity<Payment> update(@PathVariable("idTransacao") int idTransacao, @RequestBody Payment payment) {
        service.update(idTransacao, payment);
        return new ResponseEntity<>(payment, HttpStatus.ACCEPTED);
    }

    @GetMapping("/pay/delete/{idTransacao}")
    public ResponseEntity delete(@PathVariable("idTransacao") int idTransacao) {
        Payment payment = service.delete(idTransacao);
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }

}