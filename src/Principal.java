import java.util.Arrays;
import java.util.List;

public class Principal {
     public static void main(String[] args) {
        Usuario usuario1 = new Usuario("1", "Renata");
        Usuario usuario2 = new Usuario("2", "guilherme");

        Video video1 = new Video("v1", "Meu tutorial", usuario1);

        CurtidaServico curtidaService = new CurtidaServico();
        ComentarioServico comentarioService = new ComentarioServico();
        FeedServico feedService = new FeedServico();

        curtidaService.reagir(video1, new Curtida(usuario2));
        comentarioService.adicionarComentario(video1, new Comentario(usuario2, "gostei muito!"));
        curtidaService.reagir(video1, new Compartilhamento(usuario1));
         List<Video> videos = Arrays.asList(video1);
        feedService.exibirFeed(videos);
    }
}
