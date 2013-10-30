package view;

import bean.Armas;
import bean.Dicas;
import cadastro.Cadastro;
import excecoes.DicaInvalidaException;
import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author FILIPE
 */
public class CadastroArmas extends javax.swing.JDialog {

    Cadastro cad;
    private File imagemSelecionada;
    private JList lista;
    private List<Dicas> listaDicasArma;
    private DicaTableModel dicaModel;

    public CadastroArmas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        listaDicasArma = new ArrayList<Dicas>();
        dicaModel = new DicaTableModel(listaDicasArma);
        tbDicasArma.setModel(dicaModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNomeArma = new javax.swing.JTextField();
        lbNomeArma = new javax.swing.JLabel();
        cbTipoArma = new javax.swing.JComboBox();
        lbFotoArma = new javax.swing.JLabel();
        lbTipoArma = new javax.swing.JLabel();
        btAddFotoArma = new javax.swing.JButton();
        spTabelaArma = new javax.swing.JScrollPane();
        tbDicasArma = new javax.swing.JTable();
        btCancelarArma = new javax.swing.JButton();
        btSalvarArma = new javax.swing.JButton();
        btAddDicaArma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Armas");
        setName("CadastroArmas"); // NOI18N
        setResizable(false);

        tfNomeArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeArmaActionPerformed(evt);
            }
        });

        lbNomeArma.setText("Nome:");

        cbTipoArma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FOGO", "BRANCA" }));

        lbFotoArma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFotoArma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        lbTipoArma.setText("Classificação:");

        btAddFotoArma.setText("Adicionar Foto");
        btAddFotoArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddFotoArmaActionPerformed(evt);
            }
        });

        tbDicasArma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Dicas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTabelaArma.setViewportView(tbDicasArma);

        btCancelarArma.setText("Cancelar");
        btCancelarArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarArmaActionPerformed(evt);
            }
        });

        btSalvarArma.setText("Salvar");
        btSalvarArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarArmaActionPerformed(evt);
            }
        });

        btAddDicaArma.setText("Adicionar Dica");
        btAddDicaArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddDicaArmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNomeArma)
                        .addGap(274, 274, 274)
                        .addComponent(lbTipoArma))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNomeArma, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbTipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAddDicaArma)
                            .addComponent(spTabelaArma, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFotoArma, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddFotoArma, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCancelarArma, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvarArma, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(1, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeArma)
                    .addComponent(lbTipoArma))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAddDicaArma)
                        .addGap(7, 7, 7)
                        .addComponent(spTabelaArma, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbFotoArma, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btAddFotoArma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCancelarArma)
                            .addComponent(btSalvarArma))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeArmaActionPerformed
    }//GEN-LAST:event_tfNomeArmaActionPerformed

    private void btSalvarArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarArmaActionPerformed

        try {
            cad = new Cadastro();

            try {
                if (imagemSelecionada == null) {
                    throw new ImagemInvalidaException("A imagem não foi selecionada");
                } else {
                    Armas arma = new Armas(tfNomeArma.getText(), imagemSelecionada.getAbsolutePath(), (String) cbTipoArma.getSelectedItem(), listaDicasArma);
                    cad.addArmas(arma);

                    tfNomeArma.setText("");
                    imagemSelecionada = null;
                    lbFotoArma.setIcon(null);
                    listaDicasArma.clear();

                    JOptionPane.showMessageDialog(null, "Arma salva com sucesso!!!!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                    this.listaDicasArma.clear();
                    updateTableModel();
                }
            } catch (NomeInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Armas", JOptionPane.ERROR_MESSAGE);
            } catch (DicaInvalidaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Armas", JOptionPane.ERROR_MESSAGE);
            } catch (ImagemInvalidaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Armas", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Armas", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Armas", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btSalvarArmaActionPerformed

    private void btAddFotoArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddFotoArmaActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.showOpenDialog(null);
        imagemSelecionada = fc.getSelectedFile();
        if (imagemSelecionada != null) {
            lbFotoArma.setIcon(new ImageIcon(imagemSelecionada.getAbsolutePath()));
        }
    }//GEN-LAST:event_btAddFotoArmaActionPerformed

    private void btAddDicaArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddDicaArmaActionPerformed
        try {
            String dica = JOptionPane.showInputDialog(null, "Digita uma dica: ", "Dica de Armas", JOptionPane.INFORMATION_MESSAGE);
            this.listaDicasArma.add(new Dicas(dica));
            updateTableModel();
        } catch (DicaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Armas", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAddDicaArmaActionPerformed

    private void btCancelarArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarArmaActionPerformed
        int evento = JOptionPane.showConfirmDialog(null, "Desaja cancelar o cadastro?", "Cadastro Armas", JOptionPane.YES_NO_OPTION);
        if (evento == JOptionPane.OK_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btCancelarArmaActionPerformed

    private void updateTableModel() {
        dicaModel = new DicaTableModel(listaDicasArma);
        tbDicasArma.setModel(dicaModel);
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
            java.util.logging.Logger.getLogger(CadastroArmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroArmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroArmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroArmas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroArmas dialog = new CadastroArmas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAddDicaArma;
    private javax.swing.JButton btAddFotoArma;
    private javax.swing.JButton btCancelarArma;
    private javax.swing.JButton btSalvarArma;
    private javax.swing.JComboBox cbTipoArma;
    private javax.swing.JLabel lbFotoArma;
    private javax.swing.JLabel lbNomeArma;
    private javax.swing.JLabel lbTipoArma;
    private javax.swing.JScrollPane spTabelaArma;
    private javax.swing.JTable tbDicasArma;
    private javax.swing.JTextField tfNomeArma;
    // End of variables declaration//GEN-END:variables
}
