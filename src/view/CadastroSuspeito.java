package view;

import bean.Dicas;
import bean.Suspeito;
import cadastro.Cadastro;
import excecoes.DicaInvalidaException;
import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import excecoes.ProfissaoInvalidaException;
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
public class CadastroSuspeito extends javax.swing.JDialog {

    Cadastro cad;
    private List<Dicas> listaDicasSuspeito;
    private JList lista;
    private File imagemSelecionada;
    private DicaTableModel dicaModel;

    public CadastroSuspeito(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        listaDicasSuspeito = new ArrayList<Dicas>();
        dicaModel = new DicaTableModel(listaDicasSuspeito);
        tbDicasSuspeito.setModel(dicaModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNomeSuspeito = new javax.swing.JLabel();
        tfNomeSuspeito = new javax.swing.JTextField();
        lbProfissatSuspeito = new javax.swing.JLabel();
        btAddDicaSuspeito = new javax.swing.JButton();
        spTabelaSuspeito = new javax.swing.JScrollPane();
        tbDicasSuspeito = new javax.swing.JTable();
        lbFotoSuspeito = new javax.swing.JLabel();
        btAddFotoSuspeito = new javax.swing.JButton();
        btCancelarSuspeito = new javax.swing.JButton();
        btSalvarSuspeito = new javax.swing.JButton();
        tfProfissaoSuspeito = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Suspeitos");
        setName("CadastroSuspeito"); // NOI18N
        setResizable(false);

        lbNomeSuspeito.setText("Nome:");

        tfNomeSuspeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeSuspeitoActionPerformed(evt);
            }
        });

        lbProfissatSuspeito.setText("Profissão:");

        btAddDicaSuspeito.setText("Adicionar Dica");
        btAddDicaSuspeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddDicaSuspeitoActionPerformed(evt);
            }
        });

        tbDicasSuspeito.setModel(new javax.swing.table.DefaultTableModel(
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
        spTabelaSuspeito.setViewportView(tbDicasSuspeito);

        lbFotoSuspeito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFotoSuspeito.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btAddFotoSuspeito.setText("Adicionar Foto");
        btAddFotoSuspeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddFotoSuspeitoActionPerformed(evt);
            }
        });

        btCancelarSuspeito.setText("Cancelar");
        btCancelarSuspeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarSuspeitoActionPerformed(evt);
            }
        });

        btSalvarSuspeito.setText("Salvar");
        btSalvarSuspeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarSuspeitoActionPerformed(evt);
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
                        .addComponent(lbNomeSuspeito)
                        .addGap(274, 274, 274)
                        .addComponent(lbProfissatSuspeito))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNomeSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfProfissaoSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAddDicaSuspeito)
                            .addComponent(spTabelaSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFotoSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddFotoSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCancelarSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvarSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(1, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeSuspeito)
                    .addComponent(lbProfissatSuspeito))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProfissaoSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAddDicaSuspeito)
                        .addGap(7, 7, 7)
                        .addComponent(spTabelaSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbFotoSuspeito, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btAddFotoSuspeito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCancelarSuspeito)
                            .addComponent(btSalvarSuspeito))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeSuspeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeSuspeitoActionPerformed
    }//GEN-LAST:event_tfNomeSuspeitoActionPerformed

    private void btAddDicaSuspeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddDicaSuspeitoActionPerformed
        try {
            String dica = JOptionPane.showInputDialog(null, "Digita uma dica: ", "Dica de Suspeitos", JOptionPane.INFORMATION_MESSAGE);
            this.listaDicasSuspeito.add(new Dicas(dica));
            updateTableModel();
        } catch (DicaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Suspeitos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAddDicaSuspeitoActionPerformed

    private void btAddFotoSuspeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddFotoSuspeitoActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.showOpenDialog(null);
        imagemSelecionada = fc.getSelectedFile();
        if (imagemSelecionada != null) {
            lbFotoSuspeito.setIcon(new ImageIcon(imagemSelecionada.getAbsolutePath()));
        }
    }//GEN-LAST:event_btAddFotoSuspeitoActionPerformed

    private void btCancelarSuspeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarSuspeitoActionPerformed
        int evento = JOptionPane.showConfirmDialog(null, "Desaja cancelar o cadastro?", "Cadastro Suspeito", JOptionPane.YES_NO_OPTION);
        if (evento == JOptionPane.OK_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btCancelarSuspeitoActionPerformed

    private void btSalvarSuspeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarSuspeitoActionPerformed
        try {
            cad = new Cadastro();
            try {
                if (imagemSelecionada == null) {
                    throw new ImagemInvalidaException("A imagem não foi selecionada");
                } else {
                    Suspeito suspeito = new Suspeito(tfNomeSuspeito.getText(), imagemSelecionada.getAbsolutePath(), tfProfissaoSuspeito.getText(), listaDicasSuspeito);
                    cad.addSuspeito(suspeito);

                    tfNomeSuspeito.setText("");
                    tfProfissaoSuspeito.setText("");
                    imagemSelecionada = null;
                    lbFotoSuspeito.setIcon(null);
                    listaDicasSuspeito.clear();

                    JOptionPane.showMessageDialog(null, "Suspeito salvo com sucesso!!!!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                    this.listaDicasSuspeito.clear();
                    updateTableModel();
                }
            } catch (ProfissaoInvalidaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Suspeitos", JOptionPane.ERROR_MESSAGE);
            } catch (NomeInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Suspeitos", JOptionPane.ERROR_MESSAGE);
            } catch (DicaInvalidaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Suspeitos", JOptionPane.ERROR_MESSAGE);
            } catch (ImagemInvalidaException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Suspeitos", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Suspeitos", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Cadastro de Suspeitos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarSuspeitoActionPerformed

    private void updateTableModel() {
        dicaModel = new DicaTableModel(listaDicasSuspeito);
        tbDicasSuspeito.setModel(dicaModel);
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
            java.util.logging.Logger.getLogger(CadastroSuspeito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroSuspeito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroSuspeito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroSuspeito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroSuspeito dialog = new CadastroSuspeito(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAddDicaSuspeito;
    private javax.swing.JButton btAddFotoSuspeito;
    private javax.swing.JButton btCancelarSuspeito;
    private javax.swing.JButton btSalvarSuspeito;
    private javax.swing.JLabel lbFotoSuspeito;
    private javax.swing.JLabel lbNomeSuspeito;
    private javax.swing.JLabel lbProfissatSuspeito;
    private javax.swing.JScrollPane spTabelaSuspeito;
    private javax.swing.JTable tbDicasSuspeito;
    private javax.swing.JTextField tfNomeSuspeito;
    private javax.swing.JTextField tfProfissaoSuspeito;
    // End of variables declaration//GEN-END:variables
}
