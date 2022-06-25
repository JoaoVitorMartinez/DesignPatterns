package loja.orcamento.pedido;

import loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class PedidoHandler {
    public void execute(PedidoCommand dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), orcamento, LocalDateTime.now());
        System.out.println("Cliente: " +pedido.getCliente() + "\nValor do Pedido: "+  orcamento.getValor()+ "\nData: "+ pedido.getData());
    }

}
