# Exemplos de utilização OrderService e PaymentService

    A seguir alguns exemplos de chamadas para se utilizar a API

# OrderService

## Endpoint findById

    Possibilita ao usuario encontrar um pedido (Order) a partir do ID do mesmo

### Exemplo de utilização

    http://localhost:8080/findById/0

    OBS.: O mesmo irá retornar o pedido no formato JSON

## Endpoint save

    Possibilita ao usuario salvar um pedido (Order)

    OBS.: O mesmo irá retornar o URL para acessar o pedido salvo

### Exemplo de utilização

    http://localhost:8080/save

    Corpo da requisição:

    {
        "email" : "rafyySilva@gmail.com", 
        "nomeCompleto" : "Rafyy Silva", 
        "address" : "Novo Brasil", 
        "idPedido" : 1, 
        "descricao" : ["desc A","desc B"],
        "qntdPedidos" : 1, 
        "precoUnitario" : [5.00, 15.00], 
        "precoTotal" : 20.00, 
        "formaPagamento" : "cartao", 
        "dataPedido" : "02/10/2021",
        "status" : "ativo", 
        "idTransacao" : 2, 
        "numeroCartao" : "789456123", 
        "validadeCartao" : "10/2026", 
        "bandeira" : "Elo"
    }

## Endpoint update

    Possibilita ao usuario atualizar os dados de um pedido (Order), utilizando seu ID para encontra-lo

### Exemplo de utilização

    http://localhost:8080/update/0

    Corpo da requisição:

    {
        "email" : "rafyySilva@gmail.com", 
        "nomeCompleto" : "Rafyy Silva", 
        "address" : "Novo Brasil", 
        "idPedido" : 1, 
        "descricao" : ["desc A","desc B"],
        "qntdPedidos" : 1, 
        "precoUnitario" : [5.00, 15.00, 45.00], 
        "precoTotal" : 65.00, 
        "formaPagamento" : "cartao", 
        "dataPedido" : "02/10/2021",
        "status" : "ativo", 
        "idTransacao" : 2, 
        "numeroCartao" : "7894561231257896", 
        "validadeCartao" : "10/2026", 
        "bandeira" : "Elo"
    }

## Endpoint delete

    Possibilita ao usuario deletar um pedido (Order), utilizando seu ID para encontra-lo

### Exemplo de utilização

    http://localhost:8080/delete/0

    OBS.: O mesmo irá retornar o pedido no formato JSON, após exclui-lo

# PaymentService

## Endpoint findById

    Possibilita ao usuario encontrar uma transacão a partir da ID do mesmo

### Exemplo de utilização

    http://localhost:8080/pay/findById/0

    OBS.: O mesmo irá retornar a transação no formato JSON

## Endpoint save

    Possibilita ao usuario salvar uma transação

    OBS.: O mesmo irá retornar o URL para acessar a transação salva

### Exemplo de utilização

    http://localhost:8080/pay/save

    Corpo da requisição:

    { 
        "idTransacao" : 2, 
        "numeroCartao" : "7894561231257896", 
        "validadeCartao" : "10/2026", 
        "bandeira" : "Elo"
    }

## Endpoint update

    Possibilita ao usuario atualizar os dados de uma transação, utilizando seu ID para encontra-la

### Exemplo de utilização

    http://localhost:8080/pay/update/0

    Corpo da requisição:

    {
       "idTransacao" : 2, 
        "numeroCartao" : "7894561231257896", 
        "validadeCartao" : "10/2026", 
        "bandeira" : "Elo"
    }

## Endpoint delete

    Possibilita ao usuario deletar uma transação, utilizando seu ID para encontra-lo

### Exemplo de utilização

    http://localhost:8080/pay/delete/0

    OBS.: O mesmo irá retornar uma transação no formato JSON, após exclui-la