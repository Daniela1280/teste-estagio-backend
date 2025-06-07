package api;

import java.util.HashMap;
import java.util.Map;

public class ViaCepService {
    public static Map<String, String> buscarEnderecoPorCep(String cep) {
        Map<String, String> endereco = new HashMap<>();
        endereco.put("cep", cep);
        endereco.put("logradouro", "Rua Exemplo");
        endereco.put("bairro", "Centro");
        endereco.put("localidade", "São Paulo");
        endereco.put("uf", "SP");
        return endereco;
    }
}