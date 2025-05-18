public class Comentario {
    private final Usuario usuario;
    private final String mensagem;

    public Comentario(Usuario usuario, String mensagem) {
        this.usuario = usuario;
        this.mensagem = mensagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getMensagem() {
        return mensagem;
    }
    
}

