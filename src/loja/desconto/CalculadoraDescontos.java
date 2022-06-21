package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDescontos {

    public CalculadoraDescontos() {

    }

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoMaximo(new DescontoPeloValorCompra(new DescontoQuantidadeItens(new SemDesconto())));
        return desconto.calcular(orcamento);
    }
}
