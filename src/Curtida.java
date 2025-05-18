public class Curtida implements  Reacao {
   private final Usuario usuario;

    public Curtida(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getTipo() {
        return "Curtir";
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }
}
