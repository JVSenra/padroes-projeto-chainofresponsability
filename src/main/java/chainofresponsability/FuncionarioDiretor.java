package chainofresponsability;

public class FuncionarioDiretor extends Funcionario{
    public FuncionarioDiretor(Funcionario superior) {
        listaDocumentos.add(TipoServicoProjeto.getTipoServicoProjeto());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}
