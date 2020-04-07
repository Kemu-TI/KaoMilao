/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import UTIL.ManipulaImagem;
import dao.AnimalDao;

import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Animal;

/**
 *
 * @author S.I
 */
public class Tela_Cad_Animal extends javax.swing.JFrame {

    Animal mod = new Animal();
    AnimalDao cadastro = new AnimalDao();
    dao.Conectar conectar = new dao.Conectar();

  
    /**
     * Creates new form JFrameCad_Animal
     */
    public Tela_Cad_Animal() {
        conectar.conexao();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlabelAnimal = new javax.swing.JLabel();
        Painel_Tela_Cad_Animal = new javax.swing.JPanel();
        Nome_Tela_Cad_Usuario = new javax.swing.JLabel();
        JTexFieldPesquisar = new javax.swing.JTextField();
        JButtonBuscar = new javax.swing.JButton();
        JButtonNovo = new javax.swing.JButton();
        JButtonSalvar = new javax.swing.JButton();
        JButtonAlterar = new javax.swing.JButton();
        JButtonCancelar = new javax.swing.JButton();
        jLabelData = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelRaca = new javax.swing.JLabel();
        jLabelCor = new javax.swing.JLabel();
        jLabelPorte = new javax.swing.JLabel();
        jLabelObservacao = new javax.swing.JLabel();
        jLabelApelido = new javax.swing.JLabel();
        jLabelIdAnimal = new javax.swing.JLabel();
        jTextFieldApelidio = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldIdAnimal = new javax.swing.JTextField();
        JComboBoxSexo = new javax.swing.JComboBox();
        jTextFieldRaça = new javax.swing.JTextField();
        jTextFieldPorte = new javax.swing.JTextField();
        jTextFieldCor = new javax.swing.JTextField();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jTextFieldObservação = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonFoto = new javax.swing.JButton();
        jLabelFoto = new javax.swing.JLabel();
        JComboBoxTipoAnimal = new javax.swing.JComboBox();
        JlabelTipoAnimal = new javax.swing.JLabel();
        jTextFieldcaminho_imagem = new javax.swing.JTextField();
        jLabelcaminho = new javax.swing.JLabel();
        jLabelfundo = new javax.swing.JLabel();
        jLabelfundotitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JlabelAnimal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        JlabelAnimal.setForeground(new java.awt.Color(255, 255, 255));
        JlabelAnimal.setText("Cadastro de Animal");
        getContentPane().add(JlabelAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        Painel_Tela_Cad_Animal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Painel_Tela_Cad_Animal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nome_Tela_Cad_Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nome_Tela_Cad_Usuario.setText("Nome");
        Painel_Tela_Cad_Animal.add(Nome_Tela_Cad_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));
        Painel_Tela_Cad_Animal.add(JTexFieldPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 350, 31));

