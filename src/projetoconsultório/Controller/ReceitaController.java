
package projetoconsultório.Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetoconsultório.Model.Receita;
import projetoconsultório.Util.Conexao;


public class ReceitaController {
    
    
     public Boolean cadastrarReceita(Receita receita) {
        boolean retorno = false;

        String sql = "INSERT INTO receita (idMedicamento,dosagem,dataReceita) VALUES(?,?,?)";

        Conexao conexao = new Conexao();

        conexao.conectar();

        try {
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            
            for(int i=0;i<receita.getMedicamentos().size();i++) {
                
             sentenca.setInt(1, receita.getMedicamentos().get(i).getId());
             //JOptionPane.showMessageDialog(null,"dentro do for do controller \n"+receita.getMedicamentos().get(i).getNome());
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
