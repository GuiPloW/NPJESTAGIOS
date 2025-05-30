package controller;

import dao.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement; // Adicione esta linha
import java.sql.ResultSet;
import java.sql.SQLException;

public class CLogin {
    public void cadastrarNovoUsuario(String nome, String matricula, String email, String senha, String semestre) throws SQLException {
        String sql = "INSERT INTO pessoa (nome, matricula, email, senha, semestre) VALUES (?, ?, ?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = ConexaoDAO.getConnection(); // Obtém a conexão usando sua classe DAO
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nome);
            pstmt.setString(2, matricula);
            pstmt.setString(3, email);
            pstmt.setString(4, senha);
            pstmt.setString(5, semestre);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            // É importante relançar a exceção para que a camada de visualização possa tratá-la
            throw e;
        } finally {
            // Certifique-se de fechar a conexão e o PreparedStatement no bloco finally
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Log da exceção ao fechar (pode ser ignorado na maioria dos casos)
            }
        }
    }
    
    public boolean verificarLogin(String matricula, String senha) {
        String sql = "SELECT * FROM pessoa WHERE matricula = ? AND senha = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = ConexaoDAO.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, matricula);
            pstmt.setString(2, senha);
            rs = pstmt.executeQuery();

            return rs.next(); // Retorna true se um registro correspondente for encontrado
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Em caso de erro, retorna false
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}