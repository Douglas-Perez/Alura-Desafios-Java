package tryCatch;

public class ErroConsultaGitHub extends  RuntimeException {

    public ErroConsultaGitHub(String mensagem) {
        super(mensagem);
    }
}
