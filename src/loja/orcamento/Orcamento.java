package loja.orcamento;

import loja.orcamento.situacao.EmAnalise;
import loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel{

    private BigDecimal valor;
    private List<Orcavel> itens;
    private SituacaoOrcamento situacao;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExcepcional(){
        BigDecimal valorDescontoExcepcional = this.situacao.calcularDescontoExcepcional(this);
        this.valor = this.valor.subtract(valorDescontoExcepcional);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.aprovar(this);
    }

    public void finalizar(){
        this.situacao.aprovar(this);
    }


    public BigDecimal getValor() {
        //try { Thread.sleep (2000); } catch (InterruptedException ex) {}
        return valor;
    }

    public void adicionarItem(Orcavel item){
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }


    public int getQtdItens() {
        return itens.size();
    }


    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
