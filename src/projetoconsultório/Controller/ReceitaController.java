
package projetoconsultório.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetoconsultório.Model.Medicamento;
import projetoconsultório.Model.Receita;
import projetoconsultório.Util.Conexao;


public class ReceitaController {
    
    
    
    
    
     public Boolean cadastrarReceita(Receita receita) {
        boolean retorno = false;

        String sql = "INSERT INTO receita (dataReceita) VALUES(?)";

        Conexao conexao = new Conexao();

        conexao.conectar();

        try {
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setDate(1,(java.sql.Date) receita.getDataReceita());
              
            
            if (sentenca.execute()) {
                retorno = true;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar receita -> \n" + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }
    public Receita getLastId() {
        Receita receita = new Receita();
         String sql = "select * from receita order by id desc limit 1";
         
         int id = 0;
         Conexao conexao = new Conexao();
        
         conexao.conectar();
         try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            
            if(resultSet.next()){
             receita.setId(resultSet.getInt("id"));
            
                
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao buscar ultimo id da receita -> \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return receita;
         
     }
    
   public Boolean insertRevenue(Receita receita) {
        boolean retorno = false;

        String sql = "INSERT INTO receita (idMedicamento,dosagem,dataReceita) VALUES(?,?,?)";

        Conexao conexao = new Conexao();

        conexao.conectar();

        try {
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            for(int i=0;i<receita.getMedicamentos().size();i++) {
                
             sentenca.setInt(1, receita.getMedicamentos().get(i).getId());
             JOptionPane.showMessageDialog(null,"dentro do for do controller \n"+receita.getMedicamentos().get(i).getNome());
             sentenca.setString(2, receita.getDosagem());
             sentenca.setDate(3,(java.sql.Date) receita.getDataReceita());
            
            }
            if (sentenca.execute()) {
                retorno = true;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: \n" + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }
}
