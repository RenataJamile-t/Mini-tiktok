public class Compartilhamento implements Reacao {
  private final Usuario usuario;

    public Compartilhamento(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getTipo() {
        return "Compartilhar";
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }
}
