package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Filipe Germano & Magdiel Bruno
 */


/**
 * Classe de Conexão com o Banco de Dados
 * 
 */
public class ConexaoBd {

    private String driver, path, login, senha;
    private Connection conexao;
    private static ConexaoBd instancia;

    /**
     * Construtor da classe 
     * 
     * Conexão com Banco de Dados PostgreSQL
     * Biblioteca para Java 6
     * 
     */    
    
    public ConexaoBd() {
        this.driver = "org.postgresql.Driver";
        this.path = "jdbc:postgresql://localhost:5432/Data";
        this.login = "postgres";
        this.senha = "123456";
    }
    
    
    /**
     * Conexão com Banco de Dados Firebird
     * 
     * Bibloteca para Java 6
     */
    
//    public ConexaoBd() {
//        this.driver = "org.firebirdsql.jdbc.FBDriver";
//        this.path = "jdbc:firebirdsql:localhost/3050:F:/DATA.FDB";
//        this.login = "SYSDBA";
//        this.senha = "masterkey";
//    }   
    
      
    public static ConexaoBd newInstance() {
        if (instancia == null) {
            instancia = new ConexaoBd();
        }
        return instancia;
    }

    public Connection createConnection() throws SQLException, ClassNotFoundException {
        Class.forName(this.driver);
        return DriverManager.getConnection(path, login, senha);
    }
}
