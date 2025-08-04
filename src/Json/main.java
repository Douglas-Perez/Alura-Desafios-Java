package Json;

import com.google.gson.Gson;


public class main {
    public static void main(String[] args) {
        String json = """
                {
                    "nome": "Douglas",
                    "idade": 24,
                    "cidade": "São Paulo"
                }
                """;

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);
    }
}
