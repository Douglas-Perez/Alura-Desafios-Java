package escritaDeArquivos;

import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivo {
    public static void main(String[] args) {
        String texto = "Conteúdo a ser gravado no arquivo.";

        try {
            FileWriter writer = new FileWriter("arquivo.txt");
            writer.write(texto);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
