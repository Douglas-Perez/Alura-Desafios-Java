package Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.Strictness;


public class main {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Felipe\",\"cidade\":\"Rio de Janeiro\"}";

        Gson gson = new GsonBuilder().setStrictness(Strictness.LENIENT).create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}

