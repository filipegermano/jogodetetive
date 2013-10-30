package bean;

import excecoes.DicaInvalidaException;

/**
 * @author Filipe e Magdiel Bruno
 * Classe dica contém os atributos de dica
 */
public class Dicas {

    private String dica;

    /**
     *Construtos da classe

* 
     */
    public Dicas(String dica) throws DicaInvalidaException {
        setDica(dica);
    }

    /**
     * Serviço responsável por alterar a dica
     * 
     */
    public void setDica(String dica) throws DicaInvalidaException {
        if ((dica == null) || (dica.length() < 5)) {
            throw new DicaInvalidaException("Dica deve conter no minimo 5 caracteres");
        }
        this.dica = dica;
    }

    /**
     * Retorna a dica
     * @return 
     */
    public String getDica() {
        return this.dica;
    }

    @Override
    public String toString() {
        return this.dica;
    }
}
