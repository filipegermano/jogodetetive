package testes;

import bd.ArmaDAO;
import bd.ConexaoBd;
import bd.LocalDAO;
import bd.SuspeitoDAO;
import bean.Armas;
import bean.Dicas;
import bean.Local;
import bean.Suspeito;
import cadastro.Cadastro;
import jogo.Cenario;
import excecoes.DicaInvalidaException;
import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import excecoes.ProfissaoInvalidaException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import jogo.Jogo;

/**
 *
 * @author FILIPE
 */
public class App2 {

    public static void main(String[] args) {


        SuspeitoDAO sus = new SuspeitoDAO();
        ArmaDAO arm = new ArmaDAO();
        LocalDAO loc = new LocalDAO();
        Cenario cen;
        Cenario cen2;
        Jogo j;


        Random suspeito = new Random();
        Random arma = new Random();
        Random local = new Random();

        Suspeito s;
        Armas a;
        Local l;

        //            Suspeito s = sus.listaTodosSuspeitos().get(suspeito.nextInt(sus.listaTodosSuspeitos().size()));       
        //            Armas a = arm.listaTodasArmas().get(arma.nextInt(arm.listaTodasArmas().size()));
        //            Local l = loc.listaTodosLocais().get(local.nextInt(loc.listaTodosLocais().size()));
        try {



//
//            s = sus.listaTodosSuspeitos().get(suspeito.nextInt(sus.listaTodosSuspeitos().size()));
//            a = arm.listaTodasArmas().get(arma.nextInt(arm.listaTodasArmas().size()));
//            l = loc.listaTodosLocais().get(local.nextInt(loc.listaTodosLocais().size()));
//
//            //System.out.println(s);
//            //System.out.println(a);
//            //System.out.println(l);
//
//            cen = new Cenario(s, a, l);
//            
//            cen2 = new Cenario(s, a, l);
//            
            j = new Jogo();
            
            System.out.println(j.getSorteiaDicaSuspeito());

            //System.out.println(cen);
            //System.out.println(cen.getDicasTodos());
            
           // if (cen.getDicasArmas().equals(cen2.getDicasSuspeito())) System.out.println("igual");
            //else System.out.println("dif");
            
            
            //if (cen.equals(cen2)) System.out.println("igual");

        } catch (SQLException ex) {
            Logger.getLogger(App2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NomeInvalidoException ex) {
            Logger.getLogger(App2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ImagemInvalidaException ex) {
            Logger.getLogger(App2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DicaInvalidaException ex) {
            Logger.getLogger(App2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProfissaoInvalidaException ex) {
            Logger.getLogger(App2.class.getName()).log(Level.SEVERE, null, ex);
        }
        // a = arm.listaTodasArmas().get(arma.nextInt(arm.listaTodasArmas().size()));
        // l = loc.listaTodosLocais().get(local.nextInt(loc.listaTodosLocais().size()));

//             System.out.println(s);

        //cen = new Cenario(s, a, l);









    }
}
