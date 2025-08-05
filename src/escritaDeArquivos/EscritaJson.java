package escritaDeArquivos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscritaJson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Titulo titulo = new Titulo("Interstellar", 2014, "Christopher Nolan");

        String json = gson.toJson(titulo);

        System.out.println(json);
    }
}
