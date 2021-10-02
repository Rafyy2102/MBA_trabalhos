package br.com.fiap.orderservice.repository;

import br.com.fiap.orderservice.entity.Payment;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PaymentResposiory {
    private List<Payment> payments = new ArrayList<Payment>();

    public Payment findById(int id) {
        for (Payment payment : payments) {
            if (payment.getIdTransacao() == id) {
                return payment;
            }
        }
        return null;
    }

    public void save(Payment payment) {
        this.payments.add(payment);
    }

    public void update(int idTransacao, Payment payment) {
        Payment newPayment = this.findById(idTransacao);
        newPayment.setIdTransacao(payment.getIdTransacao());
        newPayment.setNumeroCartao(payment.getNumeroCartao());
        newPayment.setBandeira(payment.getBandeira());
        newPayment.setValidade(payment.getValidade());
    }

    public Payment delete(int idTransacao) {
        Payment payment = this.findById(idTransacao);
        Payment oldPayment = new Payment(payment.getIdTransacao(), payment.getNumeroCartao(),
                payment.getValidade(), payment.getBandeira());
        payments.remove(payment);
        return oldPayment;
    }
}
