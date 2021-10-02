package br.com.fiap.orderservice.entity;

public class Payment {
    private int idTransacao;
    private String numeroCartao;
    private String validade;
    private String bandeira;

    public Payment(int idTransacao, String numeroCartao, String validade, String bandeira) {
        this.idTransacao = idTransacao;
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.bandeira = bandeira;
    }

    public int getIdTransacao() {return idTransacao;}
    public void setIdTransacao(int idTransacao) {this.idTransacao = idTransacao;}
    public String getNumeroCartao() {return numeroCartao;}
    public void setNumeroCartao(String numeroCartao) {this.numeroCartao = numeroCartao;}
    public String getValidade() {return validade;}
    public void setValidade(String validade) {this.validade = validade;}
    public String getBandeira() {return bandeira;}
    public void setBandeira(String bandeira) {this.bandeira = bandeira;}
}