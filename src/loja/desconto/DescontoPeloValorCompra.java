package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoPeloValorCompra extends Desconto {

    public DescontoPeloValorCompra(Desconto proximo) {
        super(proximo);
    }

//    public BigDecimal calcular(Orcamento orcamento){
//        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
//            return orcamento.getValor().multiply(new BigDecimal("0.15"));
//        }
//        return proximo.calcular(orcamento);
//    }

    @Override
    protected boolean verificarDesconto(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

    @Override
    protected BigDecimal aplicarDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.15"));
    }
}
