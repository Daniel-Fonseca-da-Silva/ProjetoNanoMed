/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;

public class Testa {

    public static void main(String[] args) throws SQLException {
        
            
    Connection conexao = FabricaConexao.getConexao();
	
    System.out.println("Conexao efetuada com sucesso");
		
    conexao.close();
        
    }
    
}
