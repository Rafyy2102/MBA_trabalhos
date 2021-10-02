package br.com.fiap.orderservice.service;

import br.com.fiap.orderservice.dto.OrderDTO;
import br.com.fiap.orderservice.entity.Order;
import br.com.fiap.orderservice.exeption.EntityNotFoundException;
import br.com.fiap.orderservice.exeption.InvalidoRegistroException;
import br.com.fiap.orderservice.repository.OrderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRespository repository;
    private int idAtual;

    @Autowired
    public OrderService(OrderRespository repository) {
        this.repository = repository;
        this.idAtual = 0;
    }

    public OrderDTO findById(int id) throws EntityNotFoundException {
        Order order = repository.findById(id);

        if (order == null)
            throw new EntityNotFoundException("Pedido com ID " + id + " não encontrado.");

        OrderDTO orderDTO = new OrderDTO(order.getIdPedido(), order.getEmail(),order.getNome(),
                order.getShippingAddress(), order.getDescricao(), order.getQuantidadeIten(),
                order.getPreco(), order.getValor(), order.getFormaPagamento(),
                order.getDataPedido(), order.getStatus(), order.getIdTransacao(),
                order.getNumeroCartao(), order.getValidade(), order.getBandeira());
                return orderDTO;}

    public void save(OrderDTO order) {
        Order ord = new Order(idAtual, order.getIdPedido(), order.getEmail(),order.getNome(),
                order.getShippingAddress(), order.getDescricao(), order.getQuantidadeIten(),
                order.getPreco(), order.getValor(), order.getFormaPagamento(),
                order.getDataPedido(), order.getStatus(), order.getIdTransacao(),
                order.getNumeroCartao(), order.getValidade(), order.getBandeira());
        this.repository.save(ord);
        idAtual++;
    }

    public void update(int idOrder, OrderDTO order) throws EntityNotFoundException, InvalidoRegistroException {
        if (repository.findById(idOrder) == null)
            throw new EntityNotFoundException("Pedido com ID " + idOrder + " não encontrado.");
        repository.update(idOrder, order);
    }

    public OrderDTO delete(int idOrder) {
        Order order = repository.delete(idOrder);
        OrderDTO orderDTO = new OrderDTO(order.getIdPedido(), order.getEmail(),order.getNome(),
                order.getShippingAddress(), order.getDescricao(), order.getQuantidadeIten(),
                order.getPreco(), order.getValor(), order.getFormaPagamento(),
                order.getDataPedido(), order.getStatus(), order.getIdTransacao(),
                order.getNumeroCartao(), order.getValidade(), order.getBandeira());
        return orderDTO;
    }

    public int getCurrentId() {
        return this.idAtual;
    }
}