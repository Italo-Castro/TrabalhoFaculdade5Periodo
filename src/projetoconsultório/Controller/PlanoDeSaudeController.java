
package projetoconsultório.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import projetoconsultório.Model.PlanoDeSaude;
import projetoconsultório.Util.Conexao;

public class PlanoDeSaudeController {
    
    public Boolean cadastrarPlanoSaude(PlanoDeSaude plano){
        boolean retorno = false;
        
        String sql = "INSERT INTO planosaude (tipo, dataExpiracao, valor) VALUES(?,?,?)";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            sentenca.setString(1, plano.getTipo());   
            sentenca.setDate(2, plano.getDataExpiracao());   
            sentenca.setDouble(3, plano.getValor());   
            
            if(sentenca.execute()){
                retorno = true;
            }
            
        }catch(SQLException e){
            System.out.println("Falha ao cadastra Plano:\n" + e.getMessage());
        }
        
        conexao.desconectar();
        return retorno;
    }
    
    
    public PlanoDeSaude buscarPorId(int id){
        PlanoDeSaude plano = new PlanoDeSaude();

        String sql = "SELECT * FROM planosaude WHERE id = ?";
        
        Conexao conexao = new Conexao();

        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setInt(1, id);
            ResultSet resultSet = sentenca.executeQuery();
            if(resultSet.next()){
                plano.setId(id);
                plano.setDataExpiracao(resultSet.getDate("dataExpiracao"));
                plano.setTipo(resultSet.getString("tipo"));
                plano.setValor(resultSet.getDouble("valor"));
            }
        }catch(SQLException e){
            System.out.println("Falha ao buscar Plano:\n" + e.getMessage());
        }
        
        conexao.desconectar();
        return plano;
    }
    
    public ArrayList<PlanoDeSaude> buscarPlanoSaude(){
        ArrayList<PlanoDeSaude> planos = new ArrayList<>();

        String sql = "SELECT * FROM planosaude";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            while(resultSet.next()){
                PlanoDeSaude plano = new PlanoDeSaude();
                
                plano.setId(resultSet.getInt("id"));
                plano.setDataExpiracao(resultSet.getDate("dataExpiracao"));
                plano.setTipo(resultSet.getString("tipo"));
                plano.setValor(resultSet.getDouble("valor"));
                
                planos.add(plano);
            }
        }catch(SQLException e){
            System.out.println("Falha ao buscar planos: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return planos;
    }
    
    public Boolean atualizarPlanoSaude(PlanoDeSaude plano){
        boolean retorno = false;
        
        String sql = "UPDATE plano p set p.dataExpiracao = ?, p.tipo = ?, p.valor = ? WHERE id = ?";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setDate(1, plano.getDataExpiracao());
            sentenca.setString(2,plano.getTipo());
            sentenca.setDouble(3,plano.getValor());
            sentenca.setInt(4,plano.getId());
            
            if(!sentenca.execute()){
                retorno = true;
            }
        }catch(SQLException e){
            System.out.println("Erro ao atualizar plano: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return retorno;
    }
    
    public PlanoDeSaude buscarPlanoSaudePorTipo(String tipo){
        PlanoDeSaude plano = new PlanoDeSaude();
        
        String sql = "SELECT * FROM planoSaude where tipo = '"+tipo+"'";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            while(resultSet.next()){
                
                
                plano.setId(resultSet.getInt("id"));
                plano.setDataExpiracao(resultSet.getDate("dataExpiracao"));
                plano.setTipo(resultSet.getString("tipo"));
                plano.setValor(resultSet.getDouble("valor"));
                
                
            }
        }catch(SQLException e){
            System.out.println("Falha ao buscar planos: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return plano;
    }
}
