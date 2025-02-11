package chainofresponsability;

public class Servico {
    private TipoServico tipoServico;

    public Servico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoDocumento(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }
}
