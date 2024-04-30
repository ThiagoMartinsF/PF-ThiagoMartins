/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Usuario;

/**
 *
 * @author Senai
 */
public class UsuarioDAO {
     public List<Usuario> read() {
        List<Usuario> usuario = new ArrayList();

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            stmt = conexao.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuarios = new Usuario();                
                usuarios.setIdUsuario(rs.getInt("idUsuario"));
                usuarios.setNome(rs.getString("nome"));
                usuarios.setSenha(rs.getString("email"));
                usuarios.setEmail(rs.getString("senha"));
                usuarios.setCpf(rs.getString("cpf"));
                usuarios.setTelefone(rs.getString("telefone"));
                usuarios.setDataNascimento(rs.getDate("dataNascimento"));
                usuarios.setEndereco(rs.getString("endereco"));
                usuarios.setAdmin(rs.getInt("admin"));
               
                
                usuario.add(usuarios);
            }

            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
                
    }
         
         
          public void create(Usuario usuario) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
           
            stmt = conexao.prepareStatement("INSERT INTO usuario (nome, email, senha, cpf, telefone, dataNascimento, endereco, admin) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getCpf());
            stmt.setString(5, usuario.getTelefone());
            stmt.setDate(6, usuario.getDataNascimento());
            stmt.setString(7, usuario.getEndereco());
            stmt.setInt(8, usuario.getAdmin());
           
            
            
               stmt.executeUpdate();
               stmt.close();
               conexao.close();
               
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    
    
    public void delete(Usuario usuario) {
        try {
            java.sql.Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            
           
            stmt = conexao.prepareStatement("DELETE FROM usuario WHERE idUsuario = ?");
            stmt.setString(1, Integer.toString(usuario.getIdUsuario()));

            stmt.executeUpdate();
            stmt.close();
            conexao.close();
            JOptionPane.showMessageDialog(null, "usuario removido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     public Usuario validaUser(Usuario user) {
        Usuario usuarioValido = new Usuario();
        try {
            Connection con = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE email = ? AND senha = ?");
            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getSenha());
            rs = stmt.executeQuery();
            
            if(rs.next()) {
                usuarioValido.setIdUsuario(rs.getInt("idUsuario"));
                usuarioValido.setEmail(rs.getString("email"));
                usuarioValido.setSenha(rs.getString("senha"));
            }
            
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            usuarioValido.setIdUsuario(0);
            usuarioValido.setEmail("");
            usuarioValido.setSenha("");
        }
        return usuarioValido;
    }
    
    public void editar(Usuario usuario){
        try {
          Connection conexao = Conexao.conectar();
          PreparedStatement stmt = null;
          stmt = conexao.prepareStatement("UPDATE usuario SET nome = ?, email = ?, senha = ?, cpf = ?, telefone = ?, dataNascimento = ?, endereco = ?, admin = ? WHERE idUsuario = ?");
           stmt.setString(1, usuario.getNome());
           stmt.setString(2, usuario.getSenha());
           stmt.setString(3, usuario.getEmail());
           stmt.setString(4, usuario.getCpf());
           stmt.setString(5, usuario.getTelefone());
           stmt.setDate(6, usuario.getDataNascimento());
           stmt.setString(7, usuario.getEndereco());
           stmt.setInt(8, usuario.getAdmin());
          stmt.executeUpdate();
         
          stmt.close();
          conexao.close();
         
          
       } catch (SQLException e){
           
               e.printStackTrace();
       JOptionPane.showMessageDialog(null,"UsuarioDAO editar:" + e);
       
    }
        
   }
}
