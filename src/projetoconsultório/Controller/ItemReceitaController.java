
package projetoconsultório.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import projetoconsultório.Model.ItemReceita;
import projetoconsultório.Util.Conexao;


public class ItemReceitaController {
    
     public Boolean insertItemReceitaID(ItemReceita itemReceita,int idItemReceita) {
        boolean retorno = false;

        String sql = "INSERT INTO itensReceita (idMedicamento, idReceita,idItemReceita) VALUES(?,?,?) where idItemReceita = ?";

        Conexao conexao = new Conexao();

        conexao.conectar();

        try {
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            sentenca.setInt(1, itemReceita.getIdMedicamento().getId());
            sentenca.setInt(2, itemReceita.getIdReceita().getId());
            sentenca.setInt(3, itemReceita.getIdItemReceita());
            sentenca.setInt(4, idItemReceita);

            if (sentenca.execute()) {
                retorno = true;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar itemReceita -> \n" + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }
     
    
     public Boolean insertItemReceita(ItemReceita itemReceita) {
        boolean retorno = false;

        String sql = "INSERT INTO itensReceita (idReceita,coditem,dosagem) VALUES(?,?,?)";

        Conexao conexao = new Conexao();

        conexao.conectar();

        try {
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            
            sentenca.setInt(1, itemReceita.getIdReceita().getId());
            sentenca.setInt(2, itemReceita.getIdMedicamento().getId());
            sentenca.setString(3, itemReceita.getDosagem());

            if (sentenca.execute()) {
                retorno = true;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar itemReceita: \n" + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }
    public int getLastId() {
        
         String sql = "select * from itensReceita order by id desc limit 1";
         
         int id = 0;
         Conexao conexao = new Conexao();
        
         conexao.conectar();
         try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            
            if(resultSet.next()){
              id =  resultSet.getInt("id");
            
                
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao buscar ultimo id do itemReceita: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return id;
         
     }
    
    
}
