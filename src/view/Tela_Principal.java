/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kemu27
 */
public class Tela_Principal extends javax.swing.JFrame {

    dao.Conectar conecta = new dao.Conectar();

    public Tela_Principal() {
        initComponents();
        conecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JInternalFrameMenu = new javax.swing.JInternalFrame();
        Painel_InternalFrame_Menu = new javax.swing.JPanel();
        jButtonUsuário = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jButtonProdutos = new javax.swing.JButton();
        jButtonAnimal = new javax.swing.JButton();
        jButtonRelatório = new javax.swing.JButton();
        jButtonUtilitários = new javax.swing.JButton();
        jButtonCalculadora = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelCalculadora = new javax.swing.JLabel();
        jLabel1CadUsuário = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelAnimal = new javax.swing.JLabel();
        jLabeUtilitáriosFundoTela = new javax.swing.JLabel();
        jLabelProdutos = new javax.swing.JLabel();
        jLabelUtilitários = new javax.swing.JLabel();
        jLabelRelatório = new javax.swing.JLabel();
        jLabelCadastroFundoTela1 = new javax.swing.JLabel();
        jLabeRelatórioFundoTela1 = new javax.swing.JLabel();
        jLabelBAckground2 = new javax.swing.JLabel();
        jLabelBAckground = new javax.swing.JLabel();
        Barra_Menu = new javax.swing.JMenuBar();
        JMenuCadastros = new javax.swing.JMenu();
        JMenuItemUsuarios = new javax.swing.JMenuItem();
        JMenuItemCliente = new javax.swing.JMenuItem();
        JMenuItemProdutos = new javax.swing.JMenuItem();
        Cad_Produto_Menu = new javax.swing.JMenuItem();
        JMenuAdendamentos = new javax.swing.JMenu();
        jMenuItemAgendamento = new javax.swing.JMenuItem();
        JMenuRelatorio = new javax.swing.JMenu();
        JMenuCalculadora = new javax.swing.JMenu();
        jMenuItemCalculadora = new javax.swing.JMenuItem();
        JMenuItemMenu = new javax.swing.JMenu();
        Menu_Ferramentas_Menu = new javax.swing.JMenuItem();
        JMenuSair = new javax.swing.JMenu();
        JMenuItemSairSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JInternalFrameMenu.setTitle("Menu");
        JInternalFrameMenu.setToolTipText("");
        JInternalFrameMenu.setVisible(true);
        JInternalFrameMenu.getContentPane().setLayout(null);

        Painel_InternalFrame_Menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Painel_InternalFrame_Menu.setLayout(null);

        jButtonUsuário.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/Cadastro-Usuário.png"))); // NOI18N
        jButtonUsuário.setToolTipText("Usuário");
        jButtonUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuárioActionPerformed(evt);
            }
        });
        Painel_InternalFrame_Menu.add(jButtonUsuário);
        jButtonUsuário.setBounds(30, 130, 120, 130);

        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/cliente.png"))); // NOI18N
        jButtonCliente.setToolTipText("Cliente");
        Painel_InternalFrame_Menu.add(jButtonCliente);
        jButtonCliente.setBounds(180, 130, 120, 130);

        jButtonProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/esse.png"))); // NOI18N
        jButtonProdutos.setToolTipText("Produto");
        Painel_InternalFrame_Menu.add(jButtonProdutos);
        jButtonProdutos.setBounds(180, 340, 120, 130);

        jButtonAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/animal.png"))); // NOI18N
        jButtonAnimal.setToolTipText("Animal");
        Painel_InternalFrame_Menu.add(jButtonAnimal);
        jButtonAnimal.setBounds(30, 340, 120, 130);

        jButtonRelatório.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/1.png"))); // NOI18N
        jButtonRelatório.setToolTipText("Relatório");
        Painel_InternalFrame_Menu.add(jButtonRelatório);
        jButtonRelatório.setBounds(480, 130, 120, 130);

        jButtonUtilitários.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/ferramentas.png"))); // NOI18N
        jButtonUtilitários.setToolTipText("Ferramenta");
        Painel_InternalFrame_Menu.add(jButtonUtilitários);
        jButtonUtilitários.setBounds(870, 140, 120, 130);

        jButtonCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/2.png"))); // NOI18N
        jButtonCalculadora.setToolTipText("Calculadora");
        Painel_InternalFrame_Menu.add(jButtonCalculadora);
        jButtonCalculadora.setBounds(870, 330, 120, 130);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/sair.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        Painel_InternalFrame_Menu.add(jButtonSair);
        jButtonSair.setBounds(510, 400, 60, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Sair");
        Painel_InternalFrame_Menu.add(jLabel1);
        jLabel1.setBounds(520, 360, 70, 50);

        jLabelCalculadora.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelCalculadora.setText("Calculadora");
        Painel_InternalFrame_Menu.add(jLabelCalculadora);
        jLabelCalculadora.setBounds(880, 290, 110, 40);

        jLabel1CadUsuário.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1CadUsuário.setText("Usuário");
        Painel_InternalFrame_Menu.add(jLabel1CadUsuário);
        jLabel1CadUsuário.setBounds(60, 90, 90, 40);

        jLabelCliente.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelCliente.setText("Cliente");
        Painel_InternalFrame_Menu.add(jLabelCliente);
        jLabelCliente.setBounds(210, 90, 60, 40);

        jLabelAnimal.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelAnimal.setText("Animal");
        Painel_InternalFrame_Menu.add(jLabelAnimal);
        jLabelAnimal.setBounds(60, 300, 90, 40);

        jLabeUtilitáriosFundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/utilitários.png"))); // NOI18N
        Painel_InternalFrame_Menu.add(jLabeUtilitáriosFundoTela);
        jLabeUtilitáriosFundoTela.setBounds(810, 20, 230, 60);

        jLabelProdutos.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelProdutos.setText("Produto");
        Painel_InternalFrame_Menu.add(jLabelProdutos);
        jLabelProdutos.setBounds(210, 300, 110, 40);

        jLabelUtilitários.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelUtilitários.setText("Ferramenta");
        Painel_InternalFrame_Menu.add(jLabelUtilitários);
        jLabelUtilitários.setBounds(880, 100, 100, 40);

        jLabelRelatório.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabelRelatório.setText("Relatório");
        Painel_InternalFrame_Menu.add(jLabelRelatório);
        jLabelRelatório.setBounds(500, 90, 90, 40);

        jLabelCadastroFundoTela1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/cadastro.png"))); // NOI18N
        Painel_InternalFrame_Menu.add(jLabelCadastroFundoTela1);
        jLabelCadastroFundoTela1.setBounds(60, 20, 230, 60);

        jLabeRelatórioFundoTela1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/relatórios.png"))); // NOI18N
        Painel_InternalFrame_Menu.add(jLabeRelatórioFundoTela1);
        jLabeRelatórioFundoTela1.setBounds(430, 20, 230, 60);

        jLabelBAckground2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/gato.png"))); // NOI18N
        Painel_InternalFrame_Menu.add(jLabelBAckground2);
        jLabelBAckground2.setBounds(-10, 0, 1090, 730);

        JInternalFrameMenu.getContentPane().add(Painel_InternalFrame_Menu);
        Painel_InternalFrame_Menu.setBounds(-10, 0, 1080, 500);

        getContentPane().add(JInternalFrameMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1068, 516));

        jLabelBAckground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/dog.png"))); // NOI18N
        getContentPane().add(jLabelBAckground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-960, -250, 2190, 1690));

        JMenuCadastros.setText("Cadastro");

        JMenuItemUsuarios.setText("Usuário");
        JMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemUsuariosActionPerformed(evt);
            }
        });
        JMenuCadastros.add(JMenuItemUsuarios);

        JMenuItemCliente.setText("Cliente");
        JMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemClienteActionPerformed(evt);
            }
        });
        JMenuCadastros.add(JMenuItemCliente);

        JMenuItemProdutos.setText("Animal");
        JMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemProdutosActionPerformed(evt);
            }
        });
        JMenuCadastros.add(JMenuItemProdutos);

        Cad_Produto_Menu.setText("Produto");
        Cad_Produto_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_Produto_MenuActionPerformed(evt);
            }
        });
        JMenuCadastros.add(Cad_Produto_Menu);

        Barra_Menu.add(JMenuCadastros);

        JMenuAdendamentos.setText("Agendamento");

        jMenuItemAgendamento.setText("Agendar");
        jMenuItemAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendamentoActionPerformed(evt);
            }
        });
        JMenuAdendamentos.add(jMenuItemAgendamento);

        Barra_Menu.add(JMenuAdendamentos);

        JMenuRelatorio.setText("Relatório");
        Barra_Menu.add(JMenuRelatorio);

        JMenuCalculadora.setText("Calculadora");

        jMenuItemCalculadora.setText("Calculadora");
        jMenuItemCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCalculadoraActionPerformed(evt);
            }
        });
        JMenuCalculadora.add(jMenuItemCalculadora);

        Barra_Menu.add(JMenuCalculadora);

        JMenuItemMenu.setText("Ferramenta");

        Menu_Ferramentas_Menu.setText("Menu");
        Menu_Ferramentas_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Ferramentas_MenuActionPerformed(evt);
            }
        });
        JMenuItemMenu.add(Menu_Ferramentas_Menu);

        Barra_Menu.add(JMenuItemMenu);

        JMenuSair.setText("Sair");

        JMenuItemSairSistema.setText("Sair do Sistema");
        JMenuItemSairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemSairSistemaActionPerformed(evt);
            }
        });
        JMenuSair.add(JMenuItemSairSistema);

        Barra_Menu.add(JMenuSair);

        setJMenuBar(Barra_Menu);

        setSize(new java.awt.Dimension(1138, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemUsuariosActionPerformed
        Tela_Cad_Usuario tela_user = new Tela_Cad_Usuario();
        tela_user.setVisible(true);
    }//GEN-LAST:event_JMenuItemUsuariosActionPerformed

    private void Menu_Ferramentas_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Ferramentas_MenuActionPerformed
        Tela_Principal tela_pri = new Tela_Principal();
        tela_pri.setVisible(true);
        dispose();
        // Chamadando Tela de Menus, através do botão ferramentas
    }//GEN-LAST:event_Menu_Ferramentas_MenuActionPerformed

    private void JMenuItemSairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemSairSistemaActionPerformed
        System.exit(0);
        conecta.desconectar();

