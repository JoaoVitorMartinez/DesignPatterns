package loja.requisicao.http;

import loja.orcamento.Orcamento;

import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String, Object> dados);
}
