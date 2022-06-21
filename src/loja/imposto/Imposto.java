package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcularImposto(Orcamento orcamento);
}
