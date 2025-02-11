package chainofresponsability;

public class TipoServicoAquisicao implements TipoServico{
    private static TipoServicoAquisicao tipoServicoAquisicao = new TipoServicoAquisicao();

    private TipoServicoAquisicao() {};

    public static TipoServicoAquisicao getTipoServicoAquisicao() {
        return tipoServicoAquisicao;
    }
}
