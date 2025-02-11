package chainofresponsability;

public class FuncionarioCEO extends Funcionario {
    public FuncionarioCEO(Funcionario superior) {
        listaDocumentos.add(TipoServicoAquisicao.getTipoServicoAquisicao());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "CEO";
    }
}
