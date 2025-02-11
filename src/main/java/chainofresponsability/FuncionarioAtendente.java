package chainofresponsability;

public class FuncionarioAtendente extends Funcionario{
    public FuncionarioAtendente(Funcionario superior) {
        listaDocumentos.add(TipoServicoChamado.getTipoServicoChamado());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}
