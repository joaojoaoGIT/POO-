
package br.ulbra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    Connection con;
 
    public UsuarioDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }
 

    public boolean checkLogin(String email, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM tbusuario WHERE email = ? and senha = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
               check = true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }


public void create(Usuarios u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbusuarios (nomeusu, emailusu, senhausu, foneusu, sexousu) VALUES (?,?,?,?,?)");

            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu()); 
            stmt.setString(4, u.getFoneUsu());
            stmt.setString(5, u.getSexoUsu());
           
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
