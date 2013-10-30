package view;

import bean.Armas;
import bean.Dicas;
import bean.Jogador;
import bean.Local;
import bean.Suspeito;
import cadastro.Cadastro;
import excecoes.DicaInvalidaException;
import excecoes.ImagemInvalidaException;
import excecoes.NomeInvalidoException;
import excecoes.ProfissaoInvalidaException;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import jogo.Jogo;

/**
 *
 * @author FILIPE
 */
public class TelaJogo extends javax.swing.JDialog {

    private List<Armas> listaArma;
    private List<Suspeito> listaSuspeito;
    private List<Local> listaLocal;
    private Jogador jogador;
    private Jogo jogo;
    private Cadastro cadastro;

    public TelaJogo(java.awt.Frame parent, boolean modal) throws SQLException, ClassNotFoundException, ImagemInvalidaException, DicaInvalidaException, ProfissaoInvalidaException, NomeInvalidoException {
        super(parent, modal);
        jogo = new Jogo();
        cadastro = new Cadastro();
        getContentPane().setBackground(Color.BLACK);

        String jog;
        do {
            jog = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Jogador", JOptionPane.INFORMATION_MESSAGE);
        } while ((jog == null) || (jog.length() == 0));

        jogador = new Jogador(jog);

        initComponents();
        setLocationRelativeTo(null);


        lbNomeJogadorJogo.setText(jog);
        lbPontosJogo.setText(Integer.toString(jogador.getPontos()));

        jogo.sorteiaCenario();

        listaSuspeito = new ArrayList<Suspeito>();
        jlSuspeitoJogo.setListData(cadastro.recuperaTodosSuspeitos().toArray());

        listaArma = new ArrayList<Armas>();
        jlArmasJogo.setListData(cadastro.recuperaTodosArmas().toArray());

        listaLocal = new ArrayList<Local>();
        jlLocalJogo.setListData(cadastro.recuperaTodosLocais().toArray());


        lbFotoArmaJogo.setIcon(new ImageIcon("F:\\JAVA\\NETBEANS\\JogoDetetive\\Fotos\\Inicial.jpg"));
        lbFotoSuspeitoJogo.setIcon(new ImageIcon("F:\\JAVA\\NETBEANS\\JogoDetetive\\Fotos\\Inicial.jpg"));
        lbFotoLocalJogo.setIcon(new ImageIcon("F:\\JAVA\\NETBEANS\\JogoDetetive\\Fotos\\Inicial.jpg"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFotoSuspeitoJogo = new javax.swing.JLabel();
        lbFotoArmaJogo = new javax.swing.JLabel();
        lbFotoLocalJogo = new javax.swing.JLabel();
        btPalpiteJogo = new javax.swing.JButton();
        btDicaTodasJogo = new javax.swing.JButton();
        btDicaSuspeitoJogo = new javax.swing.JButton();
        btDicaArmaJogo = new javax.swing.JButton();
        btDicaLocalJogo = new javax.swing.JButton();
        btEncerraJogo = new javax.swing.JButton();
        spArmasJogo = new javax.swing.JScrollPane();
        jlArmasJogo = new javax.swing.JList();
        lbDescSuspeitoJogo = new javax.swing.JLabel();
        lbDescArmaJogo = new javax.swing.JLabel();
        lbDescLocalJogo = new javax.swing.JLabel();
        spSuspeitoJogo = new javax.swing.JScrollPane();
        jlSuspeitoJogo = new javax.swing.JList();
        spLocalJogo = new javax.swing.JScrollPane();
        jlLocalJogo = new javax.swing.JList();
        lbTitlePontosJogo = new javax.swing.JLabel();
        lbPontosJogo = new javax.swing.JLabel();
        lbDescricJogadorJogo = new javax.swing.JLabel();
        lbNomeJogadorJogo = new javax.swing.JLabel();
        lbTitleJogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        lbFotoSuspeitoJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFotoSuspeitoJogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        lbFotoArmaJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFotoArmaJogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        lbFotoLocalJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFotoLocalJogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        btPalpiteJogo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btPalpiteJogo.setText("Palpite");
        btPalpiteJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPalpiteJogoActionPerformed(evt);
            }
        });

