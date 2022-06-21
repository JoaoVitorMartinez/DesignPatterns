package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {


    public SemDesconto() {
        super(null);
    }

//    public BigDecimal calcular(Orcamento orcamento){
//        return BigDecimal.ZERO;
//    }

    @Override
    protected boolean verificarDesconto(Orcamento orcamento) {
        return true;
    }

    @Override
    protected BigDecimal aplicarDesconto(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
