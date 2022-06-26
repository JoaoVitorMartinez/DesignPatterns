package loja.orcamento.pedido;

import loja.orcamento.Orcamento;
import loja.orcamento.pedido.acoes.PedidoObserver;
import loja.orcamento.pedido.acoes.SalvaPedido;

import java.time.LocalDateTime;
import java.util.List;

public class PedidoHandler {
    private List<PedidoObserver> acoes;
    public PedidoHandler(List<PedidoObserver> acoes) {
        this.acoes = acoes;
    }

    public void execute(PedidoCommand dados){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(dados.getItens());
        Pedido pedido = new Pedido(dados.getCliente(), orcamento, LocalDateTime.now());
        System.out.println(pedido);
        acoes.forEach(a -> a.execute(pedido));
    }

}
