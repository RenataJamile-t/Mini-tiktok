import java.util.ArrayList;
import java.util.List;

public class Video {
    private final String id;
    private final String titulo;
    private final Usuario dono;
    private final List<Reacao> reacoes = new ArrayList<>();
    private final List<Comentario> comentarios = new ArrayList<>();

    public Video(String id, String titulo, Usuario dono) {
        this.id = id;
        this.titulo = titulo;
        this.dono = dono;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Usuario getDono() {
        return dono;
    }

    public List<Reacao> getReacoes() {
        return reacoes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarReacao(Reacao reacao) {
        reacoes.add(reacao);
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

}
