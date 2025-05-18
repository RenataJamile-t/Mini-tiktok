public class CurtidaServico implements ReacaoServico {
    @Override
    public void reagir(Video video, Reacao reacao) {
        if ("Curtir".equals(reacao.getTipo())) {
            video.adicionarReacao(reacao);
        }
    }
}
