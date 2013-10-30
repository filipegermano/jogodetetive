package view;

import java.awt.Color;

/**
 *
 * @author FILIPE
 */
public class Regras extends javax.swing.JDialog {

    public Regras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTituloRegras = new javax.swing.JLabel();
        lbRagra1 = new javax.swing.JLabel();
        lbRagra2 = new javax.swing.JLabel();
        lbRagra3 = new javax.swing.JLabel();
        lbRagra4 = new javax.swing.JLabel();
        lbRagra5 = new javax.swing.JLabel();
        lbRagra6 = new javax.swing.JLabel();
        lbRagra7 = new javax.swing.JLabel();
        lbRagra8 = new javax.swing.JLabel();
        lbRagra9 = new javax.swing.JLabel();
        lbRagra10 = new javax.swing.JLabel();
        btSairRegras = new javax.swing.JButton();
        lbRagra11 = new javax.swing.JLabel();
        lbRagra12 = new javax.swing.JLabel();
        lbRagra13 = new javax.swing.JLabel();
        lbRagra14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Regras");
        setUndecorated(true);

        lbTituloRegras.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTituloRegras.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloRegras.setText("Regras do Jogo");

        lbRagra1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra1.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra1.setText("No início do jogo consiste em sortear um cenário (Suspeito, Arma e Local) para um crime, o ");

        lbRagra2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra2.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra2.setText("A cada palpite errado será debitados pontos do jogador, assim como também será feito com");

        lbRagra3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra3.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra3.setText("O jogo será encerrado quando os pontos chegarem à zero, com isso, o jogo vence; quando o ");

        lbRagra4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra4.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra4.setText("Se o jogador acertar o palpite, ou seja, quando ele ganha o jogo, seu nome irá para o ranking ");

        lbRagra5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbRagra5.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra5.setText("Pontuação: ");

        lbRagra6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra6.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra6.setText("O jogo inicia-se com 75 pontos;");

        lbRagra7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra7.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra7.setText("Palpite errado menos 5 pontos;");

        lbRagra8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra8.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra8.setText("Dica aleatório menos 5 pontos;");

        lbRagra9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra9.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra9.setText("Dica específica (Suspeito, Arma ou Local) menos 10 pontos;");

        lbRagra10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra10.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra10.setText("Jogador acerta palpite mais 20 pontos.");

        btSairRegras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btSairRegras.setText("Sair");
        btSairRegras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairRegrasActionPerformed(evt);
            }
        });

        lbRagra11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra11.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra11.setText("jogador terá que dar o seu palpite com intuito de acerta o cenário sorteado.");

        lbRagra12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra12.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra12.setText(" as dicas, cada dica pedida debita-se pontos. ");

        lbRagra13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra13.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra13.setText("palpite for certo, o jogador ganha ou quando o jogador resolve desistir, o jogo ganha.");

        lbRagra14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbRagra14.setForeground(new java.awt.Color(255, 255, 255));
        lbRagra14.setText("dos campeões junto com sua pontuação.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btSairRegras, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
            .addGroup(layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(lbTituloRegras))
                    .addComponent(lbRagra1)
                    .addComponent(lbRagra11)
                    .addComponent(lbRagra2)
                    .addComponent(lbRagra12)
                    .addComponent(lbRagra3)
                    .addComponent(lbRagra13)
                    .addComponent(lbRagra4)
                    .addComponent(lbRagra14)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbRagra5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbRagra6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbRagra7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbRagra8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbRagra9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbRagra10)))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lbTituloRegras)
                .addGap(39, 39, 39)
                .addComponent(lbRagra1)
                .addGap(6, 6, 6)
                .addComponent(lbRagra11)
                .addGap(26, 26, 26)
                .addComponent(lbRagra2)
                .addGap(6, 6, 6)
                .addComponent(lbRagra12)
                .addGap(27, 27, 27)
                .addComponent(lbRagra3)
                .addGap(6, 6, 6)
                .addComponent(lbRagra13)
                .addGap(28, 28, 28)
                .addComponent(lbRagra4)
                .addGap(6, 6, 6)
                .addComponent(lbRagra14)
                .addGap(48, 48, 48)
                .addComponent(lbRagra5)
                .addGap(18, 18, 18)
                .addComponent(lbRagra6)
                .addGap(13, 13, 13)
                .addComponent(lbRagra7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbRagra8)
                .addGap(13, 13, 13)
                .addComponent(lbRagra9)
                .addGap(13, 13, 13)
                .addComponent(lbRagra10)
                .addGap(53, 53, 53)
                .addComponent(btSairRegras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairRegrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairRegrasActionPerformed
        this.dispose();;
    }//GEN-LAST:event_btSairRegrasActionPerformed

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
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Regras dialog = new Regras(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairRegras;
    private javax.swing.JLabel lbRagra1;
    private javax.swing.JLabel lbRagra10;
    private javax.swing.JLabel lbRagra11;
    private javax.swing.JLabel lbRagra12;
    private javax.swing.JLabel lbRagra13;
    private javax.swing.JLabel lbRagra14;
    private javax.swing.JLabel lbRagra2;
    private javax.swing.JLabel lbRagra3;
    private javax.swing.JLabel lbRagra4;
    private javax.swing.JLabel lbRagra5;
    private javax.swing.JLabel lbRagra6;
    private javax.swing.JLabel lbRagra7;
    private javax.swing.JLabel lbRagra8;
    private javax.swing.JLabel lbRagra9;
    private javax.swing.JLabel lbTituloRegras;
    // End of variables declaration//GEN-END:variables
}
