package br.com.fiap.orderservice.repository;

import br.com.fiap.orderservice.dto.OrderDTO;
import br.com.fiap.orderservice.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRespository {

    private List<Order> orders = new ArrayList<Order>();

    public Order findById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public void save(Order ord) {
        orders.add(ord);
    }

    public void update(int idOrder, OrderDTO order) {
        Order newOrder = this.findById(idOrder);
        newOrder.setShippingAddress(order.getShippingAddress());
        newOrder.setDescricao(order.getDescricao());
        newOrder.setQuantidadeIten(order.getQuantidadeIten());
        newOrder.setPreco(order.getPreco());
        newOrder.setValor(order.getValor());
        newOrder.setFormaPagamento(order.getFormaPagamento());
        newOrder.setIdTransacao(order.getIdTransacao());
        newOrder.setNumeroCartao(order.getNumeroCartao());
        newOrder.setValidade(order.getValidade());
        newOrder.setBandeira(order.getBandeira());
    }

    public Order delete(int idOrder) {
        Order order = this.findById(idOrder);
        Order oldOrder = new Order();
        oldOrder.setId(order.getId());
        oldOrder.setEmail(order.getEmail());
        oldOrder.setNome(order.getNome());
        oldOrder.setShippingAddress(order.getShippingAddress());
        oldOrder.setIdPedido(order.getIdPedido());
        oldOrder.setDescricao(order.getDescricao());
        oldOrder.setQuantidadeIten(order.getQuantidadeIten());
        oldOrder.setPreco(order.getPreco());
        oldOrder.setValor(order.getValor());
        oldOrder.setFormaPagamento(order.getFormaPagamento());
        oldOrder.setDataPedido(order.getDataPedido());
        oldOrder.setStatus(order.getStatus());
        oldOrder.setIdTransacao(order.getIdTransacao());
        oldOrder.setNumeroCartao(order.getNumeroCartao());
        oldOrder.setValidade(order.getValidade());
        oldOrder.setBandeira(order.getBandeira());
        orders.remove(order);
        return oldOrder;
    }
}