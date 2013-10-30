package bean;

import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import java.util.List;

/**
 * 
 * @author Filipe e Magdiel Bruno
 * Classe arma contém todos atributos específicos de arma e os atributos comuns herdados da classe Objeto Cenário
 */
public class Armas extends ObjetoCenario {

    private String classific;
    private List<Dicas> dicas;

    /**
     * Construtor da classe, que também herda o construtor de ObjetoCenário
     *  
     */
    public Armas(String nome, String imagem, String classific, List<Dicas> dicas) throws NomeInvalidoException, ImagemInvalidaException {
        super(nome, imagem);
        this.classific = classific;
        this.dicas = dicas;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", super.toString(), this.classific);
    }

    /**
     * Retorna a classificação da arma
     *  
     */
    public String getClassific() {
        return this.classific;
    }

    /**
     * Returna a lista de dicas de arma
     *  
     */
    public List<Dicas> getDicaArmas() {
        return this.dicas;
    }
}
