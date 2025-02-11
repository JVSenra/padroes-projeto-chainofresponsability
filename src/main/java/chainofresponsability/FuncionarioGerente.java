package chainofresponsability;

public class FuncionarioGerente extends Funcionario{
    public FuncionarioGerente(Funcionario superior) {
        listaDocumentos.add(TipoServicoContratacao.getTipoServicoContratacao());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
