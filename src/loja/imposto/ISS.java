package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{
    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