        btDicaTodasJogo.setText("Dica Aleatória");
        btDicaTodasJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDicaTodasJogoActionPerformed(evt);
            }
        });

        btDicaSuspeitoJogo.setText("Dica de Suspeito");
        btDicaSuspeitoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDicaSuspeitoJogoActionPerformed(evt);
            }
        });

        btDicaArmaJogo.setText("Dica de Arma");
        btDicaArmaJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDicaArmaJogoActionPerformed(evt);
            }
        });

        btDicaLocalJogo.setText("Dica de Local");
        btDicaLocalJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDicaLocalJogoActionPerformed(evt);
            }
        });

        btEncerraJogo.setText("Encerrar Jogo");
        btEncerraJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncerraJogoActionPerformed(evt);
            }
        });

        jlArmasJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlArmasJogoMouseClicked(evt);
            }
        });
        spArmasJogo.setViewportView(jlArmasJogo);

        lbDescSuspeitoJogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDescSuspeitoJogo.setForeground(new java.awt.Color(204, 204, 204));
        lbDescSuspeitoJogo.setText("Suspeito");

        lbDescArmaJogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDescArmaJogo.setForeground(new java.awt.Color(204, 204, 204));
        lbDescArmaJogo.setText("Arma");

        lbDescLocalJogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDescLocalJogo.setForeground(new java.awt.Color(204, 204, 204));
        lbDescLocalJogo.setText("Local");

        jlSuspeitoJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSuspeitoJogoMouseClicked(evt);
            }
        });
        spSuspeitoJogo.setViewportView(jlSuspeitoJogo);

        jlLocalJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLocalJogoMouseClicked(evt);
            }
        });
        spLocalJogo.setViewportView(jlLocalJogo);

        lbTitlePontosJogo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitlePontosJogo.setText("Pontos:");

        lbPontosJogo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbPontosJogo.setForeground(new java.awt.Color(255, 255, 255));
        lbPontosJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPontosJogo.setText("0");

        lbDescricJogadorJogo.setForeground(new java.awt.Color(255, 255, 255));
        lbDescricJogadorJogo.setText("Jogador:");

        lbNomeJogadorJogo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNomeJogadorJogo.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeJogadorJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNomeJogadorJogo.setText("jLabel3");

        lbTitleJogo.setFont(new java.awt.Font("Wickenden Cafe NDP", 1, 36)); // NOI18N
        lbTitleJogo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitleJogo.setText("Detective Game");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spSuspeitoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spArmasJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spLocalJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(lbTitlePontosJogo)
                                            .addComponent(lbPontosJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbDescricJogadorJogo)
                                            .addComponent(lbNomeJogadorJogo)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btEncerraJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbFotoSuspeitoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(lbFotoArmaJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(lbFotoLocalJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btPalpiteJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btDicaTodasJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btDicaSuspeitoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btDicaArmaJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btDicaLocalJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lbDescSuspeitoJogo)
                                .addGap(205, 205, 205)
                                .addComponent(lbDescArmaJogo)
                                .addGap(217, 217, 217)
                                .addComponent(lbDescLocalJogo)))
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitleJogo)
                        .addGap(631, 631, 631))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(lbTitleJogo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescSuspeitoJogo)
                    .addComponent(lbDescArmaJogo)
                    .addComponent(lbDescLocalJogo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFotoSuspeitoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFotoArmaJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFotoLocalJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPalpiteJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btDicaTodasJogo)
                        .addGap(11, 11, 11)
                        .addComponent(btDicaSuspeitoJogo)
                        .addGap(13, 13, 13)
                        .addComponent(btDicaArmaJogo)
                        .addGap(11, 11, 11)
                        .addComponent(btDicaLocalJogo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitlePontosJogo)
                        .addGap(2, 2, 2)
                        .addComponent(lbPontosJogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbDescricJogadorJogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeJogadorJogo)
                        .addGap(52, 52, 52)
                        .addComponent(btEncerraJogo))
                    .addComponent(spSuspeitoJogo)
                    .addComponent(spArmasJogo)
                    .addComponent(spLocalJogo))
                .addGap(134, 134, 134))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlArmasJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlArmasJogoMouseClicked
        JList lista_temp = (JList) evt.getSource();
        Armas a = (Armas) lista_temp.getSelectedValue();
        lbFotoArmaJogo.setIcon(new ImageIcon(a.getImagem()));

    }//GEN-LAST:event_jlArmasJogoMouseClicked

    private void jlSuspeitoJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSuspeitoJogoMouseClicked
        JList lista_temp = (JList) evt.getSource();
        Suspeito s = (Suspeito) lista_temp.getSelectedValue();
        lbFotoSuspeitoJogo.setIcon(new ImageIcon(s.getImagem()));

    }//GEN-LAST:event_jlSuspeitoJogoMouseClicked

    private void jlLocalJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLocalJogoMouseClicked
        JList lista_temp = (JList) evt.getSource();
        Local l = (Local) lista_temp.getSelectedValue();
        lbFotoLocalJogo.setIcon(new ImageIcon(l.getImagem()));
    }//GEN-LAST:event_jlLocalJogoMouseClicked

    private void perdeJogo() {
        if (jogador.getPontos() <= 0) {
            JOptionPane.showMessageDialog(null, "Você Perdeu !", "Jogo", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }

    private void desabilitaBotao() {
        btDicaArmaJogo.setEnabled(false);
        btDicaLocalJogo.setEnabled(false);
        btDicaSuspeitoJogo.setEnabled(false);
        btDicaTodasJogo.setEnabled(false);
    }

    private void habilitaBotao() {
        btDicaArmaJogo.setEnabled(true);
        btDicaLocalJogo.setEnabled(true);
        btDicaSuspeitoJogo.setEnabled(true);
        btDicaTodasJogo.setEnabled(true);
    }

    private void btPalpiteJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPalpiteJogoActionPerformed
        try {
            if ((jlSuspeitoJogo.getSelectedValue() == null) || (jlArmasJogo.getSelectedValue() == null) || (jlLocalJogo.getSelectedValue() == null)) {
                JOptionPane.showMessageDialog(null, "Deve ser selecionado um cenário\n(Suspeito)-(Arma)-(Local)", "Jogo", JOptionPane.WARNING_MESSAGE);
            } else if (jogo.getPalpite((Suspeito) jlSuspeitoJogo.getSelectedValue(), (Armas) jlArmasJogo.getSelectedValue(), (Local) jlLocalJogo.getSelectedValue()) == true) {
                jogador.incrementaPontos();
                lbPontosJogo.setText(Integer.toString(jogador.getPontos()));
                JOptionPane.showMessageDialog(null, "Parabéns!!! \n" + jogador.getNome() + "\nVocê venceu, com " + jogador.getPontos() + " Pontos.", "Parabéns", JOptionPane.INFORMATION_MESSAGE);
                cadastro.addRanking(jogador);

                Ranking ranking = new Ranking(new javax.swing.JFrame(), true);
                ranking.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, jogador.getNome() + "\nSeu palpite esta incorreto.\nTente nomamente.", "Jogo", JOptionPane.ERROR_MESSAGE);
                jogador.decrementaPontos();
                habilitaBotao();
            }
            perdeJogo();

            lbPontosJogo.setText(Integer.toString(jogador.getPontos()));
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
    }//GEN-LAST:event_btPalpiteJogoActionPerformed

    private void btDicaTodasJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDicaTodasJogoActionPerformed
        Dicas dica;
        try {
            dica = jogo.getSorteioAleatorio();
            JOptionPane.showMessageDialog(null, dica, "Jogo", JOptionPane.INFORMATION_MESSAGE);

            jogador.decrementaPontos();
            lbPontosJogo.setText(Integer.toString(jogador.getPontos()));

            desabilitaBotao();
            perdeJogo();

        } catch (ProfissaoInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (DicaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ImagemInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btDicaTodasJogoActionPerformed

    private void btDicaSuspeitoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDicaSuspeitoJogoActionPerformed

        try {
            Dicas dica = jogo.getSorteiaDicaSuspeito();
            JOptionPane.showMessageDialog(null, dica, "Jogo", JOptionPane.INFORMATION_MESSAGE);

            jogador.decrementaPontos();
            jogador.decrementaPontos();
            lbPontosJogo.setText(Integer.toString(jogador.getPontos()));

            desabilitaBotao();
            perdeJogo();

        } catch (ProfissaoInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (DicaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ImagemInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btDicaSuspeitoJogoActionPerformed

    private void btDicaArmaJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDicaArmaJogoActionPerformed
        try {
            Dicas dica = jogo.getSorteiaDicaArma();
            JOptionPane.showMessageDialog(null, dica, "Jogo", JOptionPane.INFORMATION_MESSAGE);

            jogador.decrementaPontos();
            jogador.decrementaPontos();
            lbPontosJogo.setText(Integer.toString(jogador.getPontos()));

            desabilitaBotao();
            perdeJogo();

        } catch (ProfissaoInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (DicaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ImagemInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btDicaArmaJogoActionPerformed

    private void btDicaLocalJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDicaLocalJogoActionPerformed
        try {
            Dicas dica = jogo.getSorteiaDicaLocal();
            JOptionPane.showMessageDialog(null, dica, "Jogo", JOptionPane.INFORMATION_MESSAGE);

            jogador.decrementaPontos();
            jogador.decrementaPontos();
            lbPontosJogo.setText(Integer.toString(jogador.getPontos()));

            desabilitaBotao();
            perdeJogo();

        } catch (ProfissaoInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (DicaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ImagemInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btDicaLocalJogoActionPerformed

    private void btEncerraJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerraJogoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btEncerraJogoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaJogo dialog = null;
                try {
                    try {
                        dialog = new TelaJogo(new javax.swing.JFrame(), true);
                    } catch (ProfissaoInvalidaException ex) {
                        Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogar", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogar", JOptionPane.ERROR_MESSAGE);
                } catch (NomeInvalidoException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogar", JOptionPane.ERROR_MESSAGE);
                } catch (ImagemInvalidaException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
                } catch (DicaInvalidaException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Jogo", JOptionPane.ERROR_MESSAGE);
                }
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
    private javax.swing.JButton btDicaArmaJogo;
    private javax.swing.JButton btDicaLocalJogo;
    private javax.swing.JButton btDicaSuspeitoJogo;
    private javax.swing.JButton btDicaTodasJogo;
    private javax.swing.JButton btEncerraJogo;
    private javax.swing.JButton btPalpiteJogo;
    private javax.swing.JList jlArmasJogo;
    private javax.swing.JList jlLocalJogo;
    private javax.swing.JList jlSuspeitoJogo;
    private javax.swing.JLabel lbDescArmaJogo;
    private javax.swing.JLabel lbDescLocalJogo;
    private javax.swing.JLabel lbDescSuspeitoJogo;
    private javax.swing.JLabel lbDescricJogadorJogo;
    private javax.swing.JLabel lbFotoArmaJogo;
    private javax.swing.JLabel lbFotoLocalJogo;
    private javax.swing.JLabel lbFotoSuspeitoJogo;
    private javax.swing.JLabel lbNomeJogadorJogo;
    private javax.swing.JLabel lbPontosJogo;
    private javax.swing.JLabel lbTitleJogo;
    private javax.swing.JLabel lbTitlePontosJogo;
    private javax.swing.JScrollPane spArmasJogo;
    private javax.swing.JScrollPane spLocalJogo;
    private javax.swing.JScrollPane spSuspeitoJogo;
    // End of variables declaration//GEN-END:variables
}
