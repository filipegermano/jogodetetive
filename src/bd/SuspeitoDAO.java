package bd;

import bean.Dicas;
import bean.Suspeito;
import excecoes.DicaInvalidaException;
import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import excecoes.ProfissaoInvalidaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe e Magdiel
 * Classe que realiza o gerenciamento do Banco de Dados, a respeito do Suspeito
 */
public class SuspeitoDAO {

    private Connection connection;
    private ConexaoBd conexaoBd;

    /**
     * Construtor da classe
     */
    public SuspeitoDAO() {
        conexaoBd = new ConexaoBd();
    }

    /**
     * Classe responsável por inserir os suspeito no banco de dados
     * 
     */
    public void salvaSuspeito(Suspeito novo) throws SQLException, ClassNotFoundException {
        String sql = "insert into suspeito (nome, profissao, imagem) values (?, ?, ?) returning id";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, novo.getNome());
        pst.setString(2, novo.getProfissao());
        pst.setString(3, novo.getImagem());
        ResultSet rs = pst.executeQuery();

        int idGeradoSuspeito = 0;
        if (rs.next()) {
            idGeradoSuspeito = rs.getInt(1);
        }

        rs.close();
        pst.close();
        connection.close();
        //salva as dicas do Suspeito
        addDicaSuspeito(novo.getDicaSuspeito(), idGeradoSuspeito);
    }

    /**
     * Adiciona as dicas de suspeito ao banco de dados
     * 
     */
    private void addDicaSuspeito(List<Dicas> listaDicas, int idSuspeito) throws SQLException, ClassNotFoundException {
        String sql = "insert into dica_suspeito (dica, id_suspeito) values (?, ?)";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(sql);

        for (Dicas dica : listaDicas) {
            pst.setString(1, dica.getDica());
            pst.setInt(2, idSuspeito);
            pst.execute();
        }
        pst.close();
        connection.close();
    }

    /**
     * Retorna a lista de suspeitos cadastrados no banco
     *  
     */
    public List<Suspeito> listaTodosSuspeitos() throws SQLException, ClassNotFoundException, NomeInvalidoException, ImagemInvalidaException, DicaInvalidaException, ProfissaoInvalidaException {
        List<Suspeito> listaSuspeito = new ArrayList<Suspeito>();
        String query = "select * from suspeito";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            int id = rs.getInt(1);
            String nome = rs.getString(2);
            String profissao = rs.getString(3);
            String imagem = rs.getString(4);
            Suspeito suspeito = new Suspeito(nome, imagem, profissao, listaTodasDicasSuspeitos(id));
            listaSuspeito.add(suspeito);
        }
        rs.close();
        pst.close();
        connection.close();
        return listaSuspeito;
    }

    /**
     * Recupera a lista de dicas de suspeitos cadastradas no banco
     * 
     */
    public List<Dicas> listaTodasDicasSuspeitos(int idSuspeito) throws SQLException, ClassNotFoundException, DicaInvalidaException {
        List<Dicas> listaDicas = new ArrayList<Dicas>();
        String query = "select dica from dica_suspeito where id_suspeito = (?)";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(query);
        pst.setInt(1, idSuspeito);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            String valorDica = rs.getString(1);
            Dicas dica = new Dicas(valorDica);
            listaDicas.add(dica);
        }
        rs.close();
        pst.close();
        connection.close();
        return listaDicas;
    }
}