        JButtonBuscar.setText("Buscar");
        JButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBuscarActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Animal.add(JButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 107, 31));

        JButtonNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonNovo.setText("Novo");
        JButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonNovoActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Animal.add(JButtonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 84, 33));

        JButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonSalvar.setText("Salvar");
        JButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalvarActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Animal.add(JButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 84, 33));

        JButtonAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonAlterar.setText("Alterar");
        JButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAlterarActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Animal.add(JButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 84, 35));

        JButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JButtonCancelar.setText("Cancelar");
        JButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCancelarActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Animal.add(JButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 84, 35));

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelData.setText("Data de Nascimento");
        Painel_Tela_Cad_Animal.add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSexo.setText("Sexo");
        Painel_Tela_Cad_Animal.add(jLabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, -1, -1));

        jLabelRaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRaca.setText("Raça");
        Painel_Tela_Cad_Animal.add(jLabelRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jLabelCor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCor.setText("Cor");
        Painel_Tela_Cad_Animal.add(jLabelCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jLabelPorte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPorte.setText("Porte");
        Painel_Tela_Cad_Animal.add(jLabelPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        jLabelObservacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelObservacao.setText("Observação");
        Painel_Tela_Cad_Animal.add(jLabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, 20));

        jLabelApelido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelApelido.setText("Apelido");
        Painel_Tela_Cad_Animal.add(jLabelApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, 20));

        jLabelIdAnimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIdAnimal.setText("Id_Animal");
        Painel_Tela_Cad_Animal.add(jLabelIdAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));
        Painel_Tela_Cad_Animal.add(jTextFieldApelidio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 90, 30));
        Painel_Tela_Cad_Animal.add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 240, 30));
        Painel_Tela_Cad_Animal.add(jTextFieldIdAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 120, 30));

        JComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        Painel_Tela_Cad_Animal.add(JComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 50, 31));
        Painel_Tela_Cad_Animal.add(jTextFieldRaça, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 160, 30));
        Painel_Tela_Cad_Animal.add(jTextFieldPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 130, 30));
        Painel_Tela_Cad_Animal.add(jTextFieldCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 120, 30));

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldData.setCaretColor(new java.awt.Color(255, 0, 51));
        jFormattedTextFieldData.setSelectedTextColor(new java.awt.Color(255, 0, 0));
        jFormattedTextFieldData.setSelectionColor(new java.awt.Color(255, 255, 51));
        Painel_Tela_Cad_Animal.add(jFormattedTextFieldData, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 120, 30));
        Painel_Tela_Cad_Animal.add(jTextFieldObservação, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 360, 30));

        jLabel1.setText("Nome");
        Painel_Tela_Cad_Animal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 40, -1));

        jButtonFoto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonFoto.setText("Selecionar Imagem");
        jButtonFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFotoActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Animal.add(jButtonFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 160, 40));

        jLabelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Painel_Tela_Cad_Animal.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 180, 160));

        JComboBoxTipoAnimal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cachorro", "Gato", "Pássaros", " " }));
        Painel_Tela_Cad_Animal.add(JComboBoxTipoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 119, 31));

        JlabelTipoAnimal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JlabelTipoAnimal.setText("Tipo do Animal");
        Painel_Tela_Cad_Animal.add(JlabelTipoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jTextFieldcaminho_imagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcaminho_imagemActionPerformed(evt);
            }
        });
        Painel_Tela_Cad_Animal.add(jTextFieldcaminho_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 350, 30));

        jLabelcaminho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelcaminho.setText("Caminho");
        Painel_Tela_Cad_Animal.add(jLabelcaminho, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        jLabelfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/fundo-azul.jpg"))); // NOI18N
        Painel_Tela_Cad_Animal.add(jLabelfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 950, 450));

        getContentPane().add(Painel_Tela_Cad_Animal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 970, 470));

        jLabelfundotitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/azul.jpg"))); // NOI18N
        getContentPane().add(jLabelfundotitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 980, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonNovoActionPerformed
        jTextFieldNome.setEnabled(true);
        jTextFieldApelidio.setEnabled(true);
        jTextFieldRaça.setEnabled(true);
        jTextFieldPorte.setEnabled(true);
        jTextFieldCor.setEnabled(true);
        jLabelFoto.setEnabled(true);
        JTexFieldPesquisar.setEnabled(true);
        jFormattedTextFieldData.setEnabled(true);
        jTextFieldObservação.setEnabled(true);
        jTextFieldIdAnimal.setEnabled(true);
        LimparCampos();
    }//GEN-LAST:event_JButtonNovoActionPerformed

    private void LimparCampos(){
    
        jTextFieldNome.setText("");
        jTextFieldApelidio.setText("");
        jTextFieldRaça.setText("");
        jTextFieldPorte.setText("");
        jTextFieldCor.setText("");
        jLabelFoto.setText("");
        JTexFieldPesquisar.setText("");
        jFormattedTextFieldData.setText("");
        jTextFieldObservação.setText("");
        jTextFieldIdAnimal.setText("");
        jTextFieldcaminho_imagem.setText("");
        jLabelFoto.setText(null);
       
    }
    private void JButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalvarActionPerformed

        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy"); 
        
        mod.setId(Integer.parseInt(jTextFieldIdAnimal.getText()));
        mod.setNome(jTextFieldNome.getText());
        mod.setApelido(jTextFieldApelidio.getText());
        mod.setRaca(jTextFieldRaça.getText());
        mod.setPorte(jTextFieldPorte.getText());
        mod.setCor(jTextFieldCor.getText());
        mod.setSexo((String) JComboBoxSexo.getSelectedItem());
        mod.setData(jFormattedTextFieldData.getText());
        mod.setObservacao(jTextFieldObservação.getText());
        mod.setFoto(jTextFieldcaminho_imagem.getText());
        mod.setTipo((String) JComboBoxTipoAnimal.getSelectedItem());
        cadastro.Salvar(mod);
        LimparCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonSalvarActionPerformed

    private void JButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlterarActionPerformed

        jTextFieldNome.setEnabled(true);
        jTextFieldApelidio.setEnabled(true);
        jTextFieldRaça.setEnabled(true);
        jTextFieldPorte.setEnabled(true);
        JComboBoxSexo.setEnabled(true);
        JComboBoxTipoAnimal.setEnabled(true);
        jTextFieldCor.setEnabled(true);
        jButtonFoto.setEnabled(true);
        JTexFieldPesquisar.setEnabled(true);
        jFormattedTextFieldData.setEditable(true);
        jTextFieldObservação.setEnabled(true);
                
        AnimalDao adao = new AnimalDao();
        Animal a = new Animal();

        String nome = jTextFieldNome.getText();
        String apelido = jTextFieldApelidio.getText();
        String raca = jTextFieldRaça.getText();
        String porte = jTextFieldPorte.getText();
        String sexo = (String) JComboBoxSexo.getSelectedItem();
        String tipoanimal = (String) JComboBoxTipoAnimal.getSelectedItem();
        String cor = jTextFieldCor.getText();
        String data = jFormattedTextFieldData.getText();
        String observacao = jTextFieldObservação.getText();
       
        //UsuarioDao userdao = new UsuarioDao();
        a.setNome(nome);
        a.setApelido(apelido);
        a.setRaca(raca);
        a.setPorte(porte);
        a.setSexo(sexo);
        a.setTipo(tipoanimal);
        a.setCor(cor);
        a.setData(data);
        a.setObservacao(observacao);
        cadastro.Alterar(a);
        LimparCampos();

    }//GEN-LAST:event_JButtonAlterarActionPerformed

    private void jButtonFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFotoActionPerformed

        BufferedImage imagem;

        JFileChooser chooser = new JFileChooser();//chama o metodo de caminho
        int res = chooser.showOpenDialog(this);//abre o console de documentos

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = chooser.getSelectedFile();

            imagem = ManipulaImagem.setImagemDimensao(arquivo.getAbsolutePath(), 200, 180);
            jLabelFoto.setIcon(new ImageIcon(imagem));
            jTextFieldcaminho_imagem.setText(arquivo.getAbsolutePath());

        }
    }//GEN-LAST:event_jButtonFotoActionPerformed

    private void JButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBuscarActionPerformed
        
    
        AnimalDao animdao = new AnimalDao();
        Animal a = new Animal();
        
        jTextFieldNome.setEnabled(true);
        jTextFieldApelidio.setEnabled(true);
        jTextFieldRaça.setEnabled(true);
        jTextFieldPorte.setEnabled(true);
        JComboBoxSexo.setEnabled(true);
        JComboBoxTipoAnimal.setEnabled(true);
        jTextFieldCor.setEnabled(true);
        jButtonFoto.setEnabled(true);
        JTexFieldPesquisar.setEnabled(true);
        jFormattedTextFieldData.setEditable(true);
        jTextFieldObservação.setEnabled(true);
        jTextFieldIdAnimal.setEnabled(false);
                
        String busca = JTexFieldPesquisar.getText();
        String nome = jTextFieldNome.getText();
        String apelido = jTextFieldApelidio.getText();
        String data = jFormattedTextFieldData.getText();
        String raca = jTextFieldRaça.getText();
        String porte = jTextFieldPorte.getText();
        String cor = jTextFieldCor.getText();
        String sexo = (String) JComboBoxSexo.getSelectedItem();
        String observacao = jTextFieldObservação.getText();
        String imagem = jTextFieldcaminho_imagem.getText();
        String tipo = (String) JComboBoxTipoAnimal.getSelectedItem();
        a = animdao.Buscar(busca);
        
        if(a!= null){
            
            jTextFieldIdAnimal.setText(a.getId().toString());
            jTextFieldNome.setText(a.getNome());
            jTextFieldApelidio.setText(a.getApelido());
            jTextFieldRaça.setText(a.getRaca());
            jTextFieldPorte.setText(a.getPorte());
            jTextFieldCor.setText(a.getCor());
            JComboBoxSexo.setSelectedItem(a.getSexo());
            jTextFieldObservação.setText(a.getObservacao());
            JComboBoxTipoAnimal.setSelectedItem(a.getTipo());
            jFormattedTextFieldData.setText(a.getData());
                 
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Animal Não Encontrado");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_JButtonBuscarActionPerformed

    private void jTextFieldcaminho_imagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcaminho_imagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcaminho_imagemActionPerformed

    private void JButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCancelarActionPerformed

        LimparCampos();

        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cad_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cad_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cad_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cad_Animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cad_Animal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAlterar;
    private javax.swing.JButton JButtonBuscar;
    private javax.swing.JButton JButtonCancelar;
    private javax.swing.JButton JButtonNovo;
    private javax.swing.JButton JButtonSalvar;
    private javax.swing.JComboBox JComboBoxSexo;
    private javax.swing.JComboBox JComboBoxTipoAnimal;
    private javax.swing.JTextField JTexFieldPesquisar;
    private javax.swing.JLabel JlabelAnimal;
    private javax.swing.JLabel JlabelTipoAnimal;
    private javax.swing.JLabel Nome_Tela_Cad_Usuario;
    private javax.swing.JPanel Painel_Tela_Cad_Animal;
    private javax.swing.JButton jButtonFoto;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApelido;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelIdAnimal;
    private javax.swing.JLabel jLabelObservacao;
    private javax.swing.JLabel jLabelPorte;
    private javax.swing.JLabel jLabelRaca;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelcaminho;
    private javax.swing.JLabel jLabelfundo;
    private javax.swing.JLabel jLabelfundotitulo;
    private javax.swing.JTextField jTextFieldApelidio;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldIdAnimal;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldObservação;
    private javax.swing.JTextField jTextFieldPorte;
    private javax.swing.JTextField jTextFieldRaça;
    private javax.swing.JTextField jTextFieldcaminho_imagem;
    // End of variables declaration//GEN-END:variables
}
