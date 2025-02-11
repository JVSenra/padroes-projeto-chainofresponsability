package chainofresponsability;

public class TipoServicoChamado implements TipoServico{
    private static TipoServicoChamado tipoServicoChamado = new TipoServicoChamado();

    private TipoServicoChamado() {};

    public static TipoServicoChamado getTipoServicoChamado() {
        return tipoServicoChamado;
    }
}
