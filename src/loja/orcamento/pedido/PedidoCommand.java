package loja.orcamento.pedido;

import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class PedidoCommand {
    private String cliente;
    private ItemOrcamento itens;

    public PedidoCommand(String cliente, ItemOrcamento item) {
        this.cliente = cliente;
        this.itens = item;
    }

    public String getCliente() {
        return cliente;
    }

    public ItemOrcamento getItens() {
        return itens;
    }
    //    public BigDecimal getValorOrcamento() {
//        return valorOrcamento;
//    }
//
//    public int getQtdItens() {
//        return qtdItens;
//    }
}
