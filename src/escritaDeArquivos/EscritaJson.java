package escritaDeArquivos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscritaJson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Titulo titulo = new Titulo("Interstellar", 2014, "Christopher Nolan");
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo("Santa Fe");
        veiculo.setMarca("Hyundai");
        veiculo.setAno(2016);

        String jsonTitulo = gson.toJson(titulo);
        String jsonVeiculo = gson.toJson(veiculo);

        System.out.println("Titulo:");
        System.out.println(jsonTitulo);
        System.out.println("--------------------------");
        System.out.println("Veiculo:");
        System.out.println(jsonVeiculo);


    }
}
