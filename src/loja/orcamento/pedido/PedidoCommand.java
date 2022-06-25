package loja.orcamento.pedido;

import java.math.BigDecimal;

public class PedidoCommand {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int qtdItens;

    public PedidoCommand(String cliente, BigDecimal valorOrcamento, int qtdItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQtdItens() {
        return qtdItens;
    }
}
