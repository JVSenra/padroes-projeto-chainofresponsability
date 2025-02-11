package chainofresponsability;

public class TipoServicoContratacao implements TipoServico{
    private static TipoServicoContratacao tipoServicoContratacao = new TipoServicoContratacao();

    private TipoServicoContratacao() {};

    public static TipoServicoContratacao getTipoServicoContratacao() {
        return tipoServicoContratacao;
    }
}
