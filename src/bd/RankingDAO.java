package bd;

import bean.Jogador;
import excecoes.NomeInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe Germano & Magdiel Bruno
 * Classe responsável pelo gerenciamento do ranking no banco de dados
 */
public class RankingDAO {

    private Connection connection;
    private ConexaoBd conexaoBd;

    public RankingDAO() {
        conexaoBd = new ConexaoBd();
    }

    /**
     * Inserir no ranking o nome e pontos dos jogadores que ganham o jogo
     *  
     */
    public void salvaRanking(Jogador novo) throws SQLException, ClassNotFoundException {
        String sql = "insert into ranking (jogador, pontos) values (?, ?)";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, novo.getNome());
        pst.setInt(2, novo.getPontos());
        pst.execute();
        connection.close();
    }

    /**
     * Recupera a lista de jogadores que ganharam o jogo, com os nomes e pontos
     *  
     */
    public List<Jogador> listaRanking() throws SQLException, ClassNotFoundException, NomeInvalidoException {
        List<Jogador> listaRanking = new ArrayList<Jogador>();
        String query = "select * from ranking ORDER by pontos DESC";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            String jogador = rs.getString(2);
            int pontos = rs.getInt(3);
            Jogador jog = new Jogador(jogador, pontos);

            listaRanking.add(jog);
        }
        rs.close();
        pst.close();
        connection.close();
        return listaRanking;
    }
}