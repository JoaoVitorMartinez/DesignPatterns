package loja.orcamento.pedido.acoes;

import loja.orcamento.pedido.Pedido;

public class LogPedidos implements PedidoObserver{
    @Override
    public void execute(Pedido pedido) {
        System.out.println(pedido);
    }
}
