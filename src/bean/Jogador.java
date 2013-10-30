package bean;

import excecoes.NomeInvalidoException;

/**
 * @author Filipe e Magdiel Bruno
 * Classe Jogador contém os atributos de jogador nome e pontos
 */
public class Jogador {

    private String nome;
    private int pontos;

    /**
     * Construtor da classe 
     *  
     */
    public Jogador(String nome) throws NomeInvalidoException {
        setNome(nome);
        this.pontos = 75;
    }

    /**
     * 
     * Construtor que será usado no ranking, para recuperar nome e pontos 
     */
    public Jogador(String nome, int pontos) throws NomeInvalidoException {
        setNome(nome);
        this.pontos = pontos;
    }

    /**
     * Serviços responsável por alterar o nome do jogador
     *  
     */
    public void setNome(String nome) throws NomeInvalidoException {
        if ((nome == null) || (nome.length() == 0)) {
            throw new NomeInvalidoException("Campo Nome é obrigatório!");
        }
        this.nome = nome;
    }

    /**
     * Serviços responsável por decrementar 5 pontos do jogador
     */
    public void decrementaPontos() {
        this.pontos -= 5;
    }

    /**
     * Serviço responsável por incrementar vinte pontos aos pontos do jogador
     */
    public void incrementaPontos() {
        this.pontos += 20;
    }

    /**
     * Retorna o nome do jogador
     *
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * Retorna os pontos do jogador 
     */
    public int getPontos() {
        return this.pontos;
    }

    @Override
    /**
     * Retorna uma string com o nome e os pontos do jogador
     */
    public String toString() {
        return String.format("%s - %d", this.nome, this.pontos);
    }
}
