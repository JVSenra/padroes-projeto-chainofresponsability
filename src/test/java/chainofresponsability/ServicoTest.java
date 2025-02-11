package chainofresponsability;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoTest {
    FuncionarioCEO ceo;
    FuncionarioDiretor diretor;
    FuncionarioGerente gerente;
    FuncionarioAtendente atendente;

    @BeforeEach
    void setUp() {
        ceo = new FuncionarioCEO(null);
        diretor = new FuncionarioDiretor(ceo);
        gerente = new FuncionarioGerente(diretor);
        atendente = new FuncionarioAtendente(gerente);
    }

    @Test
    void deveRetornarAtendenteParaAprovacaoChamado() {
        assertEquals("Atendente", atendente.aprovarServico(new Servico(TipoServicoChamado.getTipoServicoChamado())));
    }

    @Test
    void deveRetornarGerenteParaAprovacaoContração() {
        assertEquals("Gerente", atendente.aprovarServico(new Servico(TipoServicoContratacao.getTipoServicoContratacao())));
    }

    @Test
    void deveRetornarDiretorParaAprovacaoProjeto() {
        assertEquals("Diretor", atendente.aprovarServico(new Servico(TipoServicoProjeto.getTipoServicoProjeto())));
    }
    @Test
    void deveRetornarCeoParaAprovacaoAquisicao() {
        assertEquals("CEO", atendente.aprovarServico(new Servico(TipoServicoAquisicao.getTipoServicoAquisicao())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAprovacaoLimpeza() {
        assertEquals("Sem aprovação", atendente.aprovarServico(new Servico(TipoServicoLimpeza.getTipoServicoLimpeza())));
    }
}

