package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaximo extends Desconto{

    public DescontoMaximo(Desconto proximo) {
        super(proximo);
    }


    public BigDecimal calcular(Orcamento orcamento) {
        if((orcamento.getValor().compareTo(new BigDecimal("1000")) > 0 ) && orcamento.getQtdItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("10.0"));
        }
        return proximo.calcular(orcamento);
    }
}
