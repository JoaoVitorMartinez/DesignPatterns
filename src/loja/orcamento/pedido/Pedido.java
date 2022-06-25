package loja.orcamento.pedido;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido {

    private String cliente;
    private Orcamento orcamento;
    private LocalDateTime data;



    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Pedido(String cliente, Orcamento orcamento, LocalDateTime data){
        this.cliente = cliente;
        this.orcamento = orcamento;
        this.data = data;


    }

    public String getCliente() {
        return cliente;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
