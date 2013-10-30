package jogo;

import bean.Armas;
import bean.Dicas;
import bean.Local;
import bean.Suspeito;
import cadastro.Cadastro;
import excecoes.DicaInvalidaException;
import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import excecoes.ProfissaoInvalidaException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Filipe e Magdiel
 */
public class Jogo {

    private Cenario cen;
    Cadastro cadastro;

    /**
     * Construtor da cl
     */
    public Jogo() {
    }

    /**
     * Serviço responsável pelo sirteio do cenário
     * 
     */
    public Cenario sorteiaCenario() throws ClassNotFoundException, SQLException, ClassNotFoundException, NomeInvalidoException, ImagemInvalidaException, DicaInvalidaException, ProfissaoInvalidaException {

        Cadastro cad = new Cadastro();

        Random suspeito = new Random();
        Random arma = new Random();
        Random local = new Random();

        Suspeito s = (Suspeito) cad.recuperaTodosSuspeitos().get(suspeito.nextInt(cad.recuperaTodosSuspeitos().size()));
        Armas a = (Armas) cad.recuperaTodosArmas().get(arma.nextInt(cad.recuperaTodosArmas().size()));
        Local l = (Local) cad.recuperaTodosLocais().get(local.nextInt(cad.recuperaTodosLocais().size()));

        cen = new Cenario(s, a, l);
        return cen;
    }

   /**
    * Retorna a lista de dicas do suspeito
    */
    public List<Dicas> listaDicasSuspeito() throws ProfissaoInvalidaException, DicaInvalidaException, ImagemInvalidaException, ClassNotFoundException, SQLException, ImagemInvalidaException, NomeInvalidoException {
        List<Dicas> listaDicasSuspeito = new ArrayList<Dicas>();
        listaDicasSuspeito.addAll(cen.getDicasSuspeito());
        return listaDicasSuspeito;
    }

    /**
    * Retorna a lista de dicas da arma
    */
    public List<Dicas> listaDicasArmas() throws ProfissaoInvalidaException, DicaInvalidaException, ImagemInvalidaException, ClassNotFoundException, SQLException, ImagemInvalidaException, NomeInvalidoException {
        List<Dicas> listaDicasArmas = new ArrayList<Dicas>();
        listaDicasArmas.addAll(cen.getDicasArmas());
        return listaDicasArmas;
    }

    /**
    * Retorna a lista de dicas do local
    */
    public List<Dicas> listaDicasLocal() throws ProfissaoInvalidaException, DicaInvalidaException, ImagemInvalidaException, ClassNotFoundException, SQLException, ImagemInvalidaException, NomeInvalidoException {
        List<Dicas> listaDicasLocal = new ArrayList<Dicas>();
        listaDicasLocal.addAll(cen.getDicasLocal());
        return listaDicasLocal;
    }

    /**
     * Retorna a dica de suspeito sorteada
     *  
     */
    public Dicas getSorteiaDicaSuspeito() throws ProfissaoInvalidaException, DicaInvalidaException, SQLException, ImagemInvalidaException, ClassNotFoundException, NomeInvalidoException {
        Random dicaSuspeito = new Random();
        int i = dicaSuspeito.nextInt(listaDicasSuspeito().size());
        Dicas dica = listaDicasSuspeito().get(i);
        cen.setDicasSuspeito(i);
        return dica;
    }

    /**
     * Retorna a dica de arma sorteada
     *  
     */
    public Dicas getSorteiaDicaArma() throws ProfissaoInvalidaException, DicaInvalidaException, SQLException, ImagemInvalidaException, ClassNotFoundException, NomeInvalidoException {
        Random dicaArma = new Random();
        int i = dicaArma.nextInt(listaDicasArmas().size());
        Dicas dica = listaDicasArmas().get(i);
        cen.setDicasArmas(i);
        return dica;
    }

    /**
     * Retorna a dica de local sorteada
     *  
     */
    public Dicas getSorteiaDicaLocal() throws ProfissaoInvalidaException, DicaInvalidaException, SQLException, ImagemInvalidaException, ClassNotFoundException, NomeInvalidoException {
        Random dicaLocal = new Random();
        int i = dicaLocal.nextInt(listaDicasLocal().size());
        Dicas dica = listaDicasLocal().get(i);
        cen.setDicasLocal(i);
        return dica;
    }

    /**
     * Retorna uma dica aleatório, sendo que o serviço reutiliza os serviços de sorteio de dicas, 
     * o sorteio é realizado entre 3 números (de 0 a 2), e assim utiliza-se as condições e retorna-se a dica
     *  
     */
    public Dicas getSorteioAleatorio() throws ProfissaoInvalidaException, SQLException, DicaInvalidaException, ImagemInvalidaException, ImagemInvalidaException, ClassNotFoundException, NomeInvalidoException {
        Random dicaAleatoria = new Random();
        int i = dicaAleatoria.nextInt(2);
        if ((i == 0) && (cen.getDicasSuspeito().size() > 1)) {
            return getSorteiaDicaSuspeito();
        } else if ((((i == 0) || (i == 1)) && (cen.getDicasArmas().size() > 1))) {
            return getSorteiaDicaArma();
        } else if (((i == 0) || (i == 1) || (i == 2)) && (cen.getDicasLocal().size() > 1)) {
            return getSorteiaDicaLocal();
        } else {
            throw new DicaInvalidaException("Todas as suas dicas esgotaram");
        }
    }

    /**
     * Serviço responsável por comparar o cenário sorteado com o palpite do jogador
     *  
     */
    public boolean getPalpite(Suspeito suspeito, Armas arma, Local local) throws SQLException, ClassNotFoundException, NomeInvalidoException, ImagemInvalidaException, DicaInvalidaException, ProfissaoInvalidaException {

        if (cen.getSuspeito().getNome().equals(suspeito.getNome())
                && cen.getArma().getNome().equals(arma.getNome())
                && cen.getLocal().getNome().equals(local.getNome())) {
            return true;
        }
        return false;
    }
}