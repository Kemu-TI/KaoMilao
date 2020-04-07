package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AbstractDao {

    protected PreparedStatement stm = null;
    protected ResultSet rs = null;
    protected String driver = "org.postgresql.Driver";
    protected String url = "jdbc:postgresql://localhost:5432/kaomilao";
    protected String usuario = "postgres";
    protected String senha = "vitoria";
    Connection con;

}
