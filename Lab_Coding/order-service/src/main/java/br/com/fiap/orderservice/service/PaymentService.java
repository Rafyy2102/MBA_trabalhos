package br.com.fiap.orderservice.service;

import br.com.fiap.orderservice.entity.Payment;
import br.com.fiap.orderservice.repository.PaymentResposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentResposiory repository;

    @Autowired
    public PaymentService(PaymentResposiory repository) {
        this.repository = repository;
    }

    public Payment findById(int id) {
        Payment payment = repository.findById(id);
        return payment;
    }

    public void save(Payment payment) {
        this.repository.save(payment);
    }

    public void update(int idTransacao, Payment payment) {
        repository.update(idTransacao, payment);
    }

    public Payment delete(int idTransacao) {
        return repository.delete(idTransacao);
    }
}