package view;

import bean.Jogador;
import cadastro.Cadastro;
import excecoes.DicaInvalidaException;
import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import excecoes.ProfissaoInvalidaException;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author FILIPE
 */
public class Ranking extends javax.swing.JDialog {

    private List<Ranking> listaranking;
    private Cadastro cadastro;
    private RankingTableModel rankingModel;
    private List<Jogador> listaDicasRanking;

    @SuppressWarnings("empty-statement")
    public Ranking(java.awt.Frame parent, boolean modal) throws SQLException, ClassNotFoundException, NomeInvalidoException, ImagemInvalidaException, DicaInvalidaException, ProfissaoInvalidaException {
        super(parent, modal);
        initComponents();

        cadastro = new Cadastro();
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);

        rankingModel = new RankingTableModel(cadastro.recuperaRanking());
        tbRanking.setModel(rankingModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloRanking = new javax.swing.JLabel();
        btSairRanking = new javax.swing.JToggleButton();
        spTableRanking = new javax.swing.JScrollPane();
        tbRanking = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        lbTituloRanking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTituloRanking.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloRanking.setText("Ranking");

        btSairRanking.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSairRanking.setText("Sair");
        btSairRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairRankingActionPerformed(evt);
            }
        });

        tbRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        spTableRanking.setViewportView(tbRanking);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(686, 686, 686)
                .addComponent(lbTituloRanking)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(562, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btSairRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(655, 655, 655))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spTableRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(538, 538, 538))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(lbTituloRanking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTableRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSairRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairRankingActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairRankingActionPerformed

    private void updateTableModel() {
        rankingModel = new RankingTableModel(listaDicasRanking);
        tbRanking.setModel(rankingModel);
    }

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
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ranking dialog = new Ranking(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (NomeInvalidoException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (ImagemInvalidaException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (DicaInvalidaException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (ProfissaoInvalidaException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btSairRanking;
    private javax.swing.JLabel lbTituloRanking;
    private javax.swing.JScrollPane spTableRanking;
    private javax.swing.JTable tbRanking;
    // End of variables declaration//GEN-END:variables
}
