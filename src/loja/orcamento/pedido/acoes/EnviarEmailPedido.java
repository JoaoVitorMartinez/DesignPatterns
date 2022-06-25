package loja.orcamento.pedido.acoes;

import loja.orcamento.pedido.Pedido;

public class EnviarEmailPedido implements PedidoObserver{

    public void execute(Pedido pedido){
        System.out.println("Enviando Email com os dados de pedido");
    }
}
