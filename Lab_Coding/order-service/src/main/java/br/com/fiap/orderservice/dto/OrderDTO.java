package br.com.fiap.orderservice.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDTO {

    private int idPedido;
    private String email;
    private String nome;
    private String shippingAddress;
    private String descricao;
    private int quantidadeIten;
    private BigDecimal preco;
    private BigDecimal valor;
    private String formaPagamento;
    private LocalDateTime dataPedido;
    private String Status;
    private int idTransacao;
    private String numeroCartao;
    private String validade;
    private String bandeira;

    public OrderDTO(){}

    public OrderDTO(int idPedido, String email, String nome, String shippingAddress, String descricao,
                    int quantidadeIten, BigDecimal preco, BigDecimal valor, String formaPagamento,
                    LocalDateTime dataPedido, String status, int idTransacao, String numeroCartao,
                    String validade, String bandeira) {
        this.idPedido = idPedido;
        this.email = email;
        this.nome = nome;
        this.shippingAddress = shippingAddress;
        this.descricao = descricao;
        this.quantidadeIten = quantidadeIten;
        this.preco = preco;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.dataPedido = dataPedido;
        this.Status = status;
        this.idTransacao = idTransacao;
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.bandeira = bandeira;
    }

    public int getIdPedido() {return idPedido;}
    public void setIdPedido(int idPedido) {this.idPedido = idPedido;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getShippingAddress() {return shippingAddress;}
    public void setShippingAddress(String shippingAddress) {this.shippingAddress = shippingAddress;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
    public int getQuantidadeIten() {return quantidadeIten;}
    public void setQuantidadeIten(int quantidadeIten) {this.quantidadeIten = quantidadeIten;}
    public BigDecimal getPreco() {return preco;}
    public void setPreco(BigDecimal preco) {this.preco = preco;}
    public BigDecimal getValor() {return valor;}
    public void setValor(BigDecimal valor) {this.valor = valor;}
    public String getFormaPagamento() { return formaPagamento;}
    public void setFormaPagamento(String formaPagamento) {this.formaPagamento = formaPagamento;}
    public LocalDateTime getDataPedido() {return dataPedido;}
    public void setDataPedido(LocalDateTime dataPedido) {this.dataPedido = dataPedido;}
    public String getStatus() {return Status;}
    public void setStatus(String status) {Status = status;}
    public int getIdTransacao() {return idTransacao;}
    public void setIdTransacao(int idTransacao) {this.idTransacao = idTransacao;}
    public String getNumeroCartao() {return numeroCartao;}
    public void setNumeroCartao(String numeroCartao) {this.numeroCartao = numeroCartao;}
    public String getValidade() {return validade;}
    public void setValidade(String validade) {this.validade = validade;}
    public String getBandeira() {return bandeira;}
    public void setBandeira(String bandeira) {this.bandeira = bandeira;}
}