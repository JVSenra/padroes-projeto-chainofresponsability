package chainofresponsability;

public class TipoServicoLimpeza implements TipoServico{
    private static TipoServicoLimpeza tipoServicoLimpeza = new TipoServicoLimpeza();

    private TipoServicoLimpeza() {};

    public static TipoServicoLimpeza getTipoServicoLimpeza() {
        return tipoServicoLimpeza;
    }
}
