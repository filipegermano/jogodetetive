package bd;

import bean.Dicas;
import bean.Local;
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
 * @author Filipe e Magdiel
 * Classe responsável pelo gerenciamento o banco a respeito do local do crime
 */
public class LocalDAO {

    private Connection connection;
    private ConexaoBd conexaoBd;

    /**
     * Construtor da classe
     */
    public LocalDAO() {
        conexaoBd = new ConexaoBd();
    }

    /**
     * 
     * Inserir local no banco 
     */
    public void salvaLocal(Local nova) throws SQLException, ClassNotFoundException {
        String sql = "insert into local (nome, classificacao, imagem) values (?, ?, ?) returning id";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, nova.getNome());
        pst.setString(2, nova.getClassific());
        pst.setString(3, nova.getImagem());
        ResultSet rs = pst.executeQuery();

        int idGeradoLocal = 0;
        if (rs.next()) {
            idGeradoLocal = rs.getInt(1);
        }

        rs.close();
        pst.close();
        connection.close();
        //salva as dicas do local
        addDicaLocal(nova.getDicaLocal(), idGeradoLocal);
    }

    /**
     * Cadastrar as dicas de local
     * 
     */
    private void addDicaLocal(List<Dicas> listaDicas, int idLocal) throws SQLException, ClassNotFoundException {
        String sql = "insert into dica_local (dica, id_local) values (?, ?)";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(sql);

        for (Dicas dica : listaDicas) {
            pst.setString(1, dica.getDica());
            pst.setInt(2, idLocal);
            pst.execute();
        }
        pst.close();
        connection.close();
    }

    /**
     * Recupera a lista de locais existentes no banco de dados
     * 
     */
    public List<Local> listaTodosLocais() throws SQLException, ClassNotFoundException, NomeInvalidoException, ImagemInvalidaException, DicaInvalidaException {
        List<Local> listaLocal = new ArrayList<Local>();
        String query = "select * from local";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            int id = rs.getInt(1);
            String nome = rs.getString(2);
            String classificacao = rs.getString(3);
            String imagem = rs.getString(4);
            Local local = new Local(nome, imagem, classificacao, listaTodasDicasLocal(id));
            listaLocal.add(local);
        }
        rs.close();
        pst.close();
        connection.close();
        return listaLocal;
    }

    /**
     * Recupera a lista de dicas de local cadastradas
     * 
     */
    private List<Dicas> listaTodasDicasLocal(int idLocal) throws SQLException, ClassNotFoundException, DicaInvalidaException {
        List<Dicas> listaDicas = new ArrayList<Dicas>();
        String query = "select dica from dica_local where id_local = (?)";
        connection = this.conexaoBd.createConnection();
        PreparedStatement pst = connection.prepareStatement(query);
        pst.setInt(1, idLocal);
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
