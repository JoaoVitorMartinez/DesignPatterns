package loja;

import loja.desconto.CalculadoraDescontos;
import loja.imposto.CalculadoraImposto;
import loja.imposto.ICMS;
import loja.orcamento.Orcamento;
import loja.orcamento.pedido.Pedido;
import loja.orcamento.pedido.PedidoCommand;
import loja.orcamento.pedido.PedidoHandler;
import loja.orcamento.pedido.acoes.EnviarEmailPedido;
import loja.orcamento.pedido.acoes.SalvaPedido;

//teste


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

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


        // Aprovando e aplicando o desconto excepcional, depois mostrando o valor do orçamento
        orcamentoDesconto.aprovar();

        orcamentoDesconto.aplicarDescontoExcepcional();

        System.out.println(orcamentoDesconto.getValor());

        //Criando um pedido

        Pedido pedido = new Pedido("João Vitor ",orcamentoDesconto, LocalDateTime.now());

        System.out.println(pedido.getOrcamento());

        //Criando pedido com commandHandler e Observer
        PedidoCommand pedidoCommand = new PedidoCommand("Juliana", new BigDecimal("2000"), 10);
        PedidoHandler handler = new PedidoHandler(Arrays.asList(new EnviarEmailPedido(),new SalvaPedido()));

        handler.execute(pedidoCommand);

    }
}