// Sair do sistema barra de Menu
    }//GEN-LAST:event_JMenuItemSairSistemaActionPerformed

    private void JMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemProdutosActionPerformed
        Tela_Cad_Animal tela_animal = new Tela_Cad_Animal();
        tela_animal.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_JMenuItemProdutosActionPerformed

    private void JMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemClienteActionPerformed
        Tela_Cada_Cliente tela_cliente = new Tela_Cada_Cliente();
        tela_cliente.setVisible(true);
    }//GEN-LAST:event_JMenuItemClienteActionPerformed

    private void jMenuItemCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCalculadoraActionPerformed

        try {
            Runtime.getRuntime().exec("cmd.exe /C start calc.exe");
// TODO add your handling code here:
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemCalculadoraActionPerformed

    private void Cad_Produto_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_Produto_MenuActionPerformed
        Tela_Cad_Produto tel_pro = new Tela_Cad_Produto();
        tel_pro.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_Cad_Produto_MenuActionPerformed

    private void jMenuItemAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendamentoActionPerformed
        Tela_Agendamento tel_agen = new Tela_Agendamento();
        tel_agen.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAgendamentoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
            JInternalFrameMenu.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuárioActionPerformed
        
        Tela_Cad_Usuario User = new Tela_Cad_Usuario();
        User.setVisible(true);
        
        
    }//GEN-LAST:event_jButtonUsuárioActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menu;
    private javax.swing.JMenuItem Cad_Produto_Menu;
    private javax.swing.JInternalFrame JInternalFrameMenu;
    private javax.swing.JMenu JMenuAdendamentos;
    private javax.swing.JMenu JMenuCadastros;
    private javax.swing.JMenu JMenuCalculadora;
    private javax.swing.JMenuItem JMenuItemCliente;
    private javax.swing.JMenu JMenuItemMenu;
    private javax.swing.JMenuItem JMenuItemProdutos;
    private javax.swing.JMenuItem JMenuItemSairSistema;
    private javax.swing.JMenuItem JMenuItemUsuarios;
    private javax.swing.JMenu JMenuRelatorio;
    private javax.swing.JMenu JMenuSair;
    private javax.swing.JMenuItem Menu_Ferramentas_Menu;
    private javax.swing.JPanel Painel_InternalFrame_Menu;
    private javax.swing.JButton jButtonAnimal;
    private javax.swing.JButton jButtonCalculadora;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonProdutos;
    private javax.swing.JButton jButtonRelatório;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonUsuário;
    private javax.swing.JButton jButtonUtilitários;
    private javax.swing.JLabel jLabeRelatórioFundoTela1;
    private javax.swing.JLabel jLabeUtilitáriosFundoTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1CadUsuário;
    private javax.swing.JLabel jLabelAnimal;
    private javax.swing.JLabel jLabelBAckground;
    private javax.swing.JLabel jLabelBAckground2;
    private javax.swing.JLabel jLabelCadastroFundoTela1;
    private javax.swing.JLabel jLabelCalculadora;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelProdutos;
    private javax.swing.JLabel jLabelRelatório;
    private javax.swing.JLabel jLabelUtilitários;
    private javax.swing.JMenuItem jMenuItemAgendamento;
    private javax.swing.JMenuItem jMenuItemCalculadora;
    // End of variables declaration//GEN-END:variables
}