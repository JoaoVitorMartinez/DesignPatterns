package loja.requisicao.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter{
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection connection = urlDaApi.openConnection();
            connection.connect();
            System.out.println("Conexão HTTP aberta");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisicao HTTP");
        }

    }
}
