package A3;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;

public final class TelaCadastroA3 extends javax.swing.JFrame {

    private static Connection conn;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabalhoa3", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados: " + e.toString());
            System.err.println("Erro ao conectar ao banco de dados: " + e.toString());
        }
    }

    public TelaCadastroA3() {
        initComponents();
        atualizaTabela();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        btnAtualiza = new javax.swing.JButton();
        btnDelata = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        campoNascimento = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        treinos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TELA CADASTRO ALUNO");

        jLabel3.setText("NOME");

        jLabel4.setText("CPF");

        jLabel5.setText("NASCIMENTO");

        jLabel6.setText("TELEFONE");

        jLabel7.setText("EMAIL");

        btnCadastro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastro.setText("CADASTRAR");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnAtualiza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAtualiza.setText("ATUALIZAR");
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

        btnDelata.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelata.setText("DELETAR");
        btnDelata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelataActionPerformed(evt);
            }
        });

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOME", "CPF", "NASCIMENTO", "TELEFONE", "EMAIL"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        treinos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        treinos.setText("TREINOS");
        treinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treinosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(203, 203, 203)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtualiza, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelata, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(treinos, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualiza)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelata)
                        .addGap(18, 18, 18)
                        .addComponent(treinos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        try (PreparedStatement ps = TelaCadastroA3.conn.prepareStatement(
                "INSERT INTO aluno(nome_aluno, cpf_aluno, nascimento_aluno, telefone, email_aluno) VALUES (?, ?, ?, ?, ?)")) {
            if (campoNome.getText().trim().isEmpty() || campoCPF.getText().trim().isEmpty() || campoNascimento.getText().trim().isEmpty() || campoTelefone.getText().trim().isEmpty() || campoEmail.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
                return;
            }
            ps.setString(1, campoNome.getText());
            ps.setString(2, campoCPF.getText());
            ps.setDate(3, java.sql.Date.valueOf(LocalDate.parse(campoNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
            ps.setString(4, campoTelefone.getText());
            ps.setString(5, campoEmail.getText());
            ps.executeUpdate();
            atualizaTabela();
            JOptionPane.showMessageDialog(null, "Aluno adicionado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno: " + e.toString());
            System.err.println("Erro: " + e.toString());
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        campoNome.setText(modelo.getValueAt(tabela.getSelectedRow(), 0).toString());
        campoCPF.setText(modelo.getValueAt(tabela.getSelectedRow(), 1).toString());
        campoNascimento.setText(modelo.getValueAt(tabela.getSelectedRow(), 2).toString());
        campoTelefone.setText(modelo.getValueAt(tabela.getSelectedRow(), 3).toString());
        campoEmail.setText(modelo.getValueAt(tabela.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        try (PreparedStatement ps = TelaCadastroA3.conn.prepareStatement(
                "UPDATE aluno SET nome_aluno=?, cpf_aluno=?, nascimento_aluno=?, telefone=?, email_aluno=? WHERE cpf_aluno=?")) {
            if (campoNome.getText().trim().isEmpty() || campoCPF.getText().trim().isEmpty() || campoNascimento.getText().trim().isEmpty() || campoTelefone.getText().trim().isEmpty() || campoEmail.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
                return;
            }
            ps.setString(1, campoNome.getText());
            ps.setString(2, campoCPF.getText());
            ps.setDate(3, java.sql.Date.valueOf(LocalDate.parse(campoNascimento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
            ps.setString(4, campoTelefone.getText());
            ps.setString(5, campoEmail.getText());
            ps.setString(6, campoCPF.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
            atualizaTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno: " + e.toString());
            System.err.println("Erro: " + e.toString());
        }
    }//GEN-LAST:event_btnAtualizaActionPerformed

    private void btnDelataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelataActionPerformed
        try {
            if (campoCPF.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "CPF é obrigatório!");
                return;
            }
            String selectSql = "SELECT * FROM aluno WHERE cpf_aluno = ?";
            try (PreparedStatement selectPs = TelaCadastroA3.conn.prepareStatement(selectSql)) {
                selectPs.setString(1, campoCPF.getText());
                try (ResultSet rs = selectPs.executeQuery()) {
                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(null, "Aluno não existe!");
                        return;
                    }
                }
            }
            String deleteSql = "DELETE FROM aluno WHERE cpf_aluno = ?";
            try (PreparedStatement deletePs = TelaCadastroA3.conn.prepareStatement(deleteSql)) {
                deletePs.setString(1, campoCPF.getText());
                deletePs.executeUpdate();
            }
            atualizaTabela();
            campoNome.setText("");
            campoCPF.setText("");
            campoNascimento.setText("");
            campoTelefone.setText("");
            campoEmail.setText("");
            JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar aluno: " + e.toString());
            System.err.println("Erro: " + e.toString());
        }
    }//GEN-LAST:event_btnDelataActionPerformed

    private void treinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treinosActionPerformed
        if (campoCPF.getText().equals("") || campoCPF.getText() == null) {
            JOptionPane.showMessageDialog(null, "Selecione um aluno válido!");
            return;
        }
        TelaCadastroTreino tela = new TelaCadastroTreino(campoCPF.getText());
        tela.setVisible(true);
    }//GEN-LAST:event_treinosActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
    }//GEN-LAST:event_campoCPFActionPerformed
    
    
    public void atualizaTabela() {
        try (PreparedStatement ps = TelaCadastroA3.conn.prepareStatement("SELECT nome_aluno, cpf_aluno, nascimento_aluno, telefone, email_aluno FROM aluno");
             ResultSet rs = ps.executeQuery()) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setRowCount(0);
            while (rs.next()) {
                modelo.addRow(new String[] {
                    rs.getString("nome_aluno"),
                    rs.getString("cpf_aluno"),
                    rs.getString("nascimento_aluno"),
                    rs.getString("telefone"),
                    rs.getString("email_aluno")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela: " + e.toString());
            System.err.println("Erro: " + e.toString());
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaCadastroA3().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnDelata;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNascimento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JButton treinos;
    // End of variables declaration//GEN-END:variables
}
