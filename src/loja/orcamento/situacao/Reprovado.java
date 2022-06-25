package loja.orcamento.situacao;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento{

    public Reprovado() {
    }

    @Override
    public BigDecimal calcularDescontoExcepcional(Orcamento orcamento) {
        return super.calcularDescontoExcepcional(orcamento);
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
