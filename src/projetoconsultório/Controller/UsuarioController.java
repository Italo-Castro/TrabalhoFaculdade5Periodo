
package projetoconsultório.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import projetoconsultório.Model.Usuario;
import projetoconsultório.Util.Conexao;

public class UsuarioController {
    public Boolean cadastrarUsuario(Usuario usuario){
        boolean retorno = false;
        
        String sql = "INSERT INTO usuario (nome, senha, nivelPermissao) VALUES(?,?,?)";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            sentenca.setString(1, usuario.getNome());   
            sentenca.setString(2, usuario.getSenha());   
            sentenca.setInt(3, usuario.getNivelPermissao());   
            
            if(sentenca.execute()){
                retorno = true;
            }
            
        }catch(SQLException e){
            System.out.println("Falha ao cadastrar Usuário:\n" + e.getMessage());
        }
        
        conexao.desconectar();
        return retorno;
    }
    
    
    public Usuario buscarPorId(int id){
        Usuario usuario = new Usuario();

        String sql = "SELECT * FROM usuario WHERE id = ?";
        
        Conexao conexao = new Conexao();

        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setInt(1, id);
            ResultSet resultSet = sentenca.executeQuery();
            if(resultSet.next()){
                usuario.setId(id);
                usuario.setNome(resultSet.getString("nome"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setNivelPermissao(resultSet.getInt("nivelPermissao"));
            }
        }catch(SQLException e){
            System.out.println("Falha ao buscar Usuario:\n" + e.getMessage());
        }
        
        conexao.desconectar();
        return usuario;
    }
    
    public ArrayList<Usuario> buscarTodosMedicos(){
        ArrayList<Usuario> usuarios = new ArrayList<>();

        String sql = "SELECT * FROM usuario";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            while(resultSet.next()){
                Usuario usuario = new Usuario();
                
                usuario.setId(resultSet.getInt("id"));
                usuario.setNome(resultSet.getString("nome"));
                usuario.setSenha(resultSet.getString("senha"));
                usuario.setNivelPermissao(resultSet.getInt("nivelPermissao"));
                
                usuarios.add(usuario);
            }
        }catch(SQLException e){
            System.out.println("Falha ao buscar Usuário: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return usuarios;
    }
    
    public Boolean atualizarCadastroUsuario(Usuario usuario){
        boolean retorno = false;
        
        String sql = "UPDATE usuario u set u.nome = ?, u.senha = ?, u.nivelPermissao = ? WHERE u.id = ?";
        
        Conexao conexao = new Conexao();
        
        conexao.conectar();
        
        try{
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setString(1,usuario.getNome());
            sentenca.setString(2,usuario.getSenha());
            sentenca.setInt(3,usuario.getNivelPermissao());
            sentenca.setInt(4, usuario.getId());
            
            if(!sentenca.execute()){
                retorno = true;
            }
        }catch(SQLException e){
            System.out.println("Erro ao atualizar usuário: \n" + e.getMessage());
        }
        
        conexao.desconectar();
        return retorno;
    }
}
