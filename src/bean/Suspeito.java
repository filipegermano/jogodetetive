package bean;

import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import excecoes.ProfissaoInvalidaException;
import java.util.List;

/**
 * @author Filipe e Magdiel Bruno
 * Classe suspeito contém todos atributos específicos de suspeito e os atributos comuns herdados da classe Objeto Cenário
 */
public class Suspeito extends ObjetoCenario {

    private String profissao;
    private List<Dicas> dicas;

    /**
     * Construtor da classe
     */
    public Suspeito(String nome, String imagem, String prifissao, List<Dicas> dicas) throws NomeInvalidoException, ImagemInvalidaException, ProfissaoInvalidaException {
        super(nome, imagem);
        setProfissao(prifissao);
        this.dicas = dicas;
    }

    /**
     * Altera a profissão do suspeito
     * 
     */
    public void setProfissao(String profissao) throws ProfissaoInvalidaException {
        if ((profissao == null) || (profissao.length() == 0)) {
            throw new ProfissaoInvalidaException("Campo Profissão é obrigatório!");
        }
        this.profissao = profissao;
    }

    /**
     * Retorna a profissão do suspeito
     * @return 
     */
    public String getProfissao() {
        return this.profissao;
    }

    /**
     * Retorna a lista de dicas de suspeito
     * @return 
     */
    public List<Dicas> getDicaSuspeito() {
        return this.dicas;
    }

    /**
     * Retorna uma string com o toString de ObjetoCenario e a profissão
     * @return 
     */
    @Override
    public String toString() {
        return String.format("%s - %s", super.toString(), this.profissao);
    }
}
