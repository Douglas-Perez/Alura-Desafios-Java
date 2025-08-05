package escritaDeArquivos;

import com.google.gson.Gson;

public class EscritaJson {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Titulo titulo = new Titulo("Interstellar", 2014, "Christopher Nolan");

        String json = gson.toJson(titulo);

        System.out.println(json);
    }
}
