import java.util.List;

public class FeedServico {
   public void exibirFeed(List<Video> videos) {
        for (Video video : videos) {
            System.out.println("--------------------------");
            System.out.println("Vídeo: " + video.getTitulo());
            System.out.println("Dono: " + video.getDono().getNome());
            System.out.println("Reações:");
            for (Reacao reacao : video.getReacoes()) {
                System.out.println("- " + reacao.getTipo() + " por " + reacao.getUsuario().getNome());
            }
            System.out.println("Comentários:");
            for (Comentario comentario : video.getComentarios()) {
                System.out.println("- " + comentario.getUsuario().getNome() + ": " + comentario.getMensagem());
            }
        }
    }
}
