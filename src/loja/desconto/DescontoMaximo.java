package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaximo extends Desconto{

    public DescontoMaximo(Desconto proximo) {
        super(proximo);
    }


//    public BigDecimal calcular(Orcamento orcamento) {
//
//            return ;
//        }
//        return proximo.calcular(orcamento);
//    }

    @Override
    protected boolean verificarDesconto(Orcamento orcamento) {
        return orcamento.getValor().intValue() > 999 && orcamento.getQtdItens() > 5;
    }

    @Override
    protected BigDecimal aplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.2"));
    }
}
