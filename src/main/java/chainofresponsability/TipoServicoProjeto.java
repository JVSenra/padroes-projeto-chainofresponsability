package chainofresponsability;

public class TipoServicoProjeto implements TipoServico{
    private static TipoServicoProjeto tipoServicoProjeto = new TipoServicoProjeto();

    private TipoServicoProjeto() {};

    public static TipoServicoProjeto getTipoServicoProjeto() {
        return tipoServicoProjeto;
    }
}
