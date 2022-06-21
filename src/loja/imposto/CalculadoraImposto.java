package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcularImposto(orcamento);
        }

    }
