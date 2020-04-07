package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;
import javax.xml.transform.Result;

public class Conectar extends AbstractDao {

    /*private Connection c = null;
     private PreparedStatement ps = null;
     private ResultSet rs;
     private String sql = "";
     */
    public void conexao() {

        System.setProperty("org.postgresql.Driver", driver);
        try {
            con = DriverManager.getConnection(url, "postgres", "vitoria");
            //JOptionPane.showMessageDialog(null,"Conectado ao Banco de Dados");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void executaSql(String sql) {
        try {
            stm = (PreparedStatement) con.createStatement();

            rs = stm.executeQuery(sql);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar Sql:\n" + ex.getMessage());
        }
    }

    public void desconectar() {

        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void main(String[] args) {
        conexao();
    }

}
