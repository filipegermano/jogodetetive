package bean;

import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;

/**
 * Projeto apresentado a disciplina de Programção Orientada a Objetos,
 * do curso de Análise e Desenvolvimento de Sistemas, no IFPB-Campus Cajazeiras
 * @author Filipe e Magdiel Bruno
 */
public class ObjetoCenario {

    private String nome, imagem;

    /**
     * Construtor da classe
     * 
     */
    public ObjetoCenario(String nome, String imagem) throws NomeInvalidoException, ImagemInvalidaException {
        setNome(nome);
        setImagem(imagem);
    }

    /**
     * Retorna o nome 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Serviço responsável por alterar o atributo nome
     *  
     */
    public void setNome(String nome) throws NomeInvalidoException {
        if ((nome == null) || (nome.length() == 0)) {
            throw new NomeInvalidoException("Campo Nome é obrigatório!");
        }
        this.nome = nome;
    }

    /**
     * Returna o caminho da imagem
     * 
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * Altera o caminho da imagem
     *  
     */
    public void setImagem(String imagem) throws ImagemInvalidaException {
        if ((imagem == null) || (imagem.length() == 0)) {
            throw new ImagemInvalidaException("Imagem é obrigatória!");
        }
        this.imagem = imagem;
    }

    
    @Override
    public String toString() {
        return String.format("%s", this.nome);
    }
}
