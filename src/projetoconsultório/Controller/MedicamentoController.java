package projetoconsultório.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import projetoconsultório.Model.Medicamento;
import projetoconsultório.Util.Conexao;

public class MedicamentoController {
    public Boolean cadastrarMedicamento(Medicamento medicamento){
        boolean retorno = false;
        
        String sql = "INSERT INTO medicamento (nome) VALUES(?)";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            sentenca.setString(1, medicamento.getNome());         
           
            
            if(sentenca.execute()){
                retorno = true;
            }
        }catch(SQLException e){
            System.out.println("Falha ao cadastrar medicamento: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return retorno;
    }
    
    public ArrayList<Medicamento> buscarMedicamentos(){
        ArrayList<Medicamento> medicamentos = new ArrayList<>();        
        
        String sql = "SELECT * FROM medicamento";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            while(resultSet.next()){
                Medicamento medicamento = new Medicamento();
                
                medicamento.setNome(resultSet.getString("nome"));
                
               
                
                medicamentos.add(medicamento);
            }
        }catch(SQLException e){
            System.out.println("Falha ao cadastrar medicamento: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return medicamentos;
    }
    
    public Medicamento buscarPorId(int id){
        Medicamento medicamento = new Medicamento();
        
        String sql = "SELECT * FROM medicamento WHERE id = ?";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setInt(1, id);
            ResultSet resultSet = sentenca.executeQuery();
            if(resultSet.next()){
                medicamento.setId(id);
                medicamento.setNome(resultSet.getString("nome"));
               
            }
        }catch(SQLException e){
            System.out.println("Falha ao cadastrar medicamento: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return medicamento;
    }
     public Medicamento buscarPorNome(String  nome){
        Medicamento medicamento = null;
        
        String sql = "SELECT * FROM medicamento WHERE nome = ?";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setString(1, nome);
            ResultSet resultSet = sentenca.executeQuery();
            
            if(resultSet.next()){
                medicamento.setId(resultSet.getInt("id"));
                medicamento.setNome(resultSet.getString("nome"));
                
            }
            
        }catch(SQLException e){
            System.out.println("Falha ao buscar medicamento: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return medicamento;
    }
     public Medicamento retornarUltimoCadastrado(){
         String sql = "select * from medicamento order by id desc limit 1";
         Medicamento medicamento = new Medicamento();
         
         Conexao conexao = new Conexao();
        
         conexao.conectar();
         try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            
            if(resultSet.next()){
              medicamento.setId(resultSet.getInt("id"));
              medicamento.setNome(resultSet.getString("nome"));
                
            }
            
        }catch(SQLException e){
            System.out.println("Falha ao buscar medicamento: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return medicamento;
         
     }
}