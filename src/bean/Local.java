package bean;

import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import java.util.List;

/**
 * 
 * @author Filipe e Magdiel Bruno
 * Classe Local contém todos atributos específicos de local e os atributos comuns herdados da classe Objeto Cenário
 */
public class Local extends ObjetoCenario {

    private String classific;
    private List<Dicas> dicas;

    /**
     * Construtor da classe
     *  
     */
    public Local(String nome, String imagem, String classific, List<Dicas> dicas) throws NomeInvalidoException, ImagemInvalidaException {
        super(nome, imagem);
        this.classific = classific;
        this.dicas = dicas;
    }

    /**
     * Retorna uma lista com todas as dicas de local
     * @return 
     */
    public List<Dicas> getDicaLocal() {
        return this.dicas;
    }

    /**
     * Retorna a classificação do local 
     * @return 
     */
    public String getClassific() {
        return this.classific;
    }

    /**
     * Retorna uma string com o toString de ObjetoCenario e a classificação do local
     * @return 
     */
    @Override
    public String toString() {
        return String.format("%s - %s", super.toString(), this.classific);
    }
}
