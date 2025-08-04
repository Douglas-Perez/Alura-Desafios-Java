package Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.Strictness;


public class main {

    public static void main(String[] args) {
        String jsonPessoa = """
            {
                "nome": "Felipe",
                "cidade": "Rio de Janeiro"
            }
            """;

        String jsonLivro = """
            {
                "titulo": "Mistborn: O Império Final",
                "autor": "Brandon Sanderson",
                "editora": {
                    "nome": "Trama",
                    "cidade": "Rio de Janeiro"
                }
            }
            """;

        Gson gson = new GsonBuilder().setStrictness(Strictness.LENIENT).create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Pessoa: " + pessoa);
        System.out.println("Objeto Livro: "+ livro);

    }
}

