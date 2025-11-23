package view;

import model.Usuarios;

public class MenuJF extends javax.swing.JFrame {

    private Usuarios usuarioLogado;

    public MenuJF(Usuarios usuario) {
        this.usuarioLogado = usuario;
        initComponents();
        lblUsuario.setText("Bem-vindo, " + getUsuarioNome());
    }

    public MenuJF() {
        this(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTrocar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnListaPesquisadores = new javax.swing.JButton();
        btnListaEquipamentos = new javax.swing.JButton();
        btnListaProjetos = new javax.swing.JButton();
        btnListaUsuarios = new javax.swing.JButton();
        btnListaExperimentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Magneto", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("S-RAPeL");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(102, 102, 102), new java.awt.Color(0, 153, 102)));

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel2.setText("Andrey DC Silva");

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnTrocar.setBackground(new java.awt.Color(0, 51, 51));
        btnTrocar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnTrocar.setForeground(new java.awt.Color(255, 255, 255));
        btnTrocar.setText("Trocar Usuário");
        btnTrocar.setToolTipText("");
        btnTrocar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnTrocar.setMinimumSize(new java.awt.Dimension(72, 23));
        btnTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(0, 51, 51));
        btnSair.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair da Conta");
        btnSair.setToolTipText("");
        btnSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnSair.setMinimumSize(new java.awt.Dimension(72, 23));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrocar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrocar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblUsuario.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Bem Vindo(a), USUARIO");

        jLabel3.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Listas de Dados no Sistema");

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnListaPesquisadores.setBackground(new java.awt.Color(0, 51, 51));
        btnListaPesquisadores.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnListaPesquisadores.setForeground(new java.awt.Color(255, 255, 255));
        btnListaPesquisadores.setText("Pesquisadores");
        btnListaPesquisadores.setToolTipText("");
        btnListaPesquisadores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnListaPesquisadores.setMinimumSize(new java.awt.Dimension(72, 23));
        btnListaPesquisadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaPesquisadoresActionPerformed(evt);
            }
        });

        btnListaEquipamentos.setBackground(new java.awt.Color(0, 51, 51));
        btnListaEquipamentos.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnListaEquipamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnListaEquipamentos.setText("Equipamentos");
        btnListaEquipamentos.setToolTipText("");
        btnListaEquipamentos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnListaEquipamentos.setMinimumSize(new java.awt.Dimension(72, 23));
        btnListaEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaEquipamentosActionPerformed(evt);
            }
        });

        btnListaProjetos.setBackground(new java.awt.Color(0, 51, 51));
        btnListaProjetos.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnListaProjetos.setForeground(new java.awt.Color(255, 255, 255));
        btnListaProjetos.setText("Projetos");
        btnListaProjetos.setToolTipText("");
        btnListaProjetos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnListaProjetos.setMinimumSize(new java.awt.Dimension(72, 23));
        btnListaProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProjetosActionPerformed(evt);
            }
        });

        btnListaUsuarios.setBackground(new java.awt.Color(0, 51, 51));
        btnListaUsuarios.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnListaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnListaUsuarios.setText("Usuários");
        btnListaUsuarios.setToolTipText("");
        btnListaUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnListaUsuarios.setMinimumSize(new java.awt.Dimension(72, 23));
        btnListaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaUsuariosActionPerformed(evt);
            }
        });

        btnListaExperimentos.setBackground(new java.awt.Color(0, 51, 51));
        btnListaExperimentos.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        btnListaExperimentos.setForeground(new java.awt.Color(255, 255, 255));
        btnListaExperimentos.setText("Experimentos");
        btnListaExperimentos.setToolTipText("");
        btnListaExperimentos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 102, 51)));
        btnListaExperimentos.setMinimumSize(new java.awt.Dimension(72, 23));
        btnListaExperimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaExperimentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnListaPesquisadores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListaEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnListaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(btnListaExperimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaPesquisadores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListaEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListaProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListaExperimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(203, 203, 203))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblUsuario)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
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

    private void btnTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocarActionPerformed
        this.dispose();

        TelaLoginJD login = new TelaLoginJD(null, true);
        login.setVisible(true);
    }//GEN-LAST:event_btnTrocarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();

        TelaInicial inicio = new TelaInicial();
        inicio.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnListaPesquisadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaPesquisadoresActionPerformed
        ListaPesquisadoresJF lista = new ListaPesquisadoresJF();
        lista.setVisible(true);
    }//GEN-LAST:event_btnListaPesquisadoresActionPerformed

    private void btnListaEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaEquipamentosActionPerformed
        ListaEquipamentosJF lista = new ListaEquipamentosJF();
        lista.setVisible(true);
    }//GEN-LAST:event_btnListaEquipamentosActionPerformed

    private void btnListaProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProjetosActionPerformed
        ListaProjetosJF lista = new ListaProjetosJF();
        lista.setVisible(true);
    }//GEN-LAST:event_btnListaProjetosActionPerformed

    private void btnListaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaUsuariosActionPerformed
        ListaUsuariosJF lista = new ListaUsuariosJF();
        lista.setVisible(true);
    }//GEN-LAST:event_btnListaUsuariosActionPerformed

    private void btnListaExperimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaExperimentosActionPerformed
        ListaExperimentosJF lista = new ListaExperimentosJF();
        lista.setVisible(true);
    }//GEN-LAST:event_btnListaExperimentosActionPerformed

    private String getUsuarioNome() {
        if (usuarioLogado != null && usuarioLogado.getPesquisador() != null) {
            return usuarioLogado.getPesquisador().getNome();
        }
        return "Usuário";
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListaEquipamentos;
    private javax.swing.JButton btnListaExperimentos;
    private javax.swing.JButton btnListaPesquisadores;
    private javax.swing.JButton btnListaProjetos;
    private javax.swing.JButton btnListaUsuarios;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTrocar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
