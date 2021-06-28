package projetoconsultório.Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import projetoconsultório.Model.Consulta;
import projetoconsultório.Util.Conexao;

public class ConsultaController {

    public Boolean cadastrarConsulta(Consulta consulta) {
        boolean retorno = false;

        String sql = "INSERT INTO consulta (idMedico, idPaciente, idReceita, relatoPaciente) VALUES(?,?,?,?)";

        Conexao conexao = new Conexao();

        conexao.conectar();

        try {
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);

            sentenca.setInt(1, consulta.getIdMedico().getId());
            sentenca.setInt(2, consulta.getIdPaciente().getId());
            sentenca.setInt(3, consulta.getIdReceita().getId());
            sentenca.setString(4, consulta.getRelatoPaciente());

            if (sentenca.execute()) {
                retorno = true;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: \n" + e.getMessage());
        }

        conexao.desconectar();
        return retorno;
    }

    public Consulta buscarConsultaPorId(int id) {
        Consulta consulta = new Consulta();

        String sql = "SELECT * FROM consulta WHERE id = ?";

        Conexao conexao = new Conexao();

        conexao.conectar();

        try {
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            sentenca.setInt(1, id);
            ResultSet resultSet = sentenca.executeQuery();
            if (resultSet.next()) {
                consulta.setIdConsulta(id);
                consulta.getIdMedico().setId(resultSet.getInt("idMedico"));
                consulta.getIdPaciente().setId(resultSet.getInt("idPaciente"));
                consulta.getIdReceita().setId(resultSet.getInt("idReceita"));
                consulta.setRelatoPaciente(resultSet.getString("relatoPaciente"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar endereco: \n" + e.getMessage());
        }
        conexao.desconectar();

        return consulta;
    }

    public ArrayList<Consulta> buscarConsultas() {
        ArrayList<Consulta> consultas = new ArrayList<>();

        String sql = "SELECT * FROM consulta";

        Conexao conexao = new Conexao();

        conexao.conectar();

        try {
            PreparedStatement sentenca = conexao.con.prepareStatement(sql);
            ResultSet resultSet = sentenca.executeQuery();
            while (resultSet.next()) {
                Consulta consulta = new Consulta();

                consulta.setIdConsulta(resultSet.getInt("id"));
                consulta.getIdPaciente().setId(resultSet.getInt("idPaciente"));
                consulta.getIdReceita().setId(resultSet.getInt("idReceita"));
                consulta.setRelatoPaciente(resultSet.getString("relatoPaciente"));
                consulta.setRelatoPaciente(resultSet.getString("relatoPaciente"));
                
                consultas.add(consulta);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar endereco: \n" + e.getMessage());

        }

        conexao.desconectar();
        return consultas;
    }
}
