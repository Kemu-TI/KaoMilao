package view;

import dao.Conectar;
import javax.swing.JOptionPane;

public class Tela_Loguin extends javax.swing.JFrame {

    public Tela_Loguin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTexFieldLoguin = new javax.swing.JTextField();
        JPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonSair = new javax.swing.JButton();
        jButtonEntrar = new javax.swing.JButton();
        jLabelPessoa = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelTransparencia = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JTexFieldLoguin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTexFieldLoguinActionPerformed(evt);
            }
        });
        getContentPane().add(JTexFieldLoguin);
        JTexFieldLoguin.setBounds(370, 270, 200, 30);

        JPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(JPasswordFieldSenha);
        JPasswordFieldSenha.setBounds(370, 320, 200, 30);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/sair.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(10, 10, 30, 30);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(420, 370, 70, 30);

        jLabelPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/pessoa.png"))); // NOI18N
        getContentPane().add(jLabelPessoa);
        jLabelPessoa.setBounds(420, 190, 60, 60);

        jLabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/login.png"))); // NOI18N
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(340, 270, 20, 30);

        jLabelSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/senha.png"))); // NOI18N
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(340, 320, 20, 30);

        jLabelTransparencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/trasnparencia.png"))); // NOI18N
        getContentPane().add(jLabelTransparencia);
        jLabelTransparencia.setBounds(300, 200, 290, 230);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/fundo.png"))); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 690, 480);

        setSize(new java.awt.Dimension(704, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JTexFieldLoguinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTexFieldLoguinActionPerformed
    }//GEN-LAST:event_JTexFieldLoguinActionPerformed

    private void JPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPasswordFieldSenhaActionPerformed
    }//GEN-LAST:event_JPasswordFieldSenhaActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed

        if (JTexFieldLoguin.getText().equals("admin") && JPasswordFieldSenha.getText().equals("admin")) {
            Tela_Principal tela = new Tela_Principal();
            tela.setVisible(true);
            dispose();
        } else {
                    JOptionPane.showMessageDialog(rootPane,"Senha ou Usuários Inválidos");
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Loguin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPasswordFieldSenha;
    private javax.swing.JTextField JTexFieldLoguin;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelPessoa;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTransparencia;
    private javax.swing.JLabel jLabelUsuario;
    // End of variables declaration//GEN-END:variables
}
