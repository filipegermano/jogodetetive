package view;

import bean.Dicas;
import bean.Local;
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
public class CadastroLocal extends javax.swing.JDialog {

    Cadastro cad;
    private List<Dicas> listaDicasLocal;
    private JList lista;
    private File imagemSelecionada;
    private DicaTableModel dicaModel;

    public CadastroLocal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        listaDicasLocal = new ArrayList<Dicas>();
        dicaModel = new DicaTableModel(listaDicasLocal);
        tbDicasLocal.setModel(dicaModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNomeLocal = new javax.swing.JLabel();
        tfNomeLocal = new javax.swing.JTextField();
        lbTipoLocal = new javax.swing.JLabel();
        cbTipoLocal = new javax.swing.JComboBox();
        lbFotoLocal = new javax.swing.JLabel();
        spTabelaLocal = new javax.swing.JScrollPane();
        tbDicasLocal = new javax.swing.JTable();
        btAddDicaLocal = new javax.swing.JButton();
        btAddFotoLocal = new javax.swing.JButton();
        btCancelarLocal = new javax.swing.JButton();
        btSalvarLocal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Locais");
        setName("CadastroLocal"); // NOI18N
        setResizable(false);

        lbNomeLocal.setText("Nome:");

        tfNomeLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeLocalActionPerformed(evt);
            }
        });

        lbTipoLocal.setText("Classificação:");

        cbTipoLocal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PÚBLICO", "PRIVADO" }));

        lbFotoLocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFotoLocal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        tbDicasLocal.setModel(new javax.swing.table.DefaultTableModel(
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
        spTabelaLocal.setViewportView(tbDicasLocal);

        btAddDicaLocal.setText("Adicionar Dica");
        btAddDicaLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddDicaLocalActionPerformed(evt);
            }
        });

        btAddFotoLocal.setText("Adicionar Foto");
        btAddFotoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddFotoLocalActionPerformed(evt);
            }
        });

        btCancelarLocal.setText("Cancelar");
        btCancelarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarLocalActionPerformed(evt);
            }
        });

        btSalvarLocal.setText("Salvar");
        btSalvarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarLocalActionPerformed(evt);
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
                        .addComponent(lbNomeLocal)
                        .addGap(274, 274, 274)
                        .addComponent(lbTipoLocal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNomeLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbTipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAddDicaLocal)
                            .addComponent(spTabelaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFotoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddFotoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCancelarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvarLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(1, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeLocal)
                    .addComponent(lbTipoLocal))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAddDicaLocal)
                        .addGap(7, 7, 7)
                        .addComponent(spTabelaLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbFotoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btAddFotoLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCancelarLocal)
                            .addComponent(btSalvarLocal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeLocalActionPerformed
    }//GEN-LAST:event_tfNomeLocalActionPerformed

    private void btAddDicaLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddDicaLocalActionPerformed
        try {
            String dica = JOptionPane.showInputDialog(null, "Digita uma dica: ", "Dica de Local", JOptionPane.INFORMATION_MESSAGE);
            this.listaDicasLocal.add(new Dicas(dica));
            updateTableModel();
        } catch (DicaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Locais", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btAddDicaLocalActionPerformed

    private void btAddFotoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddFotoLocalActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.showOpenDialog(null);
        imagemSelecionada = fc.getSelectedFile();
        if (imagemSelecionada != null) {
            lbFotoLocal.setIcon(new ImageIcon(imagemSelecionada.getAbsolutePath()));
        }
    }//GEN-LAST:event_btAddFotoLocalActionPerformed

    private void btCancelarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarLocalActionPerformed
        int evento = JOptionPane.showConfirmDialog(null, "Desaja cancelar o cadastro?", "Cadastro Local", JOptionPane.YES_NO_OPTION);
        if (evento == JOptionPane.OK_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btCancelarLocalActionPerformed

    private void btSalvarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarLocalActionPerformed
        try {
            cad = new Cadastro();
            try {
                if (imagemSelecionada == null) {
                    throw new ImagemInvalidaException("A imagem não foi selecionada");
                } else {
                    Local local = new Local(tfNomeLocal.getText(), imagemSelecionada.getAbsolutePath(), (String) cbTipoLocal.getSelectedItem(), listaDicasLocal);
                    cad.addLocal(local);

                    tfNomeLocal.setText("");
                    imagemSelecionada = null;
                    lbFotoLocal.setIcon(null);
                    listaDicasLocal.clear();

                    JOptionPane.showMessageDialog(null, "Local salvo com sucesso!!!!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                    this.listaDicasLocal.clear();
                    updateTableModel();
                }
            } catch (NomeInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Locais", JOptionPane.ERROR_MESSAGE);
            } catch (DicaInvalidaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Locais", JOptionPane.ERROR_MESSAGE);
            } catch (ImagemInvalidaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Locais", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Locais", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Locais", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarLocalActionPerformed

    private void updateTableModel() {
        dicaModel = new DicaTableModel(listaDicasLocal);
        tbDicasLocal.setModel(dicaModel);
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
            java.util.logging.Logger.getLogger(CadastroLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLocal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroLocal dialog = new CadastroLocal(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAddDicaLocal;
    private javax.swing.JButton btAddFotoLocal;
    private javax.swing.JButton btCancelarLocal;
    private javax.swing.JButton btSalvarLocal;
    private javax.swing.JComboBox cbTipoLocal;
    private javax.swing.JLabel lbFotoLocal;
    private javax.swing.JLabel lbNomeLocal;
    private javax.swing.JLabel lbTipoLocal;
    private javax.swing.JScrollPane spTabelaLocal;
    private javax.swing.JTable tbDicasLocal;
    private javax.swing.JTextField tfNomeLocal;
    // End of variables declaration//GEN-END:variables
}
