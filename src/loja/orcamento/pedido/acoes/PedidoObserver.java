package loja.orcamento.pedido.acoes;

import loja.orcamento.pedido.Pedido;

public interface PedidoObserver {
    public void execute(Pedido pedido);
}
