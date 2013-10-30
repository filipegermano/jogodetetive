package view;

import excecoes.DicaInvalidaException;
import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import excecoes.ProfissaoInvalidaException;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author FILIPE
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        setUndecorated(false);
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.BLACK);

        lbLogoJogo.setIcon(new ImageIcon("F:\\JAVA\\NETBEANS\\JogoDetetive\\Fotos\\logo.jpg"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btJogarPrincipal = new javax.swing.JButton();
        btSairPrincipal = new javax.swing.JButton();
        lbLogoJogo = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mnCadArmas = new javax.swing.JMenuItem();
        mnCadLocal = new javax.swing.JMenuItem();
        mnCadSuspeito = new javax.swing.JMenuItem();
        mnJogo = new javax.swing.JMenu();
        mnRanking = new javax.swing.JMenuItem();
        mnRegras = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo Detetive");
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocationByPlatform(true);
        setName("jfPrimcipal"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btJogarPrincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btJogarPrincipal.setText("Jogar");
        btJogarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJogarPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btJogarPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 120, 40));

        btSairPrincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btSairPrincipal.setText("Sair");
        btSairPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btSairPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 120, 40));

        lbLogoJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbLogoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 790));

        mnCadastro.setText("Cadastros");

        mnCadArmas.setText("Armas");
        mnCadArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadArmasActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadArmas);

        mnCadLocal.setText("Local");
        mnCadLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadLocalActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadLocal);

        mnCadSuspeito.setText("Suspeito");
        mnCadSuspeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadSuspeitoActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadSuspeito);

        menuPrincipal.add(mnCadastro);

        mnJogo.setText("Diversos");

        mnRanking.setText("Ranking");
        mnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRankingActionPerformed(evt);
            }
        });
        mnJogo.add(mnRanking);

        mnRegras.setText("Regras");
        mnRegras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRegrasActionPerformed(evt);
            }
        });
        mnJogo.add(mnRegras);

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        mnJogo.add(mnSair);

        menuPrincipal.add(mnJogo);

        setJMenuBar(menuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadArmasActionPerformed
        CadastroArmas cadArma = new CadastroArmas(this, rootPaneCheckingEnabled);
        cadArma.setVisible(true);
    }//GEN-LAST:event_mnCadArmasActionPerformed

    private void mnCadLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadLocalActionPerformed
        CadastroLocal cadLugar = new CadastroLocal(this, rootPaneCheckingEnabled);
        cadLugar.setVisible(true);
    }//GEN-LAST:event_mnCadLocalActionPerformed

    private void mnCadSuspeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadSuspeitoActionPerformed
        CadastroSuspeito cadSuspeito = new CadastroSuspeito(this, rootPaneCheckingEnabled);
        cadSuspeito.setVisible(true);
    }//GEN-LAST:event_mnCadSuspeitoActionPerformed

    private void btSairPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairPrincipalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairPrincipalActionPerformed

    private void btJogarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJogarPrincipalActionPerformed
        try {            
            TelaJogo telajogo = new TelaJogo(this, rootPaneCheckingEnabled);
            telajogo.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ImagemInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (DicaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ProfissaoInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btJogarPrincipalActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRankingActionPerformed
        try {
            Ranking ranking = new Ranking(this, rootPaneCheckingEnabled);
            ranking.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ImagemInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (DicaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ProfissaoInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_mnRankingActionPerformed

    private void mnRegrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRegrasActionPerformed
        Regras regras = new Regras(this, rootPaneCheckingEnabled);
        regras.setVisible(true);
    }//GEN-LAST:event_mnRegrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btJogarPrincipal;
    private javax.swing.JButton btSairPrincipal;
    private javax.swing.JLabel lbLogoJogo;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem mnCadArmas;
    private javax.swing.JMenuItem mnCadLocal;
    private javax.swing.JMenuItem mnCadSuspeito;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenu mnJogo;
    private javax.swing.JMenuItem mnRanking;
    private javax.swing.JMenuItem mnRegras;
    private javax.swing.JMenuItem mnSair;
    // End of variables declaration//GEN-END:variables
}
