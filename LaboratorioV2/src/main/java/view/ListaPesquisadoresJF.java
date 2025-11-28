package view;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Pesquisador;
import model.Projeto;
import model.dao.PesquisadorDAO;
import model.dao.ProjetoDAO;

public class ListaPesquisadoresJF extends javax.swing.JFrame {

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private Projeto projeto;
    private ProjetoDAO projetoDAO = new ProjetoDAO();

    private PesquisadorDAO dao = new PesquisadorDAO();

    public ListaPesquisadoresJF(Projeto projeto) {
        this.projeto = projeto;
        initComponents();
        loadTabela();
    }

    public ListaPesquisadoresJF() {
        initComponents();
        loadTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPesquisadores = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnInformacoes = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Magneto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("S-RAPeL");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 153, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("SimSun-ExtB", 1, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("Pesquisadores Cadastrados");

        tblPesquisadores.setBackground(new java.awt.Color(102, 102, 102));
        tblPesquisadores.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        tblPesquisadores.setForeground(new java.awt.Color(255, 255, 255));
        tblPesquisadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Dt_Nascimento", "Área de Atuação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPesquisadores);

        btnAdicionar.setBackground(new java.awt.Color(0, 51, 51));
        btnAdicionar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setToolTipText("");
        btnAdicionar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(72, 23));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 51, 51));
        btnEditar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnEditar.setMinimumSize(new java.awt.Dimension(72, 23));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnInformacoes.setBackground(new java.awt.Color(0, 51, 51));
        btnInformacoes.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnInformacoes.setForeground(new java.awt.Color(255, 255, 255));
        btnInformacoes.setText("Mais Informações");
        btnInformacoes.setToolTipText("");
        btnInformacoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnInformacoes.setMinimumSize(new java.awt.Dimension(72, 23));
        btnInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacoesActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(0, 51, 51));
        btnRemover.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setText("Remover");
        btnRemover.setToolTipText("");
        btnRemover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnRemover.setMinimumSize(new java.awt.Dimension(72, 23));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel26)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int row = tblPesquisadores.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um pesquisador para remover.");
            return;
        }

        int id = (int) tblPesquisadores.getValueAt(row, 0);

        if (projeto != null) {
            Pesquisador pesquisador = dao.buscarPorId(id);
            try {
                projetoDAO.removerPesquisador(projeto, pesquisador);
                loadTabela();
                JOptionPane.showMessageDialog(this, "Pesquisador removido do projeto com sucesso.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao remover pesquisador do projeto: " + ex.getMessage());
            }
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Deseja remover o pesquisador " + id + "?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                dao.remover(id);
                loadTabela();
                JOptionPane.showMessageDialog(this, "Pesquisador removido com sucesso.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao remover pesquisador: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoesActionPerformed
        int row = tblPesquisadores.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um pesquisador");
            return;
        }
        int id = (int) tblPesquisadores.getValueAt(row, 0);
        Pesquisador pesquisador = dao.buscarPorId(id);
        if (pesquisador != null) {
            JOptionPane.showMessageDialog(this,
                    "Pesquisador: " + pesquisador.mostrarDados() + "\n",
                    "Informações do Pesquisador",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(this, "Pesquisador não encontrado.");
        }
    }//GEN-LAST:event_btnInformacoesActionPerformed


    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int row = tblPesquisadores.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um pesquisador para editar.");
            return;
        }

        int id = (int) tblPesquisadores.getValueAt(row, 0);
        Pesquisador pesquisador = dao.buscarPorId(id);

        if (pesquisador == null) {
            JOptionPane.showMessageDialog(this, "Pesquisador não encontrado.");
            return;
        }

        CadastroPesquisadorJD cadastro = new CadastroPesquisadorJD(this, true);
        cadastro.setPesquisadorParaEditar(pesquisador);
        cadastro.setVisible(true);

        try {
            dao.persist(cadastro.getPesquisador());
            loadTabela();
            JOptionPane.showMessageDialog(this, "Pesquisador editado com sucesso.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar pesquisador: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        if (projeto != null) {
            List<Pesquisador> todosPesquisadores = dao.listaPesquisadores();

            Pesquisador selecionado = (Pesquisador) JOptionPane.showInputDialog(
                    this,
                    "Selecione um pesquisador para adicionar ao projeto:",
                    "Adicionar Pesquisador ao Projeto",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    todosPesquisadores.toArray(),
                    null
            );

            if (selecionado != null) {
                projeto.adicionarPesquisador(selecionado);
                try {
                    projetoDAO.persist(projeto);
                    loadTabela();
                    JOptionPane.showMessageDialog(this, "Pesquisador adicionado ao projeto com sucesso.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar projeto: " + ex.getMessage());
                }
            }
            return;
        }

        CadastroPesquisadorJD cadastro = new CadastroPesquisadorJD(this, true);
        cadastro.setVisible(true);
        Pesquisador pesquisador = cadastro.getPesquisador();

        if (pesquisador != null) {
            try {
                dao.persist(pesquisador);
                loadTabela();
                JOptionPane.showMessageDialog(this, "Pesquisador adicionado com sucesso.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar pesquisador: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void loadTabela() {
        List<Pesquisador> pesquisadores;

        if (projeto != null) {
            Projeto projetoCompleto = projetoDAO.buscarProjetoCompleto(projeto.getId());
            if (projetoCompleto != null) {
                pesquisadores = projetoCompleto.getPesquisadores();
            } else {
                pesquisadores = new ArrayList<>();
            }
        } else {
            pesquisadores = dao.listaPesquisadores();
        }

        DefaultTableModel model = (DefaultTableModel) tblPesquisadores.getModel();
        model.setRowCount(0);
        for (Pesquisador p : pesquisadores) {
            model.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getDtNasc() != null ? p.getDtNasc().format(formato) : "",
                p.getAreaAtuacao() != null ? p.getAreaAtuacao() : ""
            });
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnInformacoes;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPesquisadores;
    // End of variables declaration//GEN-END:variables
}
