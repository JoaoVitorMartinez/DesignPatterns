package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQuantidadeItens extends Desconto{


    public DescontoQuantidadeItens(Desconto proximo) {
        super(proximo);
    }

//    public BigDecimal calcular(Orcamento orcamento) {
//        if (orcamento.getQtdItens() > 4) {
//            return orcamento.getValor().multiply(new BigDecimal("0.1"));
//
//        }
//        return proximo.calcular(orcamento);
//    }

    @Override
    protected boolean verificarDesconto(Orcamento orcamento) {
        return orcamento.getQtdItens() > 4;
    }

    @Override
    protected BigDecimal aplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}

