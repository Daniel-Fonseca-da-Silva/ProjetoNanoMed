
package model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author sudosu
 */
public class CadastrarUsuario {
    
    public static Boolean Cadastrar(String nome, String email, String senha)
    {
        Boolean cad = null;
        Connection conexao = FabricaConexao.getConexao();
        String sql = "INSERT INTO usuario (nome, email, senha) values(?, ?, ?)";
        
        try 
        {

            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, String.valueOf(senha));
            stmt.execute();
                
            
            if(stmt.equals(true))
            {
                cad = false;
                System.out.println(cad);
            }
            else
            {
                cad = true;
                System.out.println(cad);
            }
        } 
        catch (SQLException e)
        {
           e.getMessage();
        }
        return cad;
    }
    
}
