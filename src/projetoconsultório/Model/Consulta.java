package projetoconsultório.Model;

public class Consulta {

    private int idConsulta;
    private int idMedico;
    private int idPaciente;
    private String relatoPaciente;
    private int idReceita;

    public Consulta() {
        this.idPaciente = 0;
        this.relatoPaciente = "";
        this.idReceita = 0;
    }

    public Consulta(int idMedico, int idPaciente, String relatoPaciente, int idReceita) {
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.relatoPaciente = relatoPaciente;
        this.idReceita = idReceita;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getRelatoPaciente() {
        return relatoPaciente;
    }

    public void setRelatoPaciente(String relatoPaciente) {
        this.relatoPaciente = relatoPaciente;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

}
