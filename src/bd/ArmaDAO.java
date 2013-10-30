package bd;

import bean.Armas;
import bean.Dicas;
import excecoes.DicaInvalidaException;
import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe e Magdiel Bruno
 * Essa classe contém tudo que gerencia as armas no banco de dados
 */
public class ArmaDAO {

    private Connection connection;
    private ConexaoBd conexaoBd;

    /**
     * Construtor da Classe
     */
    public ArmaDAO() {
        conexaoBd = new ConexaoBd();
    }

    
    /**
     * Serviço responsável por inserir a arma cadastrada no banco
     *  
     */
    public void salvaArma(Armas nova) throws SQLException, ClassNotFoundException {
        String sql = "insert into arma (nome, classificacao, imagem) values (?, ?, ?) returning id";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, nova.getNome());
        pst.setString(2, nova.getClassific());
        pst.setString(3, nova.getImagem());
        ResultSet rs = pst.executeQuery();

        int idGeradoArma = 0;
        if (rs.next()) {
            idGeradoArma = rs.getInt(1);
        }

        rs.close();
        pst.close();
        connection.close();
        //salva as dicas da arma
        addDicaArmas(nova.getDicaArmas(), idGeradoArma);
    }

    
    /**
     * 
     * Adiciona as dicas de arma ao banco
     */
    private void addDicaArmas(List<Dicas> listaDicas, int idArma) throws SQLException, ClassNotFoundException {

        String sql = "insert into dica_arma (dica, id_arma) values (?, ?)";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(sql);

        for (Dicas dica : listaDicas) {
            pst.setString(1, dica.getDica());
            pst.setInt(2, idArma);
            pst.execute();
        }
        pst.close();
        connection.close();
    }
    
    /**
     * 
     * Retorna a lista de armas cadastradas
     */

    public List<Armas> listaTodasArmas() throws SQLException, ClassNotFoundException, NomeInvalidoException, ImagemInvalidaException, DicaInvalidaException {
        List<Armas> listaArmas = new ArrayList<Armas>();
        String query = "select * from arma";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            int id = rs.getInt(1);
            String nome = rs.getString(2);
            String classificacao = rs.getString(3);
            String imagem = rs.getString(4);
            Armas arma = new Armas(nome, imagem, classificacao, listaTodasDicasArmas(id));

            listaArmas.add(arma);
        }
        rs.close();
        pst.close();
        connection.close();
        return listaArmas;
    }

    /**
     * 
     * Retorna a lista de dicas de armas cadastradas
     */
    private List<Dicas> listaTodasDicasArmas(int idArma) throws SQLException, ClassNotFoundException, DicaInvalidaException {
        List<Dicas> listaDicas = new ArrayList<Dicas>();
        String query = "select dica from dica_arma where id_arma = (?)";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(query);
        pst.setInt(1, idArma);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            String valorDica = rs.getString(1);
            Dicas dica = new Dicas(valorDica);
            listaDicas.add(dica);
        }
        rs.close();
        connection.close();
        return listaDicas;
    }
}
