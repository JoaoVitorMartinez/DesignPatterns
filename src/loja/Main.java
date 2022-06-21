package loja;

import loja.desconto.CalculadoraDescontos;
import loja.imposto.CalculadoraImposto;
import loja.imposto.ICMS;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){

        // Testando impostos
        Orcamento orcamentoImposto = new Orcamento(new BigDecimal("100"), 5);
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

        System.out.println(calculadoraImposto.calcular(orcamentoImposto, new ICMS()));

        // Testando Descontos
        Orcamento orcamentoDesconto = new Orcamento(new BigDecimal("1000"), 2);
        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();

        System.out.println(calculadoraDescontos.calcular(orcamentoDesconto));

    }
}
