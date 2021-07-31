package projetoconsultório.Controller;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import projetoconsultório.Model.Endereco;
import projetoconsultório.Util.Conexao;

public class EnderecoController {
    
    
    
    public Boolean cadastrarEndereco(Endereco endereco){
        boolean retorno = false;
        
        String sql = "INSERT INTO endereco (rua, bairro, cidade, estado, cep) VALUES(?,?,?,?,?)";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            sentenca.setString(1, endereco.getRua());
            sentenca.setString(2, endereco.getBairro());
            sentenca.setString(3, endereco.getCidade());
            sentenca.setString(4, endereco.getEstado());
            sentenca.setString(5, endereco.getCep());
            
           if(sentenca.execute()){
                retorno = true;
                
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao cadastrar endereco: \n" + e.getMessage());
        }
        conexao.desconectar();
        
        return retorno;
    }
    
    public Endereco buscarEnderecoPorId(int id){
        Endereco endereco = new Endereco();
        
        String sql = "SELECT * FROM endereco WHERE id = "+id;
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            if(resultSet.next()){
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setBairro(resultSet.getString("bairro"));
                endereco.setCidade(resultSet.getString("cidade"));
                endereco.setEstado(resultSet.getString("estado"));
                endereco.setCep(resultSet.getString("cep"));
            }
        }catch(SQLException e){
            System.out.println("Erro ao buscar endereco: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return endereco;
    }
    
    public ArrayList<Endereco> buscarTodosEnderecos(){
        ArrayList<Endereco> enderecos = new ArrayList<>();
        
        String sql = "SELECT * FROM endereco";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            if(resultSet.next()){
                Endereco endereco = new Endereco();
                
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setBairro(resultSet.getString("bairro"));
                endereco.setCidade(resultSet.getString("cidade"));
                endereco.setEstado(resultSet.getString("estado"));
                endereco.setCep(resultSet.getString("cep"));
                
                enderecos.add(endereco);
            }
        }catch(SQLException e){
            System.out.println("Erro ao buscar enderecos: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return enderecos;
    }
    public Endereco buscarEnderecoPorCep(String cep){
        Endereco endereco = new Endereco();
        
        String sql = "SELECT * FROM endereco WHERE cep = ?";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setString(1, cep);
            ResultSet resultSet = sentenca.executeQuery();
            if(resultSet.next()){
                endereco.setId(resultSet.getInt("id"));
                endereco.setRua(resultSet.getString("rua"));
                endereco.setBairro(resultSet.getString("bairro"));
                endereco.setCidade(resultSet.getString("cidade"));
                endereco.setEstado(resultSet.getString("estado"));
                endereco.setCep(resultSet.getString("cep"));
            }
        }catch(SQLException e){
            System.out.println("Erro ao buscar endereco: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return endereco;
    }
}
