package loja;

import loja.desconto.CalculadoraDescontos;
import loja.imposto.CalculadoraImposto;
import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.orcamento.ItemOrcamento;
import loja.orcamento.Orcamento;
import loja.orcamento.RegistroOrcamento;
import loja.orcamento.pedido.Pedido;
import loja.orcamento.pedido.PedidoCommand;
import loja.orcamento.pedido.PedidoHandler;
import loja.orcamento.pedido.acoes.EnviarEmailPedido;
import loja.orcamento.pedido.acoes.LogPedidos;
import loja.orcamento.pedido.acoes.SalvaPedido;
import loja.requisicao.http.JavaHttpClient;

//teste


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        // Testando impostos
        ItemOrcamento item1 = new ItemOrcamento(new BigDecimal("100"));
        Orcamento orcamentoImposto = new Orcamento();
        orcamentoImposto.adicionarItem(item1);
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

        System.out.println(calculadoraImposto.calcular(orcamentoImposto, new ICMS(new ISS(null))));

        // Testando Descontos
        ItemOrcamento item2 = new ItemOrcamento(new BigDecimal("1000"));
        ItemOrcamento item3 = new ItemOrcamento(new BigDecimal("1000"));
        ItemOrcamento item4 = new ItemOrcamento(new BigDecimal("1000"));
        ItemOrcamento item5 = new ItemOrcamento(new BigDecimal("1000"));
        ItemOrcamento item6 = new ItemOrcamento(new BigDecimal("1000"));
        ItemOrcamento item7 = new ItemOrcamento(new BigDecimal("1000"));
        Orcamento orcamentoDesconto = new Orcamento();
        orcamentoDesconto.adicionarItem(item2);
        orcamentoDesconto.adicionarItem(item3);
        orcamentoDesconto.adicionarItem(item4);
        orcamentoDesconto.adicionarItem(item5);
        orcamentoDesconto.adicionarItem(item6);
        orcamentoDesconto.adicionarItem(item7);
        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();

        System.out.println(calculadoraDescontos.calcular(orcamentoDesconto));
        System.out.println(orcamentoDesconto.getQtdItens()+ " " + orcamentoDesconto.getValor());


        // Aprovando e aplicando o desconto excepcional, depois mostrando o valor do orçamento
        orcamentoDesconto.aprovar();

        orcamentoDesconto.aplicarDescontoExcepcional();

        System.out.println(orcamentoDesconto.getValor());

        //Criando um pedido

        Pedido pedido = new Pedido("João Vitor ",orcamentoDesconto, LocalDateTime.now());

        System.out.println(pedido.getOrcamento());

        //Criando pedido com commandHandler e Observer
        PedidoCommand pedidoCommand = new PedidoCommand("Juliana", item3);
        PedidoHandler handler = new PedidoHandler(Arrays.asList(new EnviarEmailPedido(),new SalvaPedido(), new LogPedidos()));

        handler.execute(pedidoCommand);

        //Requisição HTTP

        RegistroOrcamento registrarOrcamento = new RegistroOrcamento(new JavaHttpClient());

        registrarOrcamento.registrar(orcamentoDesconto);

    }
}
