package projetoconsultório.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import projetoconsultório.Model.Paciente;
import projetoconsultório.Util.Conexao;

public class PacienteController {
    public Boolean cadastrarPaciente(Paciente paciente){
        boolean retorno = false;
        
        String sql = "INSERT INTO paciente (nome, cpf, sexo, idEndereco, idPlanoSaude) VALUES(?,?,?,?,?)";
        System.out.print("dentro do insert");
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            sentenca.setString(1, paciente.getNome());   
            sentenca.setString(2, paciente.getCpf());   
            sentenca.setString(3, paciente.getSexo());   
            sentenca.setInt(4, paciente.getIdEndereco());   
            sentenca.setInt(5, paciente.getIdPlanoSaude());   
            
            if(sentenca.execute()){
                retorno = true;
                
            }
            
        }catch(SQLException e){
            System.out.println("Falha ao cadastrar paciente\n Controller" + e.getMessage());
        }
        
        conexao.desconectar();
        return retorno;
    }
    
    
    public Paciente buscarPacientePorId(int id){
        Paciente paciente = new Paciente();

        String sql = "SELECT * FROM paciente WHERE id = ?";
        
        Conexao conexao = new Conexao();

        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setInt(1, id);
            ResultSet resultSet = sentenca.executeQuery();
            if(resultSet.next()){
                paciente.setId(id);
                paciente.setNome(resultSet.getString("nome"));
                paciente.setCpf(resultSet.getString("cpf"));
                paciente.setSexo(resultSet.getString("sexo"));
                paciente.setIdEndereco(resultSet.getInt("idEndereco"));
                paciente.setIdPlanoSaude(resultSet.getInt("idPlanoSaude"));
            }
        }catch(SQLException e){
            System.out.println("Falha ao buscar paciente:\n" + e.getMessage());
        }
        
        conexao.desconectar();
        return paciente;
    }
    
    public ArrayList<Paciente> buscarTodosPacientes(){
        ArrayList<Paciente> pacientes = new ArrayList<>();

        String sql = "SELECT * FROM paciente";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            while(resultSet.next()){
                Paciente paciente = new Paciente();
                
                paciente.setId(resultSet.getInt("id"));
                paciente.setNome(resultSet.getString("nome"));
                paciente.setCpf(resultSet.getString("cpf"));
                paciente.setSexo(resultSet.getString("sexo"));
                paciente.setIdEndereco(resultSet.getInt("idEndereco"));
                paciente.setIdPlanoSaude(resultSet.getInt("idPlanoSaude"));
                
                pacientes.add(paciente);
            }
        }catch(SQLException e){
            System.out.println("Falha ao buscar paciente: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return pacientes;
    }
    
    public Boolean atualizarCadastroPaciente(Paciente paciente){
        boolean retorno = false;
        
        String sql = "UPDATE paciente p set p.nome = ?, p.cpf = ?, p.sexo = ?,"
                + " p.idEndereco= ?, p.idPlanoSaude = ?, WHERE p.id = ?";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setString(1,paciente.getNome());
            sentenca.setString(2,paciente.getCpf());
            sentenca.setString(3,paciente.getSexo());
            sentenca.setInt(4,paciente.getIdEndereco());
            sentenca.setInt(5,paciente.getIdPlanoSaude());
            sentenca.setInt(6, paciente.getId());
            
            if(!sentenca.execute()){
                retorno = true;
            }
        }catch(SQLException e){
            System.out.println("Erro ao atualizar paciente: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return retorno;
    }
}
