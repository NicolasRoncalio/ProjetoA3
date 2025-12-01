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

public final class TelaCadastroTreino extends javax.swing.JFrame {

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

    public TelaCadastroTreino(String cpf) {
        initComponents();
        atualizaTabelaTreino(cpf);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descricao = new javax.swing.JTextArea();
        DuracaoTreino = new javax.swing.JTextField();
        TipoTreino = new javax.swing.JTextField();
        DataInicio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaTreino = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoCPFaluno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CADASTRO TREINO");

        jLabel4.setText("TIPO DE TREINO");

        jLabel5.setText("DURAÇÃO EM MIN");

        jLabel6.setText("DATA INICIO");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DESCRIÇÃO DO TREINO");

        Descricao.setColumns(20);
        Descricao.setRows(5);
        jScrollPane1.setViewportView(Descricao);

        tabelaTreino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF ALUNO", "TIPO TREINO", "DURAÇÃO", "DATA INICIO", "DESCRIÇÃO"
            }
        ));
        tabelaTreino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaTreinoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaTreino);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("INSERIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("ATUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF ALUNO");

        campoCPFaluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFalunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(DuracaoTreino, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(TipoTreino, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(campoCPFaluno))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(campoCPFaluno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DuracaoTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (campoCPFaluno.getText().trim().isEmpty() || TipoTreino.getText().trim().isEmpty() || Descricao.getText().trim().isEmpty() || DuracaoTreino.getText().trim().isEmpty() || DataInicio.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
                return;
            }
            String buscaIdSql = "SELECT id_aluno FROM aluno WHERE cpf_aluno = ?";
            int idAluno;
            try (PreparedStatement buscaIdPs = TelaCadastroTreino.conn.prepareStatement(buscaIdSql)) {
                buscaIdPs.setString(1, campoCPFaluno.getText());
                try (ResultSet rs = buscaIdPs.executeQuery()) {
                    if (rs.next()) {
                        idAluno = rs.getInt("id_aluno");
                    } else {
                        JOptionPane.showMessageDialog(null, "Aluno não encontrado para o CPF informado!");
                        return;
                    }
                }
            }
            String sql = "INSERT INTO treino(id_aluno, tipo_treino, descricao, duracao_minutos, data_inicio ) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = TelaCadastroTreino.conn.prepareStatement(sql)) {
                ps.setInt(1, idAluno);
                ps.setString(2, TipoTreino.getText());
                ps.setString(3, Descricao.getText());
                ps.setInt(4, Integer.parseInt(DuracaoTreino.getText()));
                ps.setDate(5, java.sql.Date.valueOf(LocalDate.parse(DataInicio.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
                ps.executeUpdate();
            }
            atualizaTabelaTreino(campoCPFaluno.getText());
            JOptionPane.showMessageDialog(null, "Treino adicionado com sucesso!");
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar treino: " + e.toString());
            System.err.println("Erro: " + e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (campoCPFaluno.getText().trim().isEmpty() || TipoTreino.getText().trim().isEmpty() || Descricao.getText().trim().isEmpty() || DuracaoTreino.getText().trim().isEmpty() || DataInicio.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
                return;
            }
            int idAluno;
            String buscaIdSql = "SELECT id_aluno FROM aluno WHERE cpf_aluno = ?";
            try (PreparedStatement buscaIdPs = TelaCadastroTreino.conn.prepareStatement(buscaIdSql)) {
                buscaIdPs.setString(1, campoCPFaluno.getText());
                try (ResultSet rs = buscaIdPs.executeQuery()) {
                    if (rs.next()) {
                        idAluno = rs.getInt("id_aluno");
                    } else {
                        JOptionPane.showMessageDialog(null, "Aluno não encontrado para o CPF informado!");
                        return;
                }
            }
        }
        int selectedRow = tabelaTreino.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um treino para atualizar!");
            return;
        }
            int idTreino = Integer.parseInt(((DefaultTableModel) tabelaTreino.getModel()).getValueAt(selectedRow, 0).toString());
            String sql = "UPDATE treino SET id_aluno=?, tipo_treino=?, descricao=?, duracao_minutos=?, data_inicio=? WHERE id_treino=?";
            try (PreparedStatement ps = TelaCadastroTreino.conn.prepareStatement(sql)) {
                ps.setInt(1, idAluno);
                ps.setString(2, TipoTreino.getText());
                ps.setString(3, Descricao.getText());
                ps.setInt(4, Integer.parseInt(DuracaoTreino.getText()));
                ps.setDate(5, java.sql.Date.valueOf(LocalDate.parse(DataInicio.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
                ps.setInt(6, idTreino);
                ps.executeUpdate();
            }
            atualizaTabelaTreino(campoCPFaluno.getText());
            JOptionPane.showMessageDialog(null, "Treino atualizado com sucesso!");
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar treino: " + e.toString());
            System.err.println("Erro: " + e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelaTreinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaTreinoMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) tabelaTreino.getModel();
        campoCPFaluno.setText(modelo.getValueAt(tabelaTreino.getSelectedRow(), 0).toString());
        TipoTreino.setText(modelo.getValueAt(tabelaTreino.getSelectedRow(), 1).toString());
        DuracaoTreino.setText(modelo.getValueAt(tabelaTreino.getSelectedRow(), 2).toString());
        DataInicio.setText(modelo.getValueAt(tabelaTreino.getSelectedRow(), 3).toString());
        Descricao.setText(modelo.getValueAt(tabelaTreino.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tabelaTreinoMouseClicked

    private void campoCPFalunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFalunoActionPerformed
    }//GEN-LAST:event_campoCPFalunoActionPerformed

    public void atualizaTabelaTreino(String cpf){
        try (PreparedStatement ps = TelaCadastroTreino.conn.prepareStatement(
            "SELECT a.cpf_aluno, t.tipo_treino, t.duracao_minutos, t.data_inicio, t.descricao FROM treino t INNER JOIN aluno a ON t.id_aluno = a.id_aluno WHERE a.cpf_aluno = ?")) {
            ps.setString(1, cpf);
            try (ResultSet rs = ps.executeQuery()) {
                DefaultTableModel modelo = (DefaultTableModel) tabelaTreino.getModel();
                modelo.setRowCount(0);
                while (rs.next()) {
                    modelo.addRow(new String[] {
                        rs.getString("cpf_aluno"),
                        rs.getString("tipo_treino"),
                        rs.getString("duracao_minutos"),
                        rs.getString("data_inicio"),
                        rs.getString("descricao")
                    });
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela de treinos: " + e.toString());
            System.err.println("Erro: " + e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DataInicio;
    private javax.swing.JTextArea Descricao;
    private javax.swing.JTextField DuracaoTreino;
    private javax.swing.JTextField TipoTreino;
    private javax.swing.JTextField campoCPFaluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaTreino;
    // End of variables declaration//GEN-END:variables
}
