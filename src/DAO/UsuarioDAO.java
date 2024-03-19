/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;   
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ra2057005
 */
public class UsuarioDAO {
    public void cadastrarUsuario(UsuarioDTO usuario) {
        String sql = "INSERT INTO usuario (nome, email, senha, login) VALUES (?, ?, ?, ?)";
                try (Connection c = new ConexaoDAO().conectaBD();
                    PreparedStatement ps = c.prepareStatement(sql);) {
                    ps.setString(1,usuario.getNome());
                    ps.setString(2,usuario.getEmail());
                    ps.setString(3,usuario.getSenha());
                    ps.setString(4,usuario.getLogin());
                    ps.execute();
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "UsuarioDTO" + erro);
                }
    }
    
    public void selecionarUsuario() {
        String sql = "select * from usuario";
        try (Connection c = new ConexaoDAO().conectaBD();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();) {
            while (rs.next()){
                System.out.println("#" + rs.getInt("id")+" # "+ rs.getString("nome"));
            }

        } catch (SQLException erro) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
    }
    
    public void deletarUsuario(UsuarioDTO usuario) {
        String sql = "DELETE FROM usuario WHERE login = ?";
                ConexaoDAO conn = new ConexaoDAO();
                try (Connection c = new ConexaoDAO().conectaBD();
                    PreparedStatement ps = conn.conectaBD().prepareStatement(sql);) {
                    ps.setString(1,usuario.getLogin());
                    ps.execute();
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "UsuarioDTO" + erro);
                }
    }
    
    public void alterarUsuario(UsuarioDTO usuario, UsuarioDTO usuario2) {
        String sql = "UPDATE usuario SET nome = ?, email=?, senha=?, login=? WHERE login=?";
                ConexaoDAO conn = new ConexaoDAO();
                try (Connection c = new ConexaoDAO().conectaBD();
                    PreparedStatement ps = conn.conectaBD().prepareStatement(sql);) {
                    ps.setString(1,usuario2.getNome());
                    ps.setString(2,usuario2.getEmail());
                    ps.setString(3,usuario2.getSenha());
                    ps.setString(4,usuario2.getLogin());
                    ps.setString(5,usuario.getLogin());
                    ps.execute();
                } catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "UsuarioDTO" + erro);
                }
    }
    
}
