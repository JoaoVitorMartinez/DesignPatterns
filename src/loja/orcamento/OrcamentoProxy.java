package loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento{
    private BigDecimal valor;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
        this.valor = orcamento.getValor();
    }

    @Override
    public BigDecimal getValor() {
        if (valor == null){
            valor = orcamento.getValor();
        }
        return valor;
    }
}
