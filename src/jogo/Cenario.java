package jogo;

import bean.Armas;
import bean.Dicas;
import bean.Local;
import bean.Suspeito;
import excecoes.DicaInvalidaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe e Magdiel
 * Classe responsável por instanciar o cenário do crime, ou seja, suspeito, arma  e local
 */
public class Cenario {

    private Suspeito suspeito;
    private Armas arma;
    private Local local;
    private List<Dicas> dicasArmas;
    private List<Dicas> dicasSuspeito;
    private List<Dicas> dicasLocal;

    /**
     * Construtor da classe
     * 
     */
    public Cenario(Suspeito suspeito, Armas arma, Local local) {
        this.dicasArmas = new ArrayList<Dicas>();
        this.dicasSuspeito = new ArrayList<Dicas>();
        this.dicasLocal = new ArrayList<Dicas>();

        this.dicasSuspeito.addAll(suspeito.getDicaSuspeito());
        this.dicasArmas.addAll(arma.getDicaArmas());
        this.dicasLocal.addAll(local.getDicaLocal());

        this.suspeito = suspeito;
        this.arma = arma;
        this.local = local;
    }

    
    public Cenario() {
    }

    /**
     * Retorna o suspeito do crime
     * @return 
     */
    public Suspeito getSuspeito() {
        return suspeito;
    }

    /**
     * Retorna a arma do crime
     * @return 
     */
    public Armas getArma() {
        return arma;
    }

    /**
     * Retorna o local do crime
     * @return 
     */
    public Local getLocal() {
        return local;
    }

    /**
     * Retorna as dicas do suspeito do crime
     * @return 
     */
    public List<Dicas> getDicasSuspeito() {
        return dicasSuspeito;
    }

    /**
     * Altera as dicas de suspeito
     * 
     */
    public void setDicasSuspeito(int i) throws DicaInvalidaException {
        if (this.dicasSuspeito.size() > 1) {
            this.dicasSuspeito.remove(i);
        } else {
            throw new DicaInvalidaException("Você não tem mas direito a esse tipo de dica!");
        }
    }

    /**
     * Retorna as dicas de arma do crime
     * @return 
     */
    public List<Dicas> getDicasArmas() {
        return dicasArmas;
    }

    /**
     * Altera as dicas de arma
     * 
     */
    public void setDicasArmas(int i) throws DicaInvalidaException {
        if (this.dicasArmas.size() > 1) {
            this.dicasArmas.remove(i);
        } else {
            throw new DicaInvalidaException("Você não tem mas direito a esse tipo de dica!");
        }
    }

    /**
     * Retorna as dicas do local do crime
     * @return 
     */
    public List<Dicas> getDicasLocal() {
        return dicasLocal;
    }

    /**
     * Altera as dicas de local
     * 
     */
    public void setDicasLocal(int i) throws DicaInvalidaException {
        if (this.dicasLocal.size() > 1) {
            this.dicasLocal.remove(i);
        } else {
            throw new DicaInvalidaException("Você não tem mas direito a esse tipo de dica!");
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.suspeito != null ? this.suspeito.hashCode() : 0);
        hash = 97 * hash + (this.arma != null ? this.arma.hashCode() : 0);
        hash = 97 * hash + (this.local != null ? this.local.hashCode() : 0);
        return hash;
    }

    /**
     * Serviço responsável pela comparação de cenerários
     *
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cenario other = (Cenario) obj;
        if (this.suspeito != other.suspeito && (this.suspeito == null || !this.suspeito.equals(other.suspeito))) {
            return false;
        }
        if (this.arma != other.arma && (this.arma == null || !this.arma.equals(other.arma))) {
            return false;
        }
        if (this.local != other.local && (this.local == null || !this.local.equals(other.local))) {
            return false;
        }
        return true;
    }

    /**
     * Retorna uma string com o suspeito, a arma e o local do crime
     * @return 
     */
    @Override
    public String toString() {
        return String.format("%s - %s - %s", this.suspeito, this.arma, this.local);
    }
}
