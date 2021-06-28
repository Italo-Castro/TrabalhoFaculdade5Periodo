package projetoconsultório.Model;

public class Consulta {

    private int id;
    private Medico idMedico;
    private Paciente idPaciente;
    private Receita idReceita;
    private String relatoPaciente;

    public Consulta() {
        this.idPaciente = new Paciente();
        this.relatoPaciente = "";
        this.idReceita = new Receita();
        this.idMedico = new Medico();
    }

    public Consulta(Medico idMedico, Paciente idPaciente, String relatoPaciente, Receita idReceita) {
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.relatoPaciente = relatoPaciente;
        this.idReceita = idReceita;
    }

    public int getIdConsulta() {
        return id;
    }

    public void setIdConsulta(int idConsulta) {
        this.id = idConsulta;
    }

    public String getRelatoPaciente() {
        return relatoPaciente;
    }

    public void setRelatoPaciente(String relatoPaciente) {
        this.relatoPaciente = relatoPaciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Medico getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Medico idMedico) {
        this.idMedico = idMedico;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Receita getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(Receita idReceita) {
        this.idReceita = idReceita;
    }
    
   
}
