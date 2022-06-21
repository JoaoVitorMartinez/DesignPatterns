package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected  BigDecimal calcular(Orcamento orcamento){
        if(verificarDesconto(orcamento)){
            return aplicarDesconto(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    protected abstract boolean verificarDesconto(Orcamento orcamento);

    protected abstract BigDecimal aplicarDesconto(Orcamento orcamento);




}
