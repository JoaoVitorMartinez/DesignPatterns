package loja.orcamento;

import loja.requisicao.http.HttpAdapter;

import java.net.http.HttpRequest;
import java.util.Map;

public class RegistroOrcamento {
    private HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        String url = "https://cursos.alura.com.br/";
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQtdItens());

        http.post(url, dados);
    }
}
