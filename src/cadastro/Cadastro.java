package cadastro;

import bd.ArmaDAO;
import bd.LocalDAO;
import bd.RankingDAO;
import bd.SuspeitoDAO;
import bean.Armas;
import bean.Jogador;
import bean.Local;
import bean.Suspeito;
import excecoes.DicaInvalidaException;
import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import excecoes.ProfissaoInvalidaException;
import java.sql.SQLException;
import java.util.List;

/**
 * 
 * @author Filipe e Magdiel Bruno
 * Classe responsavel por realizar a interação entre as classes que gerenciam o banco de dados e as demais classes da aplicação
 */
public class Cadastro<T> {

    private ArmaDAO armaDAO;
    private LocalDAO localDAO;
    private SuspeitoDAO suspeitoDAO;
    private RankingDAO rankingDAO;

    /**
     * Construtor da classe
     *  
     */
    public Cadastro() throws ClassNotFoundException, SQLException {
    }

    /**
     * 
     * Serviço responsável pela a interação com a classa ArmaDAO
     */
    public void addArmas(Armas novo) throws SQLException, DicaInvalidaException, ClassNotFoundException {
        armaDAO = new ArmaDAO();
        if (novo.getDicaArmas().size() < 3) {
            throw new DicaInvalidaException("Deve ter no minido 3 Dicas");
        }
        armaDAO.salvaArma(novo);
    }

     /**
     * 
     * Serviço responsável pela a interação com a classa LocalDAO
     */
    public void addLocal(Local novo) throws SQLException, DicaInvalidaException, ClassNotFoundException {
        localDAO = new LocalDAO();
        if (novo.getDicaLocal().size() < 3) {
            throw new DicaInvalidaException("Deve ter no minido 3 Dicas");
        }
        localDAO.salvaLocal(novo);
    }

     /**
     * 
     * Serviço responsável pela a interação com a classa SuspeitoDAO
     */
    public void addSuspeito(Suspeito novo) throws SQLException, DicaInvalidaException, ClassNotFoundException {
        suspeitoDAO = new SuspeitoDAO();
        if (novo.getDicaSuspeito().size() < 3) {
            throw new DicaInvalidaException("Deve ter no minido 3 Dicas");
        }
        suspeitoDAO.salvaSuspeito(novo);
    }

     /**
     * 
     * Serviço responsável pela a interação com a classa RankingDAO
     */
    public void addRanking(Jogador novo) throws SQLException, DicaInvalidaException, ClassNotFoundException {
        rankingDAO = new RankingDAO();
        rankingDAO.salvaRanking(novo);
    }

    /**
     * Retorna a lista de todos os suspeitos
     * 
     */
    public List<Suspeito> recuperaTodosSuspeitos() throws SQLException, ClassNotFoundException, NomeInvalidoException, ImagemInvalidaException, DicaInvalidaException, ProfissaoInvalidaException {
        SuspeitoDAO suspeito = new SuspeitoDAO();
        return suspeito.listaTodosSuspeitos();
    }

    /**
     * Retorna a lista de todos as armas
     * 
     */
    public List<Armas> recuperaTodosArmas() throws SQLException, ClassNotFoundException, NomeInvalidoException, ImagemInvalidaException, DicaInvalidaException, ProfissaoInvalidaException {
        ArmaDAO armas = new ArmaDAO();
        return armas.listaTodasArmas();
    }

    /**
     * Retorna a lista de todos os locais
     * 
     */
    public List<Local> recuperaTodosLocais() throws SQLException, ClassNotFoundException, NomeInvalidoException, ImagemInvalidaException, DicaInvalidaException, ProfissaoInvalidaException {
        LocalDAO local = new LocalDAO();
        return local.listaTodosLocais();
    }

    /**
     * Retorna a lista de todos os jogadores que venceram o jogo, com suas respectivas pontuações
     * 
     */
    public List<Jogador> recuperaRanking() throws SQLException, ClassNotFoundException, NomeInvalidoException, ImagemInvalidaException, DicaInvalidaException, ProfissaoInvalidaException {
        RankingDAO ranking = new RankingDAO();

        return ranking.listaRanking();
    }
}
