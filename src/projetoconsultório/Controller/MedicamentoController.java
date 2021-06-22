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
        
        String sql = "INSERT INTO medicamento (nome, dataValidade, bula) VALUES(?,?,?)";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            sentenca.setString(1, medicamento.getNome());
            sentenca.setDate(2, medicamento.getDataValidade());
            sentenca.setString(3, medicamento.getBula());
            
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
                medicamento.setBula(resultSet.getString("bula"));
                medicamento.setDataValidade(resultSet.getDate("dataValidade"));
                
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
                medicamento.setDataValidade(resultSet.getDate("dataValidade"));
                medicamento.setBula(resultSet.getString("bula"));
            }
        }catch(SQLException e){
            System.out.println("Falha ao cadastrar medicamento: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return medicamento;
    }
}