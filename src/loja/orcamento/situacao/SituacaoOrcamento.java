package loja.orcamento.situacao;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class  SituacaoOrcamento extends RuntimeException {
    public SituacaoOrcamento(String message) {
        super(message);
    }

    public SituacaoOrcamento() {

    }

    public BigDecimal calcularDescontoExcepcional(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new SituacaoOrcamento("O orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new SituacaoOrcamento("O orçamento não pode ser reprovado");

    }

    public void finalizar(Orcamento orcamento) {
        throw new SituacaoOrcamento("O orçamento não pode ser finalizado");
    }

}