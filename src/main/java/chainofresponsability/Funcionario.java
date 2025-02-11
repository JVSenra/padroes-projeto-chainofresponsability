package chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaDocumentos = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarServico(Servico servico) {
        if (listaDocumentos.contains(servico.getTipoServico())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.aprovarServico(servico);
            }
            else
            {
                return "Sem aprovação";
            }
        }
    }
}