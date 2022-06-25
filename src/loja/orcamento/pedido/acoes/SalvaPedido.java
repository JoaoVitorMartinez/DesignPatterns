package loja.orcamento.pedido.acoes;

import loja.orcamento.pedido.Pedido;

public class SalvaPedido implements PedidoObserver {
    public void execute(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados");
    }
}
