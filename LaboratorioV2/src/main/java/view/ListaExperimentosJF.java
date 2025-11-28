package view;

import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Experimento;
import model.Projeto;
import model.dao.ExperimentoDAO;
import model.dao.ProjetoDAO;

public class ListaExperimentosJF extends javax.swing.JFrame {

    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private Projeto projeto;
    private ProjetoDAO projDAO = new ProjetoDAO();
    private List<Experimento> experimentos;
    private ExperimentoDAO dao = new ExperimentoDAO();

    public ListaExperimentosJF(Projeto projeto) {
        this.projeto = projeto;
        initComponents();
        loadTabela();
    }

    public ListaExperimentosJF() {
        this.projeto = null;
        initComponents();
        loadTabela();
    }

    public void setExperimentos(List<Experimento> experimentos) {
        this.experimentos = experimentos;
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
        tblExperimentos = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnInformacoes = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

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
                .addGap(282, 282, 282)
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
        jLabel26.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("Experimentos Cadastrados");

        tblExperimentos.setBackground(new java.awt.Color(102, 102, 102));
        tblExperimentos.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        tblExperimentos.setForeground(new java.awt.Color(255, 255, 255));
        tblExperimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Titulo", "Data", "Responsavel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblExperimentos);

        btnAdicionar.setBackground(new java.awt.Color(0, 51, 51));
        btnAdicionar.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
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
        btnEditar.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
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
        btnInformacoes.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
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
        btnRemover.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel26)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        if (projeto != null) {
            List<Experimento> todosExperimentos = dao.listaExperimentos();
            Experimento selecionado = (Experimento) JOptionPane.showInputDialog(
                    this,
                    "Selecione um experimento para adicionar ao projeto:",
                    "Adicionar Experimento ao Projeto",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    todosExperimentos.toArray(),
                    null
            );
            if (selecionado != null) {
                try {
                    projDAO.adicionarExperimento(projeto, selecionado);
                    loadTabela();
                    JOptionPane.showMessageDialog(this, "Experimento adicionado ao projeto com sucesso.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao adicionar experimento: " + ex.getMessage());
                }
            }
            return;
        }

        CadastroExperimentoJD dialog = new CadastroExperimentoJD(this, true, projeto);
        dialog.setVisible(true);
        Experimento e = dialog.getExperimento();
        if (e != null) {
            try {
                loadTabela();
                JOptionPane.showMessageDialog(this, "Experimento adicionado com sucesso.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar experimento: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int row = tblExperimentos.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um experimento para editar.");
            return;
        }

        int id = (int) tblExperimentos.getValueAt(row, 0);
        Experimento experimento = dao.buscarPorId(id);

        if (experimento == null) {
            JOptionPane.showMessageDialog(this, "Experimento não encontrado!");
            return;
        }

        CadastroExperimentoJD cadastro = new CadastroExperimentoJD(this, true, projeto);
        cadastro.setExperimentoParaEditar(experimento);
        cadastro.setVisible(true);

        try {
            dao.persist(cadastro.getExperimento());
            loadTabela();
            JOptionPane.showMessageDialog(this, "Pesquisador editado com sucesso.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar pesquisador: " + ex);
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoesActionPerformed
        int row = tblExperimentos.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um experimento para ver informações.");
            return;
        }
        int id = (int) tblExperimentos.getValueAt(row, 0);
        ExperimentoDAO dao = new ExperimentoDAO();
        Experimento experimento = dao.buscarPorId(id);
        if (experimento != null) {
            JOptionPane.showMessageDialog(this,
                    "Experimento: " + experimento.mostrarDados() + "\n",
                    "Informações do Experimento",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(this, "Experimento não encontrado!");
        }
    }//GEN-LAST:event_btnInformacoesActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int row = tblExperimentos.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um experimento para remover.");
            return;
        }

        int id = (int) tblExperimentos.getValueAt(row, 0);

        Experimento e = dao.buscarPorId(id);

        if (e == null) {
            JOptionPane.showMessageDialog(this, "Experimento não encontrado!");
            return;
        }

        try {
            if (projeto != null) {
                projDAO.removerExperimento(projeto, e);
            } else {
                dao.remover(e);
            }
            loadTabela();
            JOptionPane.showMessageDialog(this, "Experimento removido com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao remover experimento: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void loadTabela() {
        DefaultTableModel model = (DefaultTableModel) tblExperimentos.getModel();
        model.setRowCount(0);
        ExperimentoDAO dao = new ExperimentoDAO();
        List<Experimento> lista;

        if (projeto != null) {
            lista = dao.listaPorProjeto(projeto.getId());
        } else {
            lista = dao.listaExperimentos();
        }

        for (Experimento e : lista) {
            model.addRow(new Object[]{
                e.getID(),
                e.getTitulo(),
                e.getDtRealizacao() != null ? e.getDtRealizacao().format(formato) : "",
                e.getResponsavel() != null ? e.getResponsavel().getNome() : "Não definido"
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
    private javax.swing.JTable tblExperimentos;
    // End of variables declaration//GEN-END:variables
}
