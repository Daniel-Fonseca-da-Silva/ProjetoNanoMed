package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class VerificaUsuario {
    
    public static Boolean verificar(String email, String senha)
    {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT email, senha FROM usuario WHERE email = ? AND senha = ?";
        
        email = email;
        senha = senha;
        Boolean logado = null;

        try 
        {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet resultado = stmt.executeQuery();
            
            if(resultado.next())
            {
                logado = true;
                conexao.close();
            }
            else
            {
                logado = false;
                conexao.close();
            }
            
        } 
        catch (SQLException e) 
        {
            e.getMessage();
        }
        return logado;
    }
    
}
