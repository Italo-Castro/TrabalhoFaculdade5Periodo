package projetoconsultório.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetoconsultório.Model.Medico;
import projetoconsultório.Util.Conexao;


public class MedicoController {
    public Boolean cadastrarMedico(Medico medico){
        boolean retorno = false;
        
        String sql = "INSERT INTO medico (nome, dataNascimento, especializacao, sexo, disponibilidade, cpf) VALUES(?,?,?,?,?,?)";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            sentenca.setString(1, medico.getNome());   
            //sentenca.setDate(2,  medico.getDataNascimento());   
            sentenca.setString(3, medico.getEspecializacao());   
            sentenca.setString(4, medico.getSexo());   
            sentenca.setBoolean(5, medico.isDisponibilidade());   
            sentenca.setString(6, medico.getCpf());
            
            if(sentenca.execute()){
                retorno = true;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Falha ao cadastra médico \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return retorno;
    }
    
    
    public Medico buscarPorId(int id){
        Medico medico = new Medico();

        String sql = "SELECT * FROM medico WHERE id = ?";
        
        Conexao conexao = new Conexao();

        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setInt(1, id);
            ResultSet resultSet = sentenca.executeQuery();
            if(resultSet.next()){
                medico.setId(id);
                medico.setNome(resultSet.getString("nome"));
                medico.setCpf(resultSet.getString("cpf"));
                medico.setDataNascimento(resultSet.getDate("dataNascimento"));
                medico.setSexo(resultSet.getString("sexo"));
                medico.setDisponibilidade(resultSet.getBoolean("disponibilidade"));
                medico.setEspecializacao(resultSet.getString("especializacao"));
            }
        }catch(SQLException e){
            System.out.println("Falha ao buscar medico:\n" + e.getMessage());
        }
        
        conexao.desconectar();
        return medico;
    }
    
    public ArrayList<Medico> buscarTodosMedicos(){
        ArrayList<Medico> medicos = new ArrayList<>();

        String sql = "SELECT * FROM medico";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            while(resultSet.next()){
                Medico medico = new Medico();
                
                medico.setId(resultSet.getInt("id"));
                medico.setNome(resultSet.getString("nome"));
                medico.setCpf(resultSet.getString("cpf"));
                medico.setDataNascimento(resultSet.getDate("dataNascimento"));
                medico.setSexo(resultSet.getString("sexo"));
                medico.setEspecializacao(resultSet.getString("especializacao"));
                medico.setDisponibilidade(resultSet.getBoolean("disponibilidade"));
                
                medicos.add(medico);
            }
        }catch(SQLException e){
            System.out.println("Falha ao buscar médicos: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return medicos;
    }
    
    public Boolean atualizarCadastroMedico(Medico medico){
        boolean retorno = false;
        
        String sql = "UPDATE medico m set m.nome = ?, m.cpf = ?, m.dataNascimento = ?, m.sexo = ?,"
                + " m.especializacao = ?, m.disponibilidade = ?, WHERE m.id = ?";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setInt(1, medico.getId());
            sentenca.setString(1,medico.getNome());
            sentenca.setString(2,medico.getCpf());
            
            //sentenca.setDate(3,medico.getDataNascimento());
            
            sentenca.setString(4,medico.getSexo());
            sentenca.setString(5,medico.getEspecializacao());
            sentenca.setBoolean(6,medico.isDisponibilidade());
            
            if(!sentenca.execute()){
                retorno = true;
            }
        }catch(SQLException e){
            System.out.println("Erro ao atualizar médico: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return retorno;
    }
}