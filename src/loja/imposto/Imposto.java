package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private final Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    public abstract BigDecimal impostoaSerAplicado(Orcamento orcamento);

    protected BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = impostoaSerAplicado(orcamento);
        BigDecimal outroImposto = BigDecimal.ZERO;
        if (outro != null){
            outroImposto = outro.impostoaSerAplicado(orcamento);
        }
        return valorImposto.add(outroImposto);
    }
}
