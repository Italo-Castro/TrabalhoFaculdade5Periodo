package projetoconsultório.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public Connection con;
    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado!");
        }
        
        String url = "jdbc:mysql://localhost:3306/projetoSG?useTimezone=true&serverTimezone=UTC";
        
        //Marcelo String url = "jdbc:mysql://172.17.0.2:/projetoSG?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "8523";
        try{
            con = DriverManager.getConnection(url, user, password);
        }catch(SQLException e){
            System.out.println("Erro na conexão com Banco de Dados! "+ e.getMessage());
        }
    }
    public void desconectar(){
        try{
            con.close();
        }catch(SQLException e){
            System.out.println("Erro no encerramento da conexão com Banco de Dados!");
        }
    }
}
